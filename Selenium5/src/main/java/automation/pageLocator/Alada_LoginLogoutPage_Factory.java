package automation.pageLocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alada_LoginLogoutPage_Factory{
	private WebDriver driver;
	//gọi chú thích @FindBy để tạo liên kết giữa phần tử với Locator 
	@FindBy(id="txtLoginUsername")  WebElement textEmail;
	@FindBy(id="txtLoginPassword")  WebElement textPassword;
	@FindBy(xpath="(//button[text()='ĐĂNG NHẬP'])[3]")  WebElement buttonLogin;
	
	//log out
	@FindBy(xpath="//div[@class='avatar2']")WebElement image;
	@FindBy(xpath="//a[text()='Thoát']")WebElement btnThoat;
	
	//register
	@FindBy(id="txtFirstname")WebElement firstname;
	@FindBy(id="txtEmail")WebElement teemail;
	@FindBy(id="txtCEmail")WebElement repemail;
	@FindBy(id="txtPassword")WebElement passw;
	@FindBy(id="txtCPassword")WebElement repassw;
	@FindBy(id="txtPhone")WebElement phonenumber;
	@FindBy(xpath="(//a[@class='btn-anis-effect'])[1]")WebElement btnDangki1;
	@FindBy(xpath="(//button[text()='ĐĂNG KÝ'])[3]")WebElement btnDangki2;
	// edit info
	@FindBy(xpath="//a[@class='fs14']")WebElement edit;
	@FindBy(id="txtpassword")WebElement oldpass;
	@FindBy(id="txtnewpass")WebElement newpass;
	@FindBy(id="txtrenewpass")WebElement renewpass;
	@FindBy(xpath="//button[text()='Lưu mật khẩu mới']")WebElement savebutton;
	public Alada_LoginLogoutPage_Factory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void loginFunction (String email, String pass) {
		textEmail.sendKeys(email);
		textPassword.sendKeys(pass);
		buttonLogin.click();
		
	}
	public void logoutFunction() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		image.click();
		btnThoat.click();
	}
	public void RegisterAccount (String name, String email, String repeatemail, String pass, String repeatpass, String phone) {
		btnDangki1.click();
		firstname.sendKeys(name);
		teemail.sendKeys(email);
		repemail.sendKeys(repeatemail);
		passw.sendKeys(pass);
		repassw.sendKeys(repeatpass);
		phonenumber.sendKeys(phone);
		btnDangki2.click();
		
	}
	public void EditNewwPass(String pass, String passnew, String repassnew)
	{
		edit.click();
		oldpass.sendKeys(pass);
		newpass.sendKeys(passnew);
		renewpass.sendKeys(repassnew);
		savebutton.click();
	}
	
	

}
