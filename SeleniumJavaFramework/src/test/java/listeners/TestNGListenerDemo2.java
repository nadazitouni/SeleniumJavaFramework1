package listeners;


import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNGListenerDemo2 {

	@Test
	public void test4(){
		
		System.out.println("i am inside test 4");
	}
	@Test
	public void test5(){
		
		System.out.println("i am inside test 5");
		
	}
	@Test
	public void test6(){
		
		System.out.println("i am inside test 6");
		throw new SkipException("This test is skipped");
	}



}
