package com.upendra.rai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upendra.rai.entities.Test;
import com.upendra.rai.services.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping
	public List<Test> getAll() {
		return testService.getAll();
	}

	@PostMapping
	public Test saveData(@RequestBody Test test) {
		return testService.saveData(test);
	}

}
