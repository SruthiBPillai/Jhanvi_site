package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.JhanviPage;

public class JhaniTest {
	WebDriver driver;
	
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.jhanvifashions.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws Exception
	{
		JhanviPage ob=new JhanviPage(driver);
		ob.register("sruthi1991@gmail.com","Sruthi1234#");
		ob.logofn();
		ob.alllinks();
		ob.menus();
		ob.kurtilink();
		ob.selectdropdwm();
		ob.kurtitowishlist();
		ob.addtocart();
		ob.checkout();
		
		//
		ob.login("sruthi123@gmail.com","Sruthi123#");
		ob.searchfn();
		ob.myacntlgout();
		ob.lgnvalidation();
	}
	
	

}
