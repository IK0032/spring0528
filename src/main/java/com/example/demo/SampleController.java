package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/get")
	public String Sample() {
		int sum = getSum(2, 3);
		
		String message = "はじめてのSpring<br>"+ "kawanoです。" + sum+"<br>";
		
		for (int i=0;i<5;i++) {
			message+="ごめんなさい<br>";
		}
		return message;
	}
	public int getSum(int a, int b) {
		return a + b + 100;
	}
}
//意味わかんねーよ

