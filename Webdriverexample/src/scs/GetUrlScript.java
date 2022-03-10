package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlScript {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://eroomrent.in");
		 WebElement ele = driver.findElement(By.linkText("Contact Us"));
		 ele.click();
		 String title = driver.getCurrentUrl();
		 System.out.print(title);

	}

}
