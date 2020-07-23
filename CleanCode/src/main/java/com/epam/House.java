package com.epam;
import java.util.*;
public class House {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the area of the house to be built in squarefeet");
	int area=sc.nextInt();
	System.out.println("Enter a number to build a  house, you can choose from  the following options:\n "
			+ "1)Standard Materials @ 1200/sqft\n 2)above standard materials @1500/sqft\n 3)high standard materials @1800/sqft\n"
			+ "4)high standard and fully automated home @2500INR/sqft");
	int number=sc.nextInt();
	T2 t=new T2(area,number);
	
	sc.close();
}
}
