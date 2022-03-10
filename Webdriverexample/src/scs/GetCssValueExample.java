package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shivaconceptsolution.com/test.html");
		WebElement element = driver.findElement(By.cssSelector("input[value=click]"));
		String data = element.getCssValue("color")+ element.getCssValue("background-color")+ element.getCssValue("width");
		System.out.print(data);
		driver.close();

	}

}
