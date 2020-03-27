package com.tech.developer.domain;

public enum Tech {
	
	JAVAFX("JAVAFX"),
	JAVAEE("JAVAEE"),
	ANDROID("ANDROID"),
	KOTLIN("KOTLIN"),
	JAVASCRIPT("JAVASCRIPT"),
	CPLUS("C++"),
	CSHARP("C#");
	
	public String tag;
	
	private Tech(String tag) {
		this.tag = tag;	
	}
	
	public static void m() {
		Tech t = Tech.JAVAEE;		
	}
}
