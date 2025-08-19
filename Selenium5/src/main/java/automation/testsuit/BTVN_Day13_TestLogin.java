package automation.testsuit;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PageUrl;
import automation.common.CommonBase;
import automation.pageLocator.LoginPage_Day13;

public class BTVN_Day13_TestLogin extends CommonBase {
	@BeforeMethod
	public void openChromeBrowser() {
		driver = initFireFox(CT_PageUrl.CODESTAR_URL);

	}
	// Case 1: Login thành công

	@Test
	public void loginSuccessfully() {
		LoginPage_Day13 login = new LoginPage_Day13(driver);
		login.LoginFunction_BTVNDay13("admin@gmail.com", "12345678");
		WebElement quanlinguoidung = driver.findElement(By.xpath("//p[text()='Quản lý người dùng']"));
		assertTrue(quanlinguoidung.isDisplayed());
	}

	// Case 2 : Login thất bại do sai email
	@Test
	public void loginFailWithWrongEMail() {
		LoginPage_Day13 login = new LoginPage_Day13(driver);
		login.LoginFunction_BTVNDay13("admin1@gmail.com", "12345678");
		WebElement text = driver.findElement(By.xpath("//h4[text()='Đăng nhập']"));
		assertTrue(text.isDisplayed());
	}

	// Case 3: Login thất bại do sai password
	@Test
	public void loginFailWithWrongPass() {
		LoginPage_Day13 login = new LoginPage_Day13(driver);
		login.LoginFunction_BTVNDay13("admin@gmail.com", "123456789");
		WebElement title = driver.findElement(By.xpath("//h4[text()='Đăng nhập']"));
		assertTrue(title.isDisplayed());

	}

	// Case 4 : - Login thất bại do sai cả mail và password
	public void loginFailWithWrongBoth() {
		LoginPage_Day13 login = new LoginPage_Day13(driver);
		login.LoginFunction_BTVNDay13("admin1@gmail.com", "1234567891");
		WebElement title = driver.findElement(By.xpath("//h4[text()='Đăng nhập']"));
		assertTrue(title.isDisplayed());
	}

	// Case 5 : Logout
	@Test
	public void Logout() {
		LoginPage_Day13 login = new LoginPage_Day13(driver);
		LoginPage_Day13 logout = new LoginPage_Day13(driver);
		login.LoginFunction_BTVNDay13("admin@gmail.com", "12345678");
		logout.Logout1();
		WebElement title = driver.findElement(By.xpath("//h4[text()='Đăng nhập']"));
		assertTrue(title.isDisplayed());
	}
}
