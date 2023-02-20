package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.chrome.driver","C:\\Users\\vinuvikas\\eclipse-workspace1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.quit();
		
		WebElement username = driver.findElement(By.name("identifier"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("venganna@gmail.com");
		
//		webElement Next = driver.findElemenyt(By.class("VfPpkd-vQzf8d"));
		
		WebElement nButton = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span"));
		nButton.isDisplayed();
		nButton.isEnabled();
		
		nButton.click();
		//nButton.sendKeys("venganna@gmail.com")
		
		driver.close();
	}

}
