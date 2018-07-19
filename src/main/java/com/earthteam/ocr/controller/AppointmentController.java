package com.earthteam.ocr.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.earthteam.ocr.viewmodels.AppointmentViewModel;
import com.earthteam.ocr.domain.Appointment;
import com.earthteam.ocr.domain.Category;
import com.earthteam.ocr.domain.Doctor;
import com.earthteam.ocr.domain.Patient;
import com.earthteam.ocr.domain.Timespan;
import com.earthteam.ocr.service.AppointmentService;
import com.earthteam.ocr.service.CategoryService;
import com.earthteam.ocr.service.DoctorService;
import com.earthteam.ocr.service.PatientService;
import com.earthteam.ocr.service.TimespanService;

/**
 * 
 * @author Carlos Miguel Valderrama Vega - cvalderramav@gmail.com
 *
 *
 */
@Controller
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;

	@Autowired
	private TimespanService timespanService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PatientService patientService;

	@ModelAttribute("categories")
	public List<Category> getCategories() {
		return categoryService.findAll();
	}

//	@ModelAttribute("doctors")
//	public List<Doctor> getDoctors() {
//		return doctorService.findAll();
//	}

	@ModelAttribute("timespans")
	public List<Timespan> getTimespans() {
		return timespanService.findAll();
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addAppointment(@RequestParam(value = "categoryId", required = false) Integer categoryId,
			@RequestParam(value = "doctorId", required = false) Long doctorId,
			@RequestParam(value = "timespanId", required = false) String strTimespanId,
			@RequestParam(value = "date", required = false) String strDate, RedirectAttributes redirectAttributes,
			Model model) {
//		categoryId
		model.addAttribute("categoryId", categoryId);
		model.addAttribute("date", strDate);
//		doctors
		List<Doctor> doctors;
		if (categoryId != null && categoryId > 0) {
			doctors = doctorService.findByCategory(categoryId);
		} else {
			doctors = doctorService.findAll();
		}
		model.addAttribute("doctors", doctors);

		Doctor doctor = null;
		if (doctorId != null && doctorId > 0) {
			List<Doctor> tmp = doctors.stream().filter((Doctor d) -> d.getId() == doctorId)
					.collect(Collectors.toList());
			if (tmp.size() > 0) {
				doctor = tmp.get(0);
				model.addAttribute("doctor", doctor);
			}
		}
//		doctorId
		model.addAttribute("doctorId", doctorId);
//		timespans
		Date date = null;
		List<Timespan> timespans = null;
		if (doctor != null && strDate != null) {
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
			try {
				date = format.parse(strDate);
				timespans = doctor.getAvailableTimespans();
				List<Appointment> appointments = appointmentService.findByDoctorIdAndDate(doctor.getId(),
						toSqlDate(date));
				List<Integer> occupiedTimespanIds = new ArrayList<>();
				appointments.forEach((Appointment a) -> occupiedTimespanIds.add(a.getTimeSpan().getId()));

				for (int i = 0; i < timespans.size(); i++) {
					Timespan t = timespans.get(i);
					if (occupiedTimespanIds.contains(t.getId())) {
						t.setAvailable(false);
					}
				}
				model.addAttribute("timespans", timespans);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
//		timespanId
		int timespanId = 0;
		Timespan timespan = null;
		if (strTimespanId != null && !strTimespanId.isEmpty()) {
			timespanId = Integer.parseInt(strTimespanId);
			for (int i = 0; i < timespans.size(); i++) {
				if (timespans.get(i).getId() == timespanId) {
					timespan = timespans.get(i);
					break;
				}
			}
		}
		if (doctor != null && date != null && timespan != null) {
			Appointment appointment = new Appointment();
			appointment.setDate(toSqlDate(date));
			appointment.setDoctor(doctor);
			appointment.setTimeSpan(timespan);
			appointment.setPatient(getLoggedInPatient());
			appointmentService.save(appointment);
			redirectAttributes.addFlashAttribute("appointment", appointment);
			return "redirect:/appointment/appointment-result";
		} else {
			return "appointment/make-appointment";
		}
	}

	@RequestMapping(value = "/appointment-result")
	public String result() {
		return "appointment/appointment-result";
	}

	private Patient getLoggedInPatient() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		return patientService.getPatientByUserName(username);
	}

	private java.sql.Date toSqlDate(Date date) {
		return new java.sql.Date(date.getTime());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String checkAppointment(@ModelAttribute("newAppointment") AppointmentViewModel appointment, Model model) {

		return "appointment/check-spans";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveAppointment(@ModelAttribute("newAppointment") AppointmentViewModel appointment, Model model) {

		return "appointment/save-appointment-result";
	}
}
