//if else and nested if

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		if(i>0) {
			System.out.println("Number is possitive");}
			else {
				System.out.println("Number is zero or negative");
			}
		System.out.println("Enter the number: ");
		int j=sc.nextInt();
		if(j>0) {
			System.out.println("Number is possitive");}
			else {
				System.out.println("Number is zero or negative");
			}
		//nested if
		int age = 10;

        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
        System.out.println("Enter your age: ");
        int age1=sc.nextInt();
        if (age1 < 18) {
            System.out.println("You are a minor.");
        } else if (age1 >= 18 && age1 < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
	}

}
