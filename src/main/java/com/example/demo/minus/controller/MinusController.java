package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MinusController {
	@GetMapping("minus")

	public String minusPage() {
		return "minus.html";
	}


	@PostMapping("minusCalc")
	public String minusCalc (@RequestParam("leftNum") int leftNum,
	@RequestParam("raightNum")
	int raightNum,Model model){
	{
	}
	return null;	 
	}
	}
