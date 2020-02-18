
public class mystuff{
	String name;
	mystuff(String n){
		name=n;
	}
	public static void main(String[] args) {
		mystuff m1 = new mystuff("guitar"); 
		mystuff m2 = new mystuff("tv"); 
		System.out.println(m2.equals(m1)); 
	}
	@Override
	public boolean equals(Object obj) 
	{ 
	mystuff m = (mystuff) obj; 
	if (m.name != null){
		return true;
		} 
	return false;
	    } 
}

