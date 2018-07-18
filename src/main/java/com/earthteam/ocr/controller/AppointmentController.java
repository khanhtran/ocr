package com.earthteam.ocr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.earthteam.ocr.viewmodels.AppointmentViewModel;
import com.earthteam.ocr.domain.Category;
import com.earthteam.ocr.domain.Doctor;
import com.earthteam.ocr.domain.Timespan;
import com.earthteam.ocr.service.AppointmentService;
import com.earthteam.ocr.service.CategoryService;
import com.earthteam.ocr.service.DoctorService;
import com.earthteam.ocr.service.TimespanService;

/**
 * 
 * @author Carlos Miguel Valderrama Vega  - cvalderramav@gmail.com
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
	
	@ModelAttribute("categories")
	public List<Category> getCategories() {
		return categoryService.findAll();
	}
	
	@ModelAttribute("doctors")
	public List<Doctor> getDoctors() {
		return doctorService.findAll();
	}
	
	@ModelAttribute("timespans")
	public List<Timespan> getTimespans() {
		return timespanService.findAll();
	}	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addAppointment(@ModelAttribute("newAppointment") AppointmentViewModel appointment, Model model) {

		return "appointment/make-appointment";
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
