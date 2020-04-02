package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FAcebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/arunudhay/eclipse-workspace/Selenium2020/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("abc@gmail.com");
		driver.findElementById("pass").sendKeys("password");
		driver.findElementById("loginbutton").click();
	}

}
