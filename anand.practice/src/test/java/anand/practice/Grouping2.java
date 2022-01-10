package anand.practice;

import org.testng.annotations.Test;

public class Grouping2 {

	@Test(groups= {"Sanity"})
	public void test5() {
		
	System.out.println("My Sanity test1 from Group2");	
	}
	
	@Test(groups= {"Sanity"})
	public void test6() {
		
	System.out.println("My Sanity test2 from Group2");	
	}
	
	@Test(groups= {"Regression"})
	public void test7() {
		
	System.out.println("My regression test1 from Group2");	
	}
	
	@Test(groups= {"Regression"})
	public void test8() {
		
	System.out.println("My regression test2 from Group2");	
	}
	
	
}
