package com.epam;

public class T2 {
	static int area;
	int number;
	T2(int a,int num)
	{
	   area=a;
		int number=num;
		cost(number);
	}
public static void cost(int i)
{
	switch(i)
	{
	case 1:System.out.println("Cost of house is "+1200*area+"INR");
	       break;
	case 2:System.out.println("Cost of house is "+1500*area+"INR");
	       break;
	case 3:System.out.println("Cost of house is "+1800*area+"INR");
	       break;
	case 4:System.out.println("Cost of house is "+2500*area+"INR");
	       break;
	default:System.out.print("No other options available!!");
	}
}
}
