package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		double pri = sc.nextDouble();
		
		System.out.print("받은돈: ");
		double m = sc.nextDouble();
		
		System.out.println("=====================");
		System.out.println("받은 돈:" + m);
		System.out.println("상품가격: " + pri);
		System.out.println("부가세: " + pri*0.1);
		System.out.println("잔액: " + (m-pri));
		
		
		sc.close();
	}
}
