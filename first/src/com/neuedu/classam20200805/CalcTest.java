package com.neuedu.classam20200805;

public class CalcTest {
	public static void main(String[] args) {
		 /*++i --i i++ i-- %
		 *+= -= *= /=
		 *?:*/
		//++i  i=i+1  i先加1后参与运算
		int i1=2;
		int j1=++i1;
		System.out.println("i1="+i1+","+"j1="+j1);
		//i++  i=i+1  i先参与运算后加1
		int i2=2;
		
		int j2=i2++;
		System.out.println("i2="+i2+","+"j2="+j2);
		//--i  i=i-1  i先加1后参与运算
		int i3=2;
		int j3=--i3;
		System.out.println("i3="+i3+","+"j3="+j3);
		//i--  i=i-1  i先参与运算后加1
		int i4=2;
		int j4=i4--;
		System.out.println("i4="+i4+","+"j4="+j4);
		//%(取余 取模)
		int k=16%6;//4
		System.out.println(k);
		//+= -= *= /=
		int m=3;
		m+=2;
		System.out.println(m);//5
		m-=3;
		System.out.println(m);//2
		m*=10;
		System.out.println(m);//20
		m/=5;
		System.out.println(m);//4
		m%=3;
		System.out.println(m);//1
	}
}
