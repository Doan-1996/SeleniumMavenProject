package automation.common;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;

public class CommonBase {
	public static WebDriver driver;
	private int initWaitTime =5;

	public WebDriver initChromeDriver(String url) {
	//	String ALADA_url = "https://alada.vn/tai-khoan/dang-nhap.html";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		return driver;
	}
	public WebDriver initFireFox(String url) {
		//	String ALADA_url = "https://alada.vn/tai-khoan/dang-nhap.html";
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.manage().window().maximize();
			return driver;
		}
	public void scrollToElement(By locator) {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement element = getElementPresentDOM(locator);
		  js.executeScript("arguments[0].scrollIntoView(true);", element);
		 }
	public WebElement getElementPresentDOM(By locator) {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		  return driver.findElement(locator);
		 }
	public void closeDriver() {
		if(driver!=null)
			driver.close();
	}
}
