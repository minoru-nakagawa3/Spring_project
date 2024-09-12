package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {
	private final MinusService minusService;

	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("minus")

	public String minusPage() {
		return "minus.html";
	}

	@PostMapping("minusCalc")
	public String minusCalc(@RequestParam("leftNum") int leftNum,
			@RequestParam("rightNum") int rightNum, Model model) {
		int result = minusService.minusCalculation(leftNum, rightNum);

		System.out.println(result);
		model.addAttribute("result", result);
		return "minus.html";
	}
}
