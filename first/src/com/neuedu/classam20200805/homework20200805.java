
package com.neuedu.classam20200805;

public class homework20200805 {
	public static void main(String[] args) {
		/*一.1.整型 byte short int long 2.浮点型 float double 3.布尔型 boolean 4.字符型 char 
		 */
		/*二.*/double G = 9.8;
		System.out.println(G);
		/*三.1.标识符用作给变量、方法和类命名。
		 * 2.以字母、下划线“_”和“$”符开头，后面可跟字母、下划线“_”和“$”符或数字。
		 * 3.大小写敏感。
		 * 4.应该使用有意义的名称，达到见名知意的目的，并且长度无限制。
		 * 5.尽量不要使用中文。
		 * 6.不可以是true和false。true和false虽然不是关键字，但是有特殊用途。
		 * 7.避免与java关键字与java类库的类名重名，java关键字一共有51个
		 */
		/*四.*/int a=6,b;
		b=a++*3;//a=7,b=18;
		System.out.println("a="+a+","+"b="+b);
		/*五.*/int x=2;
		int y=x++/3;//0
		System.out.println(y);
		/*六.*/int x1=5,y1=10;
		boolean r1=x1<y1;//true
		boolean r2=x1>=y1;//false
		System.out.println("x1<y1为"+r1+","+"x1>=y1为"+r2);
		/*七.*/
		int math=999;
		int t=(math/100%10)+(math/10%10)+(math%10);
		System.out.println(t);		
	}
}
