package automation.testsuit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import automation.common.CT_PageUrl;
import automation.common.CommonBase;

public class practiceXpathDay8 extends CommonBase{
	@Test
	public void getElementByName() {
		driver = initChromeDriver(CT_PageUrl.SWebAPI_URL);
		WebElement name = driver.findElement(By.name("name"));
		System.out.println("name" + name);
	}
	@Test
	public void getElementByAddress() {
		driver = initChromeDriver(CT_PageUrl.SWebAPI_URL);
		WebElement address = driver.findElement(By.name("address"));
		System.out.println("address" + address);
	}
	@Test
	public void getElementByEmail() {
		driver = initChromeDriver(CT_PageUrl.SWebAPI_URL);
		WebElement email = driver.findElement(By.name("email"));
		System.out.println("email" + email);
	}
	@Test
	public void getElementByPass() {
		driver = initChromeDriver(CT_PageUrl.SWebAPI_URL);
		WebElement pass = driver.findElement(By.name("password"));
		System.out.println("pass" + pass);
	}

}
