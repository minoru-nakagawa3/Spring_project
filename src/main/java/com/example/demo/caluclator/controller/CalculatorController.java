package com.example.demo.caluclator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.caluclator.service.CalculatorService;

@Controller
public class CalculatorController {
	//CalculatorServiceクラスを使えるようにする為にインスタンスを生成して初期化
	private CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	//このページに飛ぶ
	@GetMapping("Calclator")
	public String CalculatorPage() {

		return "calclator.html";
	}

	//送信されたデータを受け取る
	@PostMapping("Calulation")
	public String calclation(@RequestParam("leftNum") int leftNum,
			@RequestParam("operations") String operations,
			@RequestParam("rightNum") int rightNum,
			Model model) {

		//例外が発生しうるコードをtryの中に書く
		try {
			int result = calculatorService.fourCalculation(leftNum, operations, rightNum);

			model.addAttribute("result", result);
		}
		//catchで例外をつぶす & 処理の内容を書く
		catch (ArithmeticException e) {
			
			model.addAttribute("error", "ゼロ除算はできません");
		}
		return "calclator.html";

	}
}
