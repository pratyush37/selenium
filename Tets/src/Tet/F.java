package Tet;

import org.testng.annotations.Test;

public class F {

	@Test(priority = 1)
	public void mani()
	{
		E e = new E();
		e.main();
	}
}
