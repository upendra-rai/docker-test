package com.upendra.rai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upendra.rai.entities.Test;
import com.upendra.rai.repositories.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;

	public List<Test> getAll() {
		return testRepository.getAll();
	}

	public Test saveData(Test test) {
		testRepository.save(test);
		return test;
	}

}
