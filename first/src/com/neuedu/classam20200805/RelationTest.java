
package com.neuedu.classam20200805;

public class RelationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 关系运算符,判断两个量之间关系：> < = >= <= !=
		// 返回值类型：boolean(true/false);
		int i = 2, j = 3;
		boolean k = i > j;
		boolean l = (i != j);
		System.out.println(k);// false
		System.out.println(l);// true
		System.out.println(i == j);// false
		// ctrl+shift+f 格式化代码
		// 逻辑运算符
		// && 与 || 或 ! 非
		int score = 89;
		// 判断上面的数是否在70-80之间（>70并且<80）
		boolean result1 = (score >= 70 && score < 80);
		System.out.println(result1);// false
		boolean result2 = (score >= 70 || score < 80);
		System.out.println(result2);// true
		boolean result3 = !(score >= 70 && score < 80);
		System.out.println(result3);// true
		// 三目运算符
		boolean m = true;
		int m1 = m ? 1 : 0;
		System.out.println(m1);
		int a = 3, b = 6;
		System.out.println(a < b ? a : b);
		int x1 = a < b ? a : b;
		char x2 = a < b ? '真' : '假';
		String x3 = a < b ? "真" : "假";
		// 判断条件?返回值1:返回值2;
		// instanceof 运算符
		String name = "James";
		boolean result_ = name instanceof String; // 由于 name 是 String 类型，所以返回真
		System.out.println(result_);
		// 优先级
	}

}
