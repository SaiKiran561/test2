
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

class main{
	public static void main(String[] args) {
		second m=new second(20);
		System.out.println(m.i);
	}
}