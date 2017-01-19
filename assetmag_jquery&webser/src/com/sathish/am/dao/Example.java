package com.sathish.am.dao;

import java.util.Scanner;


	
	/**
	 * @author sathish
	 *
	 */
	public class Example
	{
		//program to reverse a string
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main1(String[] args)
	{
	
	String org,rev = "";
	System.out.println("enter original");
	org=new Scanner(System.in).nextLine();
	for (int i = org.length()-1; i >=0 ; i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println("reverse");
	System.out.println(rev);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String org="sat";
		System.out.println("enter original");
		org=new Scanner(System.in).nextLine();
		/*System.out.println("enter String");
		news=in.nextLine();*/
		org.replace("a", "b");
	
		System.out.println(org.replace("a", "b"));
		System.out.println(org.replaceFirst("a", "b"));
		System.out.println(org.replaceAll("a", "b"));
		
	}
	}


