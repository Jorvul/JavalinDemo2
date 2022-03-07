package com.reveature.demo.controller;

import io.javalin.http.Handler;

public class HandlerController {

	public static Handler nameUpper = ctx -> {
		String fname = ctx.pathParam("fname");
		String lname = ctx.pathParam("lname");
		String fullName = fname.toUpperCase() + " " + lname.toUpperCase();
		ctx.result("Full name is " + fullName);
	};
	
	public static Handler initialUpper = ctx -> {
		String fname = ctx.pathParam("fname");
		String lname = ctx.pathParam("lname");
		String fullName = fname.substring(0,1).toUpperCase() + fname.substring(1) + " " + 
		lname.substring(0,1).toUpperCase() + lname.substring(1);
		ctx.result("Full name is " + fullName);
	};

	public static Handler nameLower = ctx -> {
		String fname = ctx.pathParam("fname");
		String lname = ctx.pathParam("lname");
		String fullName = fname.toLowerCase() + " " + lname.toLowerCase();
		ctx.result("Full name is " + fullName);
	};

	public static Handler nameLength = ctx -> {
		String name = ctx.pathParam("namelength");
		int size = name.length();
		ctx.result("Name length is " + size);
	};

	public static Handler addNums = ctx -> {
		int num1 = Integer.parseInt(ctx.pathParam("n1"));
		int num2 = Integer.parseInt(ctx.pathParam("n2"));
		int result = num1 + num2;
		ctx.result("Sum of " + num1 + "+" + num2 + "=" + result);

	};

	public static Handler subNums = ctx -> {
		int num1 = Integer.parseInt(ctx.pathParam("no1"));
		int num2 = Integer.parseInt(ctx.pathParam("no2"));
		int result = num1 - num2;
		ctx.result("Difference of " + num1 + "-" + num2 + "=" + result);

	};

	public static Handler divNums = ctx -> {
		int num1 = Integer.parseInt(ctx.pathParam("n1"));
		int num2 = Integer.parseInt(ctx.pathParam("n2"));
		int result = num1 / num2;
		ctx.result(num1 + " divided by " + num2 + "=" + result);
	};

	public static Handler multiplyNums = ctx -> {
		int num1 = Integer.parseInt(ctx.pathParam("n1"));
		int num2 = Integer.parseInt(ctx.pathParam("n2"));
		int result = num1 * num2;
		ctx.result(num1 + "*" + num2 + "=" + result);
	};

}
