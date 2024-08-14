package org.spirae.mavansample;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginpage extends loginpageobjects {
	WebDriver  driver;
	loginpage(){
		this.driver=driver;
	}
	
	public void openApplication() throws InterruptedException {
			
			ChromeOptions option = new ChromeOptions();
		    option.addArguments("--remote-allow-origins=*");

		    System.setProperty("webdriver.chrome.driver", "C:\\swathi_online training\\JarFiles\\Chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   driver = new ChromeDriver(option);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.navigate().to(url);
			System.out.println("Application Opened");
		}
	
	public void setUsername() throws InterruptedException {
		
		 driver.findElement(username).sendKeys(us);
		 driver.findElement(password).sendKeys(pw);
		driver.findElement(btn_login).click();
		    System.out.println("Login completed");
		    Thread.sleep(2000);
	    
		}
	public void search() {
		driver.findElement(search).sendKeys("Leave");
		   System.out.println("Search completed");
		   System.out.println("ececution completed");
	}
}
