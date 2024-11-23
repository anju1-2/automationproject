package pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	WebDriver dr;
	public Screenshot(WebDriver dr)
	{
		this.dr=dr;
	}
	public void Screenshotmainpage() throws IOException
	{
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\lumascreenshot.png"));
		//WebElement button=dr.findElement(By.name("Shopping Cart"));
		//File src1=button.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src1, new File("./Screenshot/buttonscreenshot.png"));
		
	}

}
