package com.upendra.rai.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.upendra.rai.entities.Test;

@Repository
public class TestRepository {

	List<Test> dataList = new ArrayList<>();

	public List<Test> getAll() {
		List<Test> testList = List.of(new Test(1L, "John Doe", "1234 Elm St"),
				new Test(2L, "Jane Smith", "5678 Oak St"), new Test(3L, "Michael Johnson", "9101 Pine St"),
				new Test(4L, "Emily Davis", "1121 Maple St"), new Test(5L, "Chris Brown", "3141 Birch St"),
				new Test(6L, "Jessica White", "5161 Cedar St"), new Test(7L, "David Wilson", "7181 Redwood St"),
				new Test(8L, "Sophia Martinez", "9201 Spruce St"), new Test(9L, "James Miller", "1221 Fir St"),
				new Test(10L, "Linda Anderson", "3241 Cypress St"));
		dataList.addAll(testList);
		return dataList;
	}

	public Test save(Test test) {
		dataList.add(test);
		return test;
	}

}
