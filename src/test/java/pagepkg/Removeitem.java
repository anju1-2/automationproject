package pagepkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Removeitem {
	WebDriver dr;

	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement basket1;
	@FindBy(xpath="//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span")
	WebElement editcart;
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]")
	WebElement delete;
	public Removeitem (WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public void basketclick() throws Exception
	{
		Thread.sleep(2000);
		basket1.click();
	}
	public void editclick() 
	{
		
		editcart.click();             
	}
	
	public void deleteclick()
	{
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0,500)","");
		delete.click();
		dr.navigate().back();
	}
	
	
	}
	
	


