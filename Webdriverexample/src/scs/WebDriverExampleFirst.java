package scs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExampleFirst {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://eroomrent.in");
		 String title = driver.getTitle();
		 if(title!="")
		 {
			 System.out.println("Title is set "+title);
			 if(title.length()<=60)
			 {
				 System.out.println("Title is valid");
			 }
			 else
			 {
				 System.out.println("Title is not valid");
			 }
		 }
		 else
		 {
			 System.out.println("Title is not set "+title);
		 }

	}

}
