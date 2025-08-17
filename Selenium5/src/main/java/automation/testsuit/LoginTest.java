package automation.testsuit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PageUrl;
import automation.common.CommonBase;
import automation.pageLocator.LoginPage_Day13;

public class LoginTest extends CommonBase {
@BeforeMethod
public void openChromeBrowser() {
	driver = initChromeDriver (CT_PageUrl.ALADA_URL);
	
}
//Case 1: Login thành công
@Test
public void loginSuccessfully()
{
	LoginPage_Day13 login = new LoginPage_Day13 (driver);
	login.LoginFunction("doanvt96cntt1@gmail.com", "Hanoimuahe@2025");
	WebElement khoahoccuatoi = driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]"));
	assertTrue(khoahoccuatoi.isDisplayed());
	}
}
