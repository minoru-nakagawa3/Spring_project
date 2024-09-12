package com.example.demo.animalAPI.service;

import org.springframework.stereotype.Service;

import com.example.demo.animalAPI.repository.AnimalRepository;

@Service
public class AnimalService {
	private AnimalRepository animalRepository;
	
	public AnimalService(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;
		
	}
}
