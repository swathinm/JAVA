package com.programms;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		Integer[] a= {10,30,404,50,79};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
	}

}
