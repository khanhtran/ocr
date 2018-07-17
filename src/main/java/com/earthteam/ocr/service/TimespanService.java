package com.earthteam.ocr.service;

import java.util.List;

import com.earthteam.ocr.domain.Timespan;

public interface TimespanService {
	List<Timespan> findAll();

	Timespan getById(int id);
}
