package pagepkg;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	WebDriver dr;
	@FindBy(xpath="//*[@id=\"search\"]")
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img")
	WebElement Short;
	@FindBy(xpath="//*[@id=\"option-label-size-143-item-175\"]")
	WebElement size;
	@FindBy(xpath="//*[@id=\"option-label-color-93-item-50\"]")
	WebElement color;
	@FindBy(xpath="//*[@id=\"product-addtocart-button\"]")
	WebElement addtocartbutton;
	
	public Addtocart(WebDriver dr)
	{
	this.dr=dr;           
	
	PageFactory.initElements(dr, this);
	
	}
	public void addtocartsetup() throws Exception
	{
		Search.sendKeys("shorts for men",Keys.ENTER);
		Thread.sleep(2000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0,500)","");
			Short.click();
			Thread.sleep(2000);
			size.click();
			Thread.sleep(2000);
			color.click();
			Thread.sleep(2000);
			addtocartbutton.click();
			Thread.sleep(5000);
			dr.navigate().back();
		}
}


	
	
	







