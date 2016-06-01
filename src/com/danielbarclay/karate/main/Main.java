package com.danielbarclay.karate.main;

import com.danielbarclay.karate.Shitoryu;
import com.danielbarclay.karate.Shotokan;
import com.danielbarclay.karate.Style;

public class Main {
	
	public static void main(String[] args) {
		listKataForStyle(new Shotokan());
		listKataForStyle(new Shitoryu());
	}
	public static void listKataForStyle(Style style){
		style.listAllKata();
	}
}
//creating new variable: <variable type> <name of variable> = <new> <class name(arguements)>