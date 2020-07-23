package com.epam;
import java.util.*;
import java.lang.*;

public class SimpleInterestAndCompundInterest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal,time and rate of Interest");
		double p=sc.nextDouble();
		int t=sc.nextInt();
		double r=sc.nextDouble();
		
		Sici.si(p, t, r);
		Sici.ci(p, t, r);
		sc.close();
	}
}