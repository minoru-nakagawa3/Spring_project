package com.example.demo.animalAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.animalAPI.data.AnimalData;
import com.example.demo.animalAPI.service.AnimalService;

@Controller
public class AnimalController {

	private AnimalService animalService;

	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;

	}

	@GetMapping("animal-search")
	public String AnimalPage(Model model) throws IOException {
		List<AnimalData> animalList = animalService.getAnimals();
		
		model.addAttribute("animalsList", animalList);
		System.out.println(animalList);
		return "animal-search.html";
	}

	@PostMapping("Detail")
	public String getId(@RequestParam("id") String id,Model model) throws IOException {
		System.out.println(id);
		List<AnimalData> animalDetail = animalService.getAnimalDetail(id);
		
		model.addAttribute("animalDetail",animalDetail);
		System.out.println(animalDetail);
		return "animal-detail.html";

	}

}
