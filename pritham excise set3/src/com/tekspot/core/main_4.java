package com.tekspot.core;

class calculator{
	int num=100;
	public void calc(int num) {
		this.num=num*10;
	}
	public void printNum() {
		System.out.println(num);
	}
}
public class main_4 {

	public static void main(String[] args) {
		calculator obj=new calculator();
		obj.calc(2);
		obj.printNum();
	}

}
