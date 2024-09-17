package com.example.demo.animalAPI.repository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.animalAPI.data.AnimalData;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalRepository {
	public AnimalData[] getAnimals() throws IOException {
		//APIのURL
		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI";

		//getForEntityめそっどを使用する為にインスタンス生成する。
		RestTemplate rest = new RestTemplate();
		//リクエストを送信するためにgetForEntityめそっどを使用する
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		System.out.println(response);
		//response.getBody()でレスポンスボディを取得。
		String json = response.getBody();
		System.out.println(json);
		//readValueメソッドを使用する為にインスタンス生成する
		ObjectMapper mapper = new ObjectMapper();
		//AnimalData型配列への変換
		AnimalData[] animalsList = mapper.readValue(json, AnimalData[].class);
		
		return animalsList;

	}

	public AnimalData[] getAnimalDetails(String id) throws IOException {
		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI?id=" + id;
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		String json = response.getBody();
		ObjectMapper mapper = new ObjectMapper();
		AnimalData[] animalDetails = mapper.readValue(json, AnimalData[].class);
		return animalDetails;
	}

}
