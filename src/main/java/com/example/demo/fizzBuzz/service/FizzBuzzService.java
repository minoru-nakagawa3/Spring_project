package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
	public List<String> numList() {
		List<String> nums = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {

				nums.add("FizzBuzz");

			} else if (i % 3 == 0) {

				nums.add("Fizz");

			} else if (i % 5 == 0) {
				nums.add("Buzz");

			} else {
				nums.add(String.valueOf(i));
			}
		}
		return nums;

	}
}
