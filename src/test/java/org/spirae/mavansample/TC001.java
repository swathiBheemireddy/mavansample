package org.spirae.mavansample;

import org.testng.annotations.Test;



public class TC001 {
	@Test
	public void tc001() throws InterruptedException {
		
	  loginpage obj=new loginpage();
	  obj.openApplication();
	  obj.setUsername();
	  obj.search();
	}
}
