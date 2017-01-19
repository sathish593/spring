package com.sathish.am.controllers;

import java.util.IdentityHashMap;
import java.util.WeakHashMap;

import com.sathish.am.pojo.AssetPojo;

public class Test {
	
	
	public static void main(String[] args) {
		String data="sathish";
		System.out.println("{\"msg\":\""+data+"\"}");
		String x="sathish";
		x=x+"aa";
		AssetPojo a=new AssetPojo();
		AssetPojo b=new AssetPojo();
		String aa=new String("xxx");
		String bb=new String("xxx");
		if(aa==bb)
		{
			System.out.println("equalsasfdasf");
		}
		
		if(x==data)
		{
			System.out.println("equals");
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println("hash map");
		IdentityHashMap m=new IdentityHashMap();
		Integer ai=new Integer(1);
		Integer bi=new Integer(1);
		m.put("1", 300);
		m.put(2, 300);
		System.out.println(m);
		
		WeakHashMap wm=new WeakHashMap();
	}

}
