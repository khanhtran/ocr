package com.earthteam.ocr.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.earthteam.ocr.domain.Category;
import com.earthteam.ocr.domain.Timespan;
import com.earthteam.ocr.service.CategoryService;
import com.earthteam.ocr.service.TimespanService;

@Component
public class TimespanFormatter implements Formatter<Timespan> {

	@Autowired
	private TimespanService timespanService;

	@Override
	public String print(Timespan timespan, Locale locale) {
		return timespan.getId() + "";
	}

	@Override
	public Timespan parse(String text, Locale locale) throws ParseException {
		Timespan timespan = timespanService.getById(Integer.parseInt(text));
		return timespan;
	}

}
