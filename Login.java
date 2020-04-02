package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/arunudhay/eclipse-workspace/Selenium2020/chromedriver");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementById("label").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("PODA DAI LTD");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vada");
		driver.findElementById("createLeadForm_lastName").sendKeys("Vaada");
		driver.findElementByClassName("smallSubmit").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
