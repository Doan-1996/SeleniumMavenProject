package automation.pageLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.common.CommonBase;

public class LoginPage_Day13{
// Tìm locator của element trên page, rồi thực hiện các steps
	// 1 page là 1 đối tượng cần test cho hệ thống web
	private WebDriver driver;


	public LoginPage_Day13(WebDriver driver) {
	this.driver = driver;
}
	// Tìm locator của element trên page, rồi thực hiện các steps, rồi thực hiện các
	// step cho tính năng
	public void LoginFunction(String email, String pass) {
		WebElement textEmail = driver.findElement(By.id("txtLoginUsername"));
		if (textEmail.isDisplayed()) {
			textEmail.sendKeys(email);
		}
		WebElement textPass = driver.findElement(By.id("txtLoginPassword"));
		if (textPass.isDisplayed()) {
			textPass.sendKeys(pass);
		}
		WebElement buttonLogin = driver.findElement(By.xpath("(//button[text()='ĐĂNG NHẬP'])[3]"));
		if (buttonLogin.isEnabled()) {
			buttonLogin.click();
		}
	}
	public void LoginFunction_BTVNDay13 (String email1, String pass1) {
		WebElement textEmail = driver.findElement(By.id("email"));
		if (textEmail.isDisplayed()) {
			textEmail.sendKeys(email1);
		}
		WebElement textPass = driver.findElement(By.id("password"));
		if (textPass.isDisplayed()) {
			textPass.sendKeys(pass1);
		}
		WebElement buttonLogin = driver.findElement(By.xpath("//button"));
		if (buttonLogin.isEnabled()) {
			buttonLogin.click();
		}
		
	}
	public void Logout1 () {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    //wait.until(ExpectedConditions.elementToBeClickable(By.className("toast-title")));
	    try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("toast-title")));
            System.out.println("Thông báo đã biến mất.");
        } catch (org.openqa.selenium.TimeoutException e) {
            System.out.println("Không thể chờ toast message biến mất trong thời gian quy định. Vẫn tiếp tục...");
        }
	    WebElement a = driver.findElement(By.id("dropdownMenuLink"));
		a.click();
			WebElement b = driver.findElement(By.xpath("(//button[text()='Đăng xuất'])[1]"));
		b.click();
	WebElement c = driver.findElement(By.xpath("(//button[text()='Đăng xuất'])[2]"));
		c.click();
	}
}
