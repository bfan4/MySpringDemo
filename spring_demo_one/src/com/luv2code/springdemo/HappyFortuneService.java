package com.luv2code.springdemo;
import java.util.Random;

public class HappyFortuneService implements FortuneService {

	
	
	private String[] fortuneValueStrings = new String[] {"Today is your lucky day!", "Today is your very lucky day!", "Today is your most lucky day!"};
	public String getFortune() {
		int num = 0 + (int)(Math.random() * (3));
		return fortuneValueStrings[num];
	}

}
