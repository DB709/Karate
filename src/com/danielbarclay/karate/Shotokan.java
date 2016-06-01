package com.danielbarclay.karate;

import com.danielbarclay.karate.kata.Kata;

public class Shotokan extends Style{
	
	@Override
	public void instantiateKataList() {
		Kata gojushihosho = new Kata("gojushihosho", 54);
		Kata gojushihodai = new Kata("gojushihodai", 54);
		Kata nijushihosho = new Kata("nijushihosho", 24);
		kataList = new Kata[] {gojushihosho, gojushihodai, nijushihosho};
		
		
	}
}
