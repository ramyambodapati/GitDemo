package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelIntroduction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://instacart.com/");
		
		//get title
		System.out.println(driver.getTitle());
		
		//get url of current page
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}