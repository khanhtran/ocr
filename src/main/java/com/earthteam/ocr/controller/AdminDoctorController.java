package com.earthteam.ocr.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.earthteam.ocr.domain.Category;
import com.earthteam.ocr.domain.Doctor;
import com.earthteam.ocr.domain.Timespan;
import com.earthteam.ocr.service.TimespanService;

/**
 * 
 * @author Cong Khanh Tran - trancongkhanh@gmail.com
 *
 *
 */
@Controller
@RequestMapping("/admin/doctors")
public class AdminDoctorController {
	@Autowired
	private TimespanService timespanService;
	
	@Autowired
	private CategoryService categoryService;
	
	@ModelAttribute("categories")
	public List<Category> getCategories() {
		return categoryService.findAll();
	}
	
	@ModelAttribute("timespans")
	public List<Timespan> getTimespans() {
		return timespanService.findAll();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addDoctor(@ModelAttribute("doctor") @Valid Doctor doctor) {
		return "admin/add_doctor";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveDoctor(@ModelAttribute("doctor") @Valid Doctor doctor, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		
		return "admin/save_doctor";
	}
}
