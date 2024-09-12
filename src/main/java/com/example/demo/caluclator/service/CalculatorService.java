package com.example.demo.caluclator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	//throwsで呼び出し元のファイルに出るであろう例外の処理をcatchにわたす。
	public int fourCalculation(int leftNum, String operations, int rightNum) throws ArithmeticException {
		int result = 0;
		if (operations.equals("＋")) {
			result = leftNum + rightNum;

		} else if (operations.equals("ー")) {
			result = leftNum - rightNum;

		} else if (operations.equals("×")) {
			result = leftNum * rightNum;

		} else if (operations.equals("÷")) {
			result = leftNum / rightNum;
		}
		return result;

	}

}
