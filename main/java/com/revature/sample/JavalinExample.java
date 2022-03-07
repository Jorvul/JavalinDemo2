package com.revature.sample;

import com.reveature.demo.controller.HandlerController;

import io.javalin.Javalin;

public class JavalinExample {

	public static void main(String[] args) {
		Javalin app = Javalin.create().start(7070);
		
		app.get("/name/{fname}/{lname}", HandlerController.nameUpper);
		
		app.get("/name1/{fname}/{lname}", HandlerController.nameLower);
		
		app.get("/name2/{fname}/{lname}", HandlerController.initialUpper);
		
		app.get("/length/{namelength}", HandlerController.nameLength);
		
		app.get("/add/{n1}/{n2}", HandlerController.addNums);
		
		app.get("/dif/{no1}/{no2}", HandlerController.subNums);
		
		app.get("/div/{n1}/{n2}", HandlerController.divNums);
		
		app.get("/multiply/{n1}/{n2}", HandlerController.multiplyNums);
	}

	
}
