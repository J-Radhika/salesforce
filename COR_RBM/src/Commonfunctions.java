import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Commonfunctions extends drivers {
	
	
	public static void sflogin() throws IOException {
		driver.findElement(By.id("username")).sendKeys(Excel.salesdeskusername());
		driver.findElement(By.id("password")).sendKeys(Excel.password());
		driver.findElement(By.id("Login")).click();
		
		
	}
	public static void bcoelogin() throws IOException {
		driver.findElement(By.id("username")).sendKeys(Excel.bcoeusername());
		driver.findElement(By.id("password")).sendKeys(Excel.password());
		driver.findElement(By.id("Login")).click();
		
		
	}
	public static void mlecarelogin() throws IOException {
		driver.findElement(By.id("username")).sendKeys(Excel.mleusername());
		driver.findElement(By.id("password")).sendKeys(Excel.carepassword());
		driver.findElement(By.id("Login")).click();
		
		
	}
	
	public static void logout()
	{
		driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
		driver.findElement(By.xpath("//a[@href='/secur/logout.jsp']")).click();
	}
	public static void oppsearch() throws IOException
	{
		drivers.driver.findElement(By.id("phSearchInput")).sendKeys(Excel.oppname());
		drivers.driver.findElement(By.id("phSearchButton")).click();
		drivers.driver.findElement(By.linkText(Excel.oppname())).click();
	}
	public static void COR_type_oppcreation() throws IOException, InterruptedException
	{
		driver.findElement(By.linkText("Opportunities")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("new")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("opp3")).sendKeys(Excel.oppname());
		driver.findElement(By.id("opp4")).sendKeys("test.janet");
		Select type = new Select(driver.findElement(By.id("opp5")));
		type.selectByVisibleText("Change of Responsibility");
		Select saleschannel = new Select(driver.findElement(By.id("00Nb00000039oS1")));
		saleschannel.selectByVisibleText("Telesales");
		Select FA = new Select(driver.findElement(By.id("00Nb0000006MHJ7")));
		FA.selectByVisibleText("No");
		driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[1]/td[4]/div/span/span/a")).click();
		Select stage = new Select(driver.findElement(By.id("opp11")));
		stage.selectByVisibleText("Qualified");
		Select primaryproduct = new Select(driver.findElement(By.id("00Nb00000039p5N")));
		primaryproduct.selectByVisibleText("Broadband");
		Select pm = new Select(driver.findElement(By.id("00N3z00000CWxyX")));
		pm.selectByVisibleText("No");
		driver.findElement(By.id("opp17")).sendKeys("test");
		driver.findElement(By.id("00Nb0000003s0T7")).click();
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & Add Product']")).click();
		
		
		
		
		
	}
	public static void addproduct() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("j_id0:all:j_id41:searchbox")).sendKeys(Excel.product());
		driver.findElement(By.id("j_id0:all:j_id41:search_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody[@id='doId']//tr[1]")).click();
		Thread.sleep(3000);
		Select bpt = new Select(driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id109")));
		bpt.selectByVisibleText("No");
		driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id115")).sendKeys("1");
		//dates
		WebElement date1 = driver.findElement(By.xpath("//tbody//tr[13]//td[1]//span[1]//span[1]//a[1]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", date1);
		Thread.sleep(2000);
		WebElement date2 = driver.findElement(By.xpath("//tbody//tr[14]//td[1]//span[1]//span[1]//a[1]"));
		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()", date2);
		Thread.sleep(2000);
		WebElement date3 = driver.findElement(By.xpath("//tbody//tr[15]//td[1]//span[1]//span[1]//a[1]"));
		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click()", date3);
		Thread.sleep(2000);
		Select billfrequency = new Select(driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id137")));
		billfrequency.selectByVisibleText("Monthly");
		Select type1= new Select(driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id100")));
		type1.selectByVisibleText("Change of Responsibility");
		Select typedetail = new Select(driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id101")));
		typedetail.selectByVisibleText("Change of Responsibility");
		driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id112")).sendKeys("test");
		driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id114")).sendKeys("2");
		driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id116")).sendKeys("30");
		driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id124")).click();
		driver.findElement(By.xpath("//*[@id=\"calRow3\"]/td[6]")).click();
		WebElement rentalvalue=driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id103"));
		rentalvalue.clear();
		rentalvalue.sendKeys("10");
		WebElement usagevalue=driver.findElement(By.id("j_id0:all:selectedproducts:j_id94:0:j_id96:j_id105"));
		usagevalue.clear();
		usagevalue.sendKeys("10");
		driver.findElement(By.id("j_id0:all:selectedproducts:j_id90:saveComeBack")).click();
		
	}

}
