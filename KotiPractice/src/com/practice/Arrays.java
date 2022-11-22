package com.practice;

public class Arrays {

	public static void main(String[] args) {
//		int a[]=new int[5];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		for(int i:a) {
//			System.out.println(i);
//		}
	int a[]= {10,20,30,40,50};
	int sum=0;
	for(int i:a) {
		sum=sum+i;
	}

       System.out.println(sum);

	}

}
