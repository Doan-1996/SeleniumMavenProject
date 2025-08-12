package automation.testsuit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CT_PageUrl;
import automation.common.CommonBase;

public class Day12 extends CommonBase {
@Test
public void chooseHoies(){
	driver = initChromeDriver(CT_PageUrl.DEMOQA_URL);
	
	scrollToElement(By.id("userNumber"));
	WebElement sportlable = driver.findElement(By.xpath("//label[text()='Sports']"));
	boolean isSportSelected = sportlable.isSelected();
	if (isSportSelected==false)
	{
		sportlable.click();
		System.out.println("CHeck box sport is clicked");
	}
	WebElement reading =driver.findElement(By.xpath("//label[text()='Reading']"));
	if(reading.isSelected()==false) {
		reading.click();
		System.out.println("CHeck box reading is clicked");
	}
	WebElement music = driver.findElement(By.xpath("//label[text()='Music']"));
	if(music.isSelected()==false) {
		music.click();
		System.out.println("CHeck box music is clicked");
	} 
}
}
