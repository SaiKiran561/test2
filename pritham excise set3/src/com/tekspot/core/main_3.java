package com.tekspot.core;

class first{
	int i=10;
	public first(int j) {
		System.out.println(i);
		this.i=j*10;
	}
}
class second extends first{

	public second(int j) {
		super(j);
		System.out.println(i);
		this.i=j*20;
	}
	
}
public class main_3 {

	public static void main(String[] args) {
		second n=new second(20);
		System.out.println(n.i);

	}

}
