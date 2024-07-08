package Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.logging.FileHandler;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JhanviPage {
	
	WebDriver driver;
	
	By reglink=By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div[1]/a/span[2]");
	By createac=By.xpath("/html/body/div[5]/div[3]/a");
	By regmail=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/div[2]/div/div[2]/form/p[1]/input");
	By regpswd=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/div[2]/div/div[2]/form/p[2]/span/input");
	By regclk=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/div[2]/div/div[2]/form/p[3]/button");
	

	By logo=By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/img[1]");
	By links=By.tagName("a");
	By menues=By.xpath("/html/body/div[1]/header/div/div/div/div/div[1]/div");
	By kurti=By.xpath("//span[contains(text(),'KURTIS')]");
	By georgt=By.xpath("//a[contains(text(),'Georgette Kurtis')]");
	By drpdwn=By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/select[1]");
	By selectkurtitowishlist =By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[5]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By wishlist=By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[5]/div[1]/div[1]/div[2]/div[3]/a[1]");
	By kurtitoaddtocart=By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[6]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By adcrtbtn =By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[6]/div[1]/div[1]/div[3]/a[1]");
	By chkout=By.xpath("//a[contains(text(),'Proceed to checkout')]");
	By lgnlink=By.xpath("//a[contains(text(),'Click here to login')]");
	By uname=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/form[1]/p[2]/input");
	By paswod=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/form[1]/p[3]/span/input");
	By lgnbtn=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/form[1]/p[4]/button");
	By search=By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[1]/span[1]");
	By myacnt=By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div[1]/a");
	By lgout=By.xpath("//body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[7]/a[1]/span[1]");
	By aftlgnuname=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/div[2]/div/div[1]/form/p[1]/input");
	By aftlgnpaswd=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/div[2]/div/div[1]/form/p[2]/span/input");
	By aftlgtloginbtn=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section/div/div/div/div/div/div/div[2]/div/div[1]/form/p[3]/button");
	
	
	public JhanviPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void register(String email,String passwd)
	
	{
		driver.findElement(reglink).click();
		driver.findElement(createac).click();
		driver.findElement(regmail).sendKeys(email);
		driver.findElement(regpswd).sendKeys(passwd);
		driver.findElement(regclk).click();
		
	}
	
	public void logofn()
	{
		if(driver.findElement(logo).isDisplayed())
		{
			System.out.println("Jhanvi logo present");
		}
		else
		{
			System.out.println("Jhanvi logo not present");
		}
	}
	
	public void alllinks()
	{
		List<WebElement>li =driver.findElements(links);
		for(WebElement link:li)
		{
			String linkstr=link.getAttribute("href");
			String linktext=link.getText();
			
		
		System.out.println("Links"+linkstr+"-----------------------------------"+"Text"+linktext);
		}
	}
	public void menus()
	{
		List<WebElement> m=driver.findElements(menues);
		for(WebElement menulist:m)
		{
			String menustr=menulist.getText();
			System.out.println("Menues");
			System.out.println("**********");
			System.out.println(menustr);
			
		}
	}
	public void kurtilink()
	{
		Actions act=new Actions(driver);
		WebElement w= driver.findElement(kurti);
		act.moveToElement(w).build().perform();
		driver.findElement(georgt).click();
		
	}
	public void selectdropdwm()
	{	
		WebElement w=driver.findElement(drpdwn);
		Select s=new Select(w);
		s.selectByValue("popularity");
	}
	public void kurtitowishlist()
	{
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView();",driver.findElement(selectkurtitowishlist));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 WebElement w=driver.findElement(selectkurtitowishlist);
	 Actions act= new Actions(driver);
	 act.moveToElement(w).build().perform();
	 driver.findElement(wishlist).click();
	 
	}
	
	public void addtocart()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();",driver.findElement(kurtitoaddtocart));
		WebElement w=driver.findElement(kurtitoaddtocart);
		Actions act=new Actions(driver);
		act.moveToElement(w).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act1=new Actions(driver);
		WebElement w1=driver.findElement(adcrtbtn);
		act1.moveToElement(w1).build().perform();
		driver.findElement(adcrtbtn).click();
		
		
	}
	
	public void checkout() throws Exception
	{
		
	driver.findElement(chkout).click();
	WebElement w=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/ul[1]"));
	File src=w.getScreenshotAs(OutputType.FILE);
	org.openqa.selenium.io.FileHandler.copy(src,new File("./Screenshot//checkout.png"));
	}

	public void login(String name,String paswd)
	{
		driver.findElement(lgnlink).click();
		
		
		driver.findElement(uname).sendKeys(name);
		driver.findElement(paswod).sendKeys(paswd);
		driver.findElement(lgnbtn).click();
		
	}
	public void searchfn()
	{
		driver.findElement(search).click();
		driver.findElement(By.xpath("//body/div[5]/form[1]/input[1]")).sendKeys("Gown",Keys.ENTER);
	}
	public void myacntlgout()
	{
		
		WebElement w=driver.findElement(myacnt);
		Actions a=new Actions(driver);
		a.moveToElement(w).build().perform();
		driver.findElement(lgout).click();
		
	}
	
	public void lgnvalidation() throws Exception 
	{
		driver.navigate().to("https://www.jhanvifashions.com/my-account-4/");
		//driver.findElement(lgnlink).click();
		File f=new File("D:\\Book1_jhanvi.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi) ;
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username = " +username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password = " +pswd);
			driver.findElement(aftlgnuname).clear();
			driver.findElement(aftlgnuname).sendKeys(username);
			
			
			driver.findElement(aftlgnpaswd).clear();
			driver.findElement(aftlgnpaswd).sendKeys(pswd);
			driver.findElement(aftlgtloginbtn).click();
			
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			String expurl="https://www.jhanvifashions.com/my-account-4/?action=login";
			if(expurl.equalsIgnoreCase(actualurl))
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("login unsuccessful");
			
				}
			
		
		
	}
	}
	
	
}
	
	

	

