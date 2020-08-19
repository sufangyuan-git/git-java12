package com.neuedu.day02;

import java.util.Scanner;

import org.junit.Test;

public class IfTest {
	// 用户输入一个成绩如果大于90，继续判断。
	// 点前边的红叉，并导入test4包。
	@Test
	public void myTest1() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		// 设断点，进入debug模式，按F6，右键inspect.
		// 右上角退出debug模式。
		if (score >= 90) {
			System.out.println("成绩大于等于90");
			System.out.println("成绩为A");
		} else if (80 <= score && score < 90) {
			System.out.println("成绩80~90");
			System.out.println("成绩为B");
		} else if (70 <= score && score < 80) {
			System.out.println("成绩70~80");
			System.out.println("成绩为C");
		} else if (60 <= score && score < 70) {
			System.out.println("成绩60~70");
			System.out.println("成绩为D");
		} else {
			System.out.println("成绩小于60");
			System.out.println("成绩为E");
		}
		sc.close();
	}

	@Test
	public void myTest2() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		sc.close();
	}

	@Test
	public void myTest3() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 1) {
			System.out.println("X=1");
		} else if (i == 5) {
			System.out.println("X=5");
		} else if (i == 10) {
			System.out.println("X=10");
		} else {
			System.out.println("none");
		}
		sc.close();
	}
}
