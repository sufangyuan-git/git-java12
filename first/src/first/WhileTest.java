package first;

import org.junit.Test;

public class WhileTest {
	@Test
	public void ForTest1() {
		//while(true) {//当条件为真时执行的语句块。
			int sum=0;
			for(int i=0;i<100;i++) {
				if(i%3==0) {sum+=i;}
			}
			System.out.println(sum);
		}
	@Test
	public void WhileTest1() {
		//while(true) {//当条件为真时执行的语句块。
			int sum=0,i=0;
			while(i<100) {
				if(i%3==0) {sum+=i;}
				i++;
			}
			System.out.println(sum);
		}
	@Test
	public void DoWhileTest1() {
		//while(true) {//当条件为真时执行的语句块。
			int sum=0,i=0;
			do{
				if(i%3==0) {sum+=i;}
				i++;
			}while(i<100);
			System.out.println(sum);
		}
	
	@Test
	public void jishuTest1() {
		//while(true) {//当条件为真时执行的语句块。
			int sum=0;
			for(int i=0;i<=100;i++) {
				if(i%2==1) {sum+=i;}
			}		
			System.out.println(sum);
		}
	@Test
	public void oushuTest1() {
		//while(true) {//当条件为真时执行的语句块。
			int sum=0;
			for(int i=0;i<=100;i++) {
				if(i%2==0) {sum+=i;}
			}		
			System.out.println(sum);
		}
	@Test
	public void nianxinTest1() {
		//while(true) {//当条件为真时执行的语句块。
			double total=0;
			double sal=30000;
			for(int i=1;i<=10;i++) {
				total+=sal;
				sal*=1.06;				
			}		
			System.out.println(sal);
			System.out.println(total);
		}
	@Test
	public void houziTest1() {
		//while(true) {//当条件为真时执行的语句块。
			int peach=1;
			for(int i=1;i<10;i++) {
				peach=(peach+1)*2;
				System.out.println(peach);
			}		
			System.out.println(peach);
		}
	@Test
	public void jiechengTest1() {
		//while(true) {//当条件为真时执行的语句块。
			int n=5;
			int total=1;
			for(int i=1;i<=n;i++) {
				total*=i;
			}		
			System.out.println(total);
		}
	
	}
//}
