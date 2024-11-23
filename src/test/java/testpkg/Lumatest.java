package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Checkoutpage;
import pagepkg.Loginpage;
import pagepkg.Removeitem;
import pagepkg.Screenshot;
import utilities.Lumautils;

public class Lumatest extends Baseclass{
	@Test(priority =3)
	
	public void Titleverification()
	{
		String actualtitle=dr.getTitle();
		System.out.println(actualtitle);
		String exptitle="Home Page";
		System.out.println("title="+actualtitle);
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		}
	}

@Test(priority =4)

public void Textverification()
{
	String src=dr.getPageSource();
	if(src.contains("Sale"))
	{
		System.out.println("text is present");
	}
		
	else
	{
		System.out.println("not present");
	}
	}
	
	@Test(priority =5)	
		
			public void Addtocart() throws Exception
		{
		pagepkg.Addtocart ac =new pagepkg.Addtocart(dr);
		ac.addtocartsetup();
		System.out.println("end");	
		
		}
	@Test(priority =6)
	public void checkoutpage() throws Exception
	{
		Checkoutpage cf =new Checkoutpage(dr);
		cf.basketclick();
		cf.checkoutclick();
		System.out.println("end");	
	}
	
	@Test(priority =7)
	public void removeitemclick() throws Exception
	{
		Removeitem rm =new Removeitem(dr);
		rm.basketclick();
		rm.editclick();
		//rm.okclick();
		rm.deleteclick();
		System.out.println("end");
	}
	
	@Test(priority =8)
	public void Screenshotcheck() throws Exception
	{
		Screenshot ss=new Screenshot(dr);
		ss.Screenshotmainpage();
		System.out.println("screenshot taken");
		System.out.println("end");
	}
	
	
	@Test(priority =9)
	public void verifyloginwithcred() throws Exception
	{
		Loginpage lp=new Loginpage(dr);
lp.signin();

		System.out.println("inside verifylogin");
				String xl = "D:\\luma.xlsx";
				String Sheet="Sheet1";
		int rowCount=Lumautils.getRowCount(xl, Sheet);
		System.out.println("rowcount="+rowCount);
		
		for(int i=1;i<rowCount;i++)
		{
			String Email=Lumautils.getcellValue(xl, Sheet, i, 0);
			System.out.println("Email...."+Email);
			String Password=Lumautils.getcellValue(xl, Sheet, i, 1);
			System.out.println("Password...."+Password);
			lp.Setvalues(Email, Password);
	
			lp.Signinbutton();
			
			
			
			
			
		}
		
	}






	}
	


