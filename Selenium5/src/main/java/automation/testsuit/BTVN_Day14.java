package automation.testsuit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PageUrl;
import automation.common.CommonBase;
import automation.pageLocator.Alada_LoginLogoutPage_Factory;
import automation.pageLocator.LoginPage_Day13;

public class BTVN_Day14 extends CommonBase {
	private static String oldPassword = "Abc@123";
	private static String newPassword = "Abc@1234";

	@BeforeMethod
	public void openBrower() {
		driver = initChromeDriver(CT_PageUrl.ALADA_URL);
		
	}
//1.	Vào trang https://alada.vn/ và đăng ký thành công tài khoản mới
	@Test(priority = 1)
	public void RegisterAccount() {
		Alada_LoginLogoutPage_Factory factory = new Alada_LoginLogoutPage_Factory(driver);
		factory.RegisterAccount("Vũ Thúy Đoan", "vuthuydoan6872@gmail.com", "vuthuydoan6872@gmail.com", oldPassword,
				oldPassword, "0326567894");
		WebElement khoahoccuatoi = driver.findElement(By.xpath("//div[@class='avatar2']"));
		// đoạn này em không thể locate đến được nó cứ báo lỗi--- no such element:
		// Unable to locate element: {"method":"xpath","selector":"//h2[text()='Danh mục
		// khóa học']"}---
		// mặc dù em đã copy y nghuyên lên web tìm thì vẫn thấy
		assertTrue(khoahoccuatoi.isDisplayed());
	}
//2.	Vào màn Thông tin đăng nhập bằng cách click vào nút Chỉnh sửa thông tin
	@Test(priority = 2)
	public void SaveNewPass() {
	
		Alada_LoginLogoutPage_Factory factory = new Alada_LoginLogoutPage_Factory(driver);
		factory.loginFunction("vuthuydoan6872@gmail.com",oldPassword );
		factory.EditNewwPass(oldPassword, newPassword, newPassword);
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		Assert.assertEquals(actualText, "Cập nhật mật khẩu mới thành công!");
		alert.accept();
	}
//3.	Đăng nhập bằng mật khẩu mới thành công và assert một element đại diện của trang chủ hiện ra.
	@Test(priority = 3)
	public void Login() {
		Alada_LoginLogoutPage_Factory factory = new Alada_LoginLogoutPage_Factory(driver);
		factory.loginFunction("vuthuydoan6872@gmail.com", newPassword);
		WebElement khoahoccuatoi = driver.findElement(By.xpath("(//div[@class='avatar2']"));
		assertTrue(khoahoccuatoi.isDisplayed());
	}

}
