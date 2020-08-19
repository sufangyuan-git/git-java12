
package com.neuedu.classam20200805;

import java.util.Scanner;

public class everymathsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		int sum=0;
		while(n/1!=0) {
			sum+=n%10;
			System.out.println(sum);
			n=n/10;
		}
		System.out.println(sum);
		sc.close();
	}

}
