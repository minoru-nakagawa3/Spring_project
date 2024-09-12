package com.example.demo.sampleAPI.repository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.sampleAPI.data.Animals;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class SampleAPIRepository {

	public Animals[] getAnimals() throws IOException {
		//APIのURL
		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI";
		//リクエスト送信の為にインスタンス生成
		RestTemplate rest = new RestTemplate();
		//APiとの通信と取得
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		//
		String json = response.getBody();
		System.out.println(json);
		
		ObjectMapper mapper = new ObjectMapper();
		//配列に複数のインスタンスを格納する。
		Animals[] animalsList = mapper.readValue(json, Animals[].class);
		return animalsList;
	}

}
