package anand.practice;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups= {"Sanity"})
	public void test() {
		
	System.out.println("My Sanity test1 from Group1");	
	}
	
	@Test(groups= {"Sanity"})
	public void test2() {
		
	System.out.println("My Sanity test2 from Group1  ");	
	}
	
	@Test(groups= {"Regression"})
	public void test3() {
		
	System.out.println("My regression test1 from Group1");	
	}
	
	@Test(groups= {"Regression"})
	public void test4() {
		
	System.out.println("My regression test2 from Group1");	
	}
	
	
}
