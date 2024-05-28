package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/get")
	public String Sample() {
		int sum = getSum(2, 3);
		String message = "はじめてのSpring<br>"+ "kawanoです。" + sum;
		return message;
	}
	public int getSum(int a, int b) {
		return a + b;
	}
}
//意味わかんねーよ

