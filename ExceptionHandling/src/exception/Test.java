package exception;

public class Test {
	
	void doStuff()
	{
		domoreStuff();
		System.out.println("hi");
	}
	
	void domoreStuff()
	{
		System.out.println(10/0);
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
	    t.doStuff();
	    System.out.println("main");
	}

}
