package com.danielbarclay.karate;

import com.danielbarclay.karate.kata.Kata;

public class Shitoryu extends Style {

	@Override
	public void instantiateKataList() {
		Kata nipaipo = new Kata("nipaipo", 28);
		kataList = new Kata[]{nipaipo};
		
	}
}
