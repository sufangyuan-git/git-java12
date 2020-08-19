
package com.neuedu.classam20200805;

public class Typechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自动类型转换（从小的向大的转）。
		/*byte<short<int<long*/
		int i=2147483647;
		long l2=i;
		long l=i+1;
		System.out.println(l2);
		System.out.println(l);
		//强制转换（从大的向小的）。
		long l1=12345678*123940;
		int j1=12345678*123940;//明显超出int最大值
		int j2=(int)l1;
		System.out.println(l1);
		System.out.println(j1);
		System.out.println(j2);
		//小的参与运算强转成大的。
		//运算符：
		/*+ - * /
		 *++i --i i++ i-- %
		 *+= -= *= /=
		 *?:*/
	}

}
