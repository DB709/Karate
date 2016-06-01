package com.danielbarclay.karate;

import com.danielbarclay.karate.kata.Kata;

public abstract class Style {
	Kata[] kataList;
	
	public Style() {
		instantiateKataList();
	}
	
	
	public void listAllKata() {
		for (int i=0; i<kataList.length; i++){
			System.out.println(kataList[i].name);
			System.out.println(kataList[i].numberOfMoves);
		}
		
	}
	
	public abstract void instantiateKataList() ;
}
