package com.example.demo.animalAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalAPI.data.AnimalData;
import com.example.demo.animalAPI.repository.AnimalRepository;

@Service
public class AnimalService {
	private AnimalRepository animalRepository;

	public AnimalService(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;

	}

	public  List<AnimalData> getAnimals() throws IOException {

		AnimalData[] animalsList = animalRepository.getAnimals();
		return Arrays.asList(animalsList);

	}
	public List<AnimalData> getAnimalDetail(String id) throws IOException{
		AnimalData[] animalDetail = animalRepository.getAnimalDetails(id);
		return Arrays.asList(animalDetail);
		
	}
}
