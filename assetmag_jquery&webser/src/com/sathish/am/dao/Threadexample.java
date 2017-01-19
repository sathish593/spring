package com.sathish.am.dao;

public class Threadexample extends Thread{
	private String name;
	public Threadexample(String name)
	{
	this.name=name;
	}
	
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
		   System.out.println("in thread:::"+name+i);
	    Thread.sleep(500);  
	   }catch(Exception e){//System.out.println(e);
	   }  
	  //System.out.println(i);  
	  }  
	 }  
	public static void main(String args[]) throws InterruptedException{  
	 Threadexample t1=new Threadexample("first");  
	 Threadexample t2=new Threadexample("second");  
	 Threadexample t3=new Threadexample("third");  
	 t1.start();  
	 try{  
	 t1.join();  
	 }catch(Exception e){//System.out.println(e);
	 }  
	  
	 t2.start(); 
	 t2.join();
	 t3.start();  
	 t3.join();
	 }  
	}  

