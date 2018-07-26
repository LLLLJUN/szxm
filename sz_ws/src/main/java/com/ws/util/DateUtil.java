package com.ws.util;

import java.text.SimpleDateFormat;

/**
 * @author lujun
 * @date 2018年7月2日
 */
public class DateUtil {
	
	
	public static String supplierCode(){
		int x=(int)((Math.random()*9+1)*100);
	       StringBuffer sb=new StringBuffer();
	       sb.append("S");
	       sb.append(x);
	       String string=sb.toString();
	       return string;
	}
	
	public static String purchaseCode(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        int x=(int)((Math.random()*9+1)*100);
        StringBuffer sb=new StringBuffer();
        sb.append("P"+sdf.format(new java.util.Date())+x);
        String string=sb.toString();
		return string;
	}
	
	public static String checkBillCode(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        int x=(int)((Math.random()*9+1)*100);
        StringBuffer sb=new StringBuffer();
        sb.append("C"+sdf.format(new java.util.Date())+x);
        String string=sb.toString();
		return string;
	}
	
	public static String inStoreCode(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddhhmmssSSS");
		StringBuffer sb=new StringBuffer();
		sb.append("I"+sdf.format(new java.util.Date()));
		String string =sb.toString();
		return string;
				
	}
	
	public static String transferCode(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		int x=(int)((Math.random()*9+1)*100);
		StringBuffer sb=new StringBuffer();
		sb.append("T"+sdf.format(new java.util.Date())+x);
		String string =sb.toString();
		return string;
				
	}
	
	public static String outStoreCode(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        int x=(int)((Math.random()*9+1)*100);
        StringBuffer sb=new StringBuffer();
        sb.append("O"+sdf.format(new java.util.Date())+x);
        String string=sb.toString();
		return string;
				
	}
}
