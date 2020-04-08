package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arunudhay/eclipse-workspace/Selenium2020/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
        //Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click Leads link
		driver.findElementByLinkText("Leads").click();
		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		//find name
	WebElement count = driver.findElementsByXPath("//label[text()='First name:']").get(0);
	System.out.println(count.getText());
		
		
	}

}