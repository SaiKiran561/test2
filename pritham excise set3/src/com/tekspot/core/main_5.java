package com.tekspot.core;

class alpha{
	public String type="a";
	public alpha() {
		System.out.println("alpha");
	}
}
class beta extends alpha{
	public beta()
{
System.out.println("beta");		
}
	void go() {
		type="b";
		System.out.println(this.type+super.type);
	}
}
public class main_5 {

	public static void main(String[] args) {
		new beta().go();

	}

}
