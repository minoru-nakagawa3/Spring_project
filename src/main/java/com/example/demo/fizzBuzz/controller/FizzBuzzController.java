package com.example.demo.fizzBuzz.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {
	private final FizzBuzzService fizzBuzzService;

	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}

	@GetMapping("FizzBuzz")
	public String fizzBuzzController(Model model) {
		List<String> numsList = fizzBuzzService.numList();
		System.out.println(Arrays.asList(numsList));
		model.addAttribute("numsList", numsList);
		return "fizzBuzz.html";
	}
}
