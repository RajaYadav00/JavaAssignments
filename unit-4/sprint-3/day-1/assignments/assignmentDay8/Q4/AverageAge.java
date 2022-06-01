package com.assignmentDay8.Q4;

import java.util.Scanner;

public class AverageAge implements Insurence {
	@Override
	public double calculateAverage(int[] age) {
		double totalAge=0;
		for(int x:age) {
			if(x<28||x>40) {
				return 0;
			}
			totalAge+=x;
		
		}
		double avg=totalAge/age.length;
		return avg;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AverageAge av=new AverageAge();
		
		System.out.println("Enter total no.of employees");
		int n=sc.nextInt();
		if(n<2) {
			while(n<2) {
			System.out.println("Please enter a valid employee count");
			n=sc.nextInt();
			}
		}
		
		int[] arr=new int[n];
		System.out.println("Enter the age for"+ n+"employees:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		double avg=av.calculateAverage(arr);
		if(avg==0) {
			System.out.println("Invalid AGe encounter");
		}else {
			System.out.println("The average age is"+avg);
		}
		

	}

	

}
