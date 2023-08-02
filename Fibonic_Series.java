package com.practice.Collection_Methods;

public class Fibonic_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// fibbonic series is nothing but addition of last two digits
		int a = 0;
		int b = 1;
		
		int count = 10;
		for(int i =0;i<=count;i++) {
			int c = a+b;
			a=b;
			b = c;
			
			System.out.print(c+ " ");	
		}
		
	}

}
