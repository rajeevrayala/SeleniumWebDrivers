package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverdemo {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","F://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver);
		driver.close();
	}
}