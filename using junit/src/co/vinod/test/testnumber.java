package co.vinod.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.vinod.uitl.number;

public class testnumber {

	
	private number obj;
	@Before
	public void init()
	{
		obj=new number();
	}
	// 0 1 1 2 3 5 8 13 21 34
@Test
public void UTC_01_validInput(){
	long expected =34;
	long actual=obj.getfibElementsAt(9);
	
Assert.assertEquals(expected, actual);
}

@Test
public void UTC_02_nrgatuveInput()
{
	long expected =-1;
	long actual=obj.getfibElementsAt(-100);
	Assert.assertEquals(expected, actual);
	
}
	
}
