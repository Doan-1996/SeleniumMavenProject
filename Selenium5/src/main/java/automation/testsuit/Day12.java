package automation.testsuit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.common.CT_PageUrl;
import automation.common.CommonBase;

public class Day12 extends CommonBase {
@Test
public void chooseHoies(){
	driver = initChromeDriver(CT_PageUrl.DEMOQA_URL);
	scrollToElement(By.id("userNumber"));
	WebElement sport = driver.findElement(By.id("hobbies-checkbox-1"));
	
	boolean isSportSelected = sport.isSelected();
	if (isSportSelected==false)
	{
		sport.click();
		System.out.println("CHeck box sport is clicked");
	}
	WebElement reading =driver.findElement(By.id("hobbies-checkbox-2"));
	if(reading.isSelected()==false) {
		reading.click();
		System.out.println("CHeck box reading is clicked");
	}
	WebElement music = driver.findElement(By.id("hobbies-checkbox-3"));
	if(music.isSelected()==false) {
		music.click();
		System.out.println("CHeck box music is clicked");
	}
}
}
