package com.example.demo.animalAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.animalAPI.service.AnimalService;

@Controller
public class AnimalController {
	
	private AnimalService animalService;
	
	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;
		
	}
	@GetMapping("animal-search")
	public String AnimalPage() {

		return "animal-search.html";
	}
}
