package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	static WebDriver driver;
	void openUrl()
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://eroomrent.in/ownerlogin.php");
	}
	void positiveTest()
	{
		WebElement txtemail = driver.findElement(By.name("txtEmail"));
		txtemail.sendKeys("nitinjatav@gmail.com");
		WebElement txtpass = driver.findElement(By.name("txtPassword"));
		txtpass.sendKeys("12345678");
		WebElement btn=driver.findElement(By.name("btnsubmit"));
		btn.click();
		String s = driver.getCurrentUrl();
		if(s.equals("https://eroomrent.in/owner/dashboard.php"))
		{
			System.out.println("Login Successfully");
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
			
		}
		else
		{
			System.out.println("Problem in login");
		}
	}
	void nigativeTestWithInvalidPassword()
	{
		
		WebElement txtemail = driver.findElement(By.name("txtEmail"));
		txtemail.sendKeys("nitinjatav@gmail.com");
		WebElement txtpass = driver.findElement(By.name("txtPassword"));
		txtpass.sendKeys("123456789");
		WebElement btn=driver.findElement(By.name("btnsubmit"));
		btn.click();
		String s = driver.getCurrentUrl();
		if(s.equals("https://eroomrent.in/owner/dashboard.php"))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}
	
	void nigativeTestWithInvalidUserID()
	{
		openUrl();
		WebElement txtemail = driver.findElement(By.name("txtEmail"));
		txtemail.sendKeys("nitinjatav12@gmail.com");
		WebElement txtpass = driver.findElement(By.name("txtPassword"));
		txtpass.sendKeys("12345678");
		WebElement btn=driver.findElement(By.name("btnsubmit"));
		btn.click();
		String s = driver.getCurrentUrl();
		if(s.equals("https://eroomrent.in/owner/dashboard.php"))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Invalid Userid");
		}
	}
	
	public static void main(String[] args) {
		
		LoginScript obj = new LoginScript();
		obj.openUrl();
		obj.positiveTest();
		obj.nigativeTestWithInvalidUserID();
		obj.nigativeTestWithInvalidPassword();

	}

}
