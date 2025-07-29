package automation.testsuit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CT_PageUrl;
import automation.common.CommonBase;

public class Day8_Practice extends CommonBase {

	@Test
	public void getElementById() {
		driver = initChromeDriver(CT_PageUrl.ALADA_URL);
		WebElement emailElement = driver.findElement(By.id("txtLoginUsername"));
		System.out.println("emailElement" + emailElement);
	}

	@Test
	public void getElementByName() {
		driver = initChromeDriver(CT_PageUrl.ALADA_URL);
		WebElement passElement = driver.findElement(By.id("txtLoginPassword"));
		System.out.println("passElement" + passElement);
	}

	@Test
	public void getElementByLinlText() {
		driver = initChromeDriver(CT_PageUrl.SECTORHUB_URL);
		WebElement textFindout = driver
				.findElement(By.linkText("Find out how to automate these controls without XPath"));
		System.out.println("textFindout" + textFindout);
	}

	@Test
	public void getElementByParrtialLinkText() {
		driver = initChromeDriver(CT_PageUrl.SECTORHUB_URL);
		WebElement textCourse = driver.findElement(By.linkText("A course with complex scenarios"));
		System.out.println("textCourse" + textCourse);
	}

	@Test
	public void getElementUserEMail() {
		driver = initChromeDriver(CT_PageUrl.SECTORHUB_URL);
		WebElement useremail = driver.findElement(By.name("email"));
		System.out.println("useremail" + useremail);
	}

	@Test
	public void getElementUserUserPass() {
		driver = initChromeDriver(CT_PageUrl.SECTORHUB_URL);
		WebElement userpass = driver.findElement(By.id("pass"));
		System.out.println("userpass" + userpass);
	}

	@Test
	public void getElementUserCompany() {
		driver = initChromeDriver(CT_PageUrl.SECTORHUB_URL);
		WebElement usercompany = driver.findElement(By.name("company"));
		System.out.println("usercompany" + usercompany);
	}

	@Test
	public void getElementUserMobile() {
		driver = initChromeDriver(CT_PageUrl.SECTORHUB_URL);
		WebElement usermobile = driver.findElement(By.name("mobile number"));
		System.out.println("usermobile" + usermobile);
	}

}
