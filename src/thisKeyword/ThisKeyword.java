package thisKeyword;

public class ThisKeyword {
	String name;

	public ThisKeyword(String name) {
	this.name = name;
	}
	public static void main(String[] args) {
	ThisKeyword obj1 = new ThisKeyword("bhanu");
	obj1.name();

	}

	public void name()
	{
	System.out.println("my name is "+ this.name);
	}

}
