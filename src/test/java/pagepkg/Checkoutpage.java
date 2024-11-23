package pagepkg;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
WebDriver dr;

@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
WebElement basket;
@FindBy(xpath="//*[@id=\"top-cart-btn-checkout\"]")
WebElement checkoutbutton;
public Checkoutpage(WebDriver dr)
{
	this.dr=dr;
	PageFactory.initElements(dr, this);
}
public void basketclick() throws Exception
{
	JavascriptExecutor js=(JavascriptExecutor)dr;
	js.executeScript("window.scrollTo(0,0)","");
	Thread.sleep(2000);
	basket.click();
}
public void checkoutclick()
{
	checkoutbutton.click();	
	dr.navigate().back();
}
}
