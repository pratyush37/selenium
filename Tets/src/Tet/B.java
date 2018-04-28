package Tet;

import org.testng.annotations.Test;

public class B extends A {
	int i = 233;
	int A=100;
	@Test
	public void pull()
	{
		int i=234;
		int A = 200;
		A a = new B();
		a.sub();
		a.sum();
		a.res();
		System.out.println("B");
		super.res();
		System.out.println(A);
		System.out.println(super.A);
		System.out.println(this.A);
		a.B=1000;
		System.out.println(a.B);
		System.out.println(i);
		
	}
}
