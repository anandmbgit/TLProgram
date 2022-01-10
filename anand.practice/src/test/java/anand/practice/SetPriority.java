package anand.practice;

import org.testng.annotations.Test;

public class SetPriority {

	/*  1.Negative priority
	 *  2.Non prioritized alphabetical order
	 *  3.Zero(0) priority
	 *  4.with priority 1 and so on 
	 */
	
	@Test()
	public void c_method(){
		System.out.println("I'm in method C");
	}
	@Test()
	public void b_method(){
		System.out.println("I'm in method B");
	}
	@Test(priority=6)
	public void a_method(){
		System.out.println("I'm in method A");
	}
	@Test(priority=0)
	public void e_method(){
		System.out.println("I'm in method E");
	}
	@Test(priority=-1)
	public void d_method(){
		System.out.println("I'm in method D");
	}
	
	@Test(priority=-2)
	public void f_method(){
		System.out.println("I'm in method F");
	}
}
