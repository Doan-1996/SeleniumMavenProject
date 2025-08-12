package automation.testsuit;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.common.CT_PageUrl;
import automation.common.CommonBase;

public class Homework_Day12 extends CommonBase {
@Test
public void chooseSelectCountry(){
	driver = initChromeDriver(CT_PageUrl.GLOBAL_URL);
	WebElement selectCountry = driver.findElement(By.xpath("//select"));
	Select cateCountry = new Select(selectCountry);
	//Kiểm tra số lượng option
	int size =cateCountry.getOptions().size();
	assertEquals(size,249);
	//Chọn Angola bằng selectByVisibleText, Togo, VietNam
	cateCountry.selectByVisibleText("Angola");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	String actualText = cateCountry.getFirstSelectedOption().getText();
	assertEquals(actualText,"Angola");
	// Chọn Algeria bằng Index
	cateCountry.selectByIndex(3);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	String actualTextTogo = cateCountry.getFirstSelectedOption().getText();
	assertEquals(actualTextTogo,"Algeria");
	//CHọn VietNam bằng selectByValue
	cateCountry.selectByValue("VNM");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	String actualTextVN = cateCountry.getFirstSelectedOption().getAttribute("value");
	assertEquals(actualTextVN,"VNM");
}
}
