package Tet;

import org.testng.annotations.Test;

public class C {
	
	@Test
	public void third()
	{
		A a = new B();
		a.sub();
		a.sum();
		a.res();
		System.out.println("C");
	}
}
