package scs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
public class AttributeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter url without http and https");
		String url = sc.next();
		driver.get("https://"+url);
		List<WebElement> ele = driver.findElements(By.tagName("h1"));
		if(ele.size()==1)
		{
			System.out.println("Valid heading tag");
		}
		else
		{
			System.out.println("InValid heading tag");
			System.out.println("Number of heading tag is "+ele.size());
			
		}
		/*for(WebElement e:ele)
		{
		String s = e.getAttribute("src");
		int position = s.lastIndexOf("/");
		String imgname = s.substring(position+1);
		System.out.println("path is "+s + "image name "+imgname);
		}*/

	}

}
