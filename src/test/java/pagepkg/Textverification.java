package pagepkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		String src=driver.getPageSource();
		if(src.contains("LUMA"))
		{
			System.out.println("text is present");
		}
			
		else
		{
			System.out.println("not present");
		}
		}

	}



