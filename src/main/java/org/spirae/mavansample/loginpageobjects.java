package org.spirae.mavansample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpageobjects {
	 WebDriver driver;
	 String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	 String us  = "Admin";
	 String pw  = "admin123";
	 
	 
	 
	 By username = By.xpath("//input[@placeholder='Username']");
	 By password  = By.xpath("//input[@placeholder='Password']");
	 By btn_login=By.xpath("//button[normalize-space()='Login']");
	 
	 By search=By.xpath("//input[@placeholder='Search']");
	 
	 

}
