package com.epam;
import java.lang.*;
import java.util.*;
public class Sici {
	public static void si(double p,int t,double r)//calculates simple interest

	{
		System.out.println("The simple interest is "+(p*t*r)/100);
	}
	public static void ci(double p,int t,double r)//calculates compound interest
	{
		double a=p*Math.pow(1+(r/100), t);
		double c=a-p;
		System.out.println("The compound interest is "+c);
	}
	}

