
package com.neuedu.classam20200805;

public class BasicDataType {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*基本数据类型
		 * 字符型 char(2字节，16位)，
		 * 布尔型 boolean，
		 * 整型 byte(1字节，8位，-128~127)，（无符号：0~255），（有符号：正：0~127，负：-128~-1）*/
		byte maxbyte=127;//2^7-1;
		byte minbyte=-128;//-2^7;
		 /* short(2字节，16位，-32768~32767)*/
		short maxshort=32767;//2^15-1;
		short minshort=-32768; //-2^15;
		 /* int(4字节，32位，-2^31-1~2^31)*/
		  System.out.println("int最大值"+Integer.MAX_VALUE);//2147483647
		  System.out.println("long最大值"+Long.MAX_VALUE);//9223372036854775807
		  System.out.println("double最大值"+Double.MAX_VALUE);
		  System.out.println("float最大值"+Float.MAX_VALUE);
		  /* 
		 * long(数字后面要加l/L)，(8字节，64位，-2^63-1~2^63)
		 * 浮点型 float(数字后面要加f/F),
		 * double，*/
		/*引用类型 String*/
		/*变量定义格式：
		 * 变量类型  变量名字=变量具体值.*/
		int x1=0;
		char c1='中';
		float f1=-123.13F;
		System.out.println(f1);
		double d1=1.7976931348623157E308;
		long l=9223372036854775807L;
		char c2='"';
		System.out.println(c2);
		boolean b1= true;
		boolean b2= false;		
		
	}

}
