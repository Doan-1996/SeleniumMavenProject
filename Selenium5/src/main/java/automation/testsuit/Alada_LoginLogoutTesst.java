package automation.testsuit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PageUrl;
import automation.common.CommonBase;
import automation.pageLocator.Alada_LoginLogoutPage_Factory;
import automation.pageLocator.LoginPage_Day13;

public class Alada_LoginLogoutTesst extends CommonBase{
	@BeforeMethod
	public void openBrower() {
		driver = initChromeDriver(CT_PageUrl.ALADA_URL);
	}
	
//@Test
//public void loginSuccessfully () {
//	
//	    Alada_LoginLogoutPage_Factory factory = new Alada_LoginLogoutPage_Factory(driver);
//		factory.loginFunction("doanvt96cntt1@gmail.com", "Hanoimuahe@2025");
//		WebElement khoahoccuatoi = driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]"));
//		assertTrue(khoahoccuatoi.isDisplayed());
//		}
@Test
public void logoutSuccessfully() {
	Alada_LoginLogoutPage_Factory factory = new Alada_LoginLogoutPage_Factory(driver);
	factory.loginFunction("doanvt96cntt1@gmail.com", "Hanoimuahe@2025");
	Alada_LoginLogoutPage_Factory factory1 = new Alada_LoginLogoutPage_Factory(driver);
	factory1.logoutFunction();
	assertTrue(driver.findElement(By.xpath("//div[@class='login']")).isDisplayed());
}

}

