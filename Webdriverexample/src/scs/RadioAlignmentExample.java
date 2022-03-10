package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAlignmentExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://eroomrent.in/login.php");
		WebElement ele = driver.findElement(By.name("txtEmail"));
		String rblocation2 = ele.getLocation().toString();
		System.out.println(rblocation2);
		WebElement ele1 = driver.findElement(By.name("txtPassword"));
		String rblocation1 = ele1.getLocation().toString();
		System.out.println(rblocation1);
		int x1 = ele1.getLocation().x;
		int x2 = ele.getLocation().x;
		int y1 = ele1.getLocation().y;
		int y2 = ele.getLocation().y;
		System.out.println("x1="+x1+ "x2="+x2+ "y1="+y1+ "y2="+y2);
		if(x1==x2)
		{
		   System.out.println("textbox is left aligned");
		   if(y1!=y2)
		   {
			   System.out.println("textbox has margin top"); 
		   }
		}
		else
		{
		   System.out.println("Radio button is not aligned");	
		}
		
		
		driver.close();
		


	}

}
