package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver dr;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement Signin;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Email;
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"send2\"]")
	WebElement Signinbutton;
	public Loginpage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public void signin() throws Exception
	{
		Thread.sleep(2000);
		Signin.click();      
	}
public void Setvalues(String email, String pass) throws Exception
{
	JavascriptExecutor js=(JavascriptExecutor)dr;
	js.executeScript("window.scrollBy(0,500)","");
	Email.clear();
	Email.sendKeys(email);
	Thread.sleep(1000);
Password.clear();
Password.sendKeys(pass);
Thread.sleep(1000);
}
public void Signinbutton()
{
	Signinbutton.click();
}
}
