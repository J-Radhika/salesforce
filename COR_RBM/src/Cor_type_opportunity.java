import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cor_type_opportunity {
	static WebDriverWait wait;
	public static void main(String[] args) throws IOException, InterruptedException {
		opportunity();
		ADDproductfor_cor();
		ordercreation();
		subordercreation();
		ChangeOwnerParent();
		ChangeOwnerSuborder();
		BillingAccountCase();
		updateremedycase();
		Billingtriggercase();
	}
		
	
	public static void opportunity() throws IOException, InterruptedException {
		drivers.Edgedriver();
		Commonfunctions.sflogin();
		Commonfunctions.COR_type_oppcreation();
		
	}
	public static void ADDproductfor_cor() throws IOException, InterruptedException
	{
		Commonfunctions.addproduct();
		Commonfunctions.logout();
		Thread.sleep(3000);
	}
	public static void ordercreation() throws IOException, InterruptedException
	{
		Commonfunctions.bcoelogin();
		Thread.sleep(2000);
		Commonfunctions.oppsearch();
		drivers.driver.findElement(By.xpath("//div[@class='listHoverLinks']//a[19]")).click();
		drivers.driver.findElement(By.xpath("//input[@value='New COR Order']")).click();
		Thread.sleep(2000);




		Select Supplier = new Select(drivers.driver.findElement(By.id("00N3z000009SiBC")));
		Supplier.selectByValue("COR - RBM");



		Select PirmaryProd = new Select(drivers.driver.findElement(By.id("00N3z000009SiBJ")));
		PirmaryProd.selectByVisibleText("Book and Ship");
		
		drivers.driver.findElement(By.id("CF00N3z000009SiB6")).sendKeys("Janet J");
		
		



       
        drivers.driver.findElement(By.xpath("//input[@name='save']")).click();
        return;
}
	public static void subordercreation() throws InterruptedException
	{
		drivers.driver.findElement(By.xpath("//a[@data-uidsfdc='31']")).click();
		drivers.driver.findElement(By.xpath("//input[@name='create_suborders']")).click();
		Thread.sleep(1000);



		drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//iframe[@id='iframeContentId']")));
		Thread.sleep(2000);
		drivers.driver.findElement(By.xpath("//input[@id='j_id0:form1:pb1:j_id28:inputdo']")).sendKeys("1");



		drivers.driver.findElement(By.name("j_id0:form1:pb1:j_id47:bottom:j_id49")).click();




		Alert alert = drivers.driver.switchTo().alert();
		alert.accept();
		drivers.driver.switchTo().defaultContent();
		drivers.driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		drivers.driver.navigate().refresh();
		drivers.driver.findElement(By.xpath("//a[@data-uidsfdc='31']")).click();



		drivers.driver.findElement(By.linkText("Edit")).click();




		//address details and Billing



		drivers.driver.findElement(By.xpath("//input[@name='00N3z000009SiBL']")).sendKeys("Sheffield");
		drivers.driver.findElement(By.xpath("//input[@name='00N3z00000BpoIA']")).sendKeys("GB");
		drivers.driver.findElement(By.xpath("//input[@name='00N3z00000BpoIB']")).sendKeys("United Kingdom");
		drivers.driver.findElement(By.xpath("//input[@name='00N3z000009SiBM']")).sendKeys("EC1N 2HT");





		drivers.driver.findElement(By.xpath("//input[@id='00N3z000009SiB4']")).sendKeys("07998889910");
		drivers.driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		return;
	}

		public static void ChangeOwnerParent() {





		drivers.driver.findElement(By.xpath("//div[@id='Owner_ileinner']//a[text()[normalize-space(.)= '[Change]']]")).click();
		//Select owner = new Select(driver.findElement(By.id("newOwn_mlktp")));
		//owner.selectByVisibleText("Queue");



		drivers.driver.findElement(By.xpath("//*[contains(@class,'lookupIcon')]")).click();



		String Parent = drivers.driver.getWindowHandle();



		Set<String> Child = drivers.driver.getWindowHandles();
		Iterator<String> I = Child.iterator();



		while(I.hasNext()) {



		String Child_actual = I.next();



		if(!Parent.equals(Child_actual)){
		drivers.driver.switchTo().window(Child_actual);



		try {
		drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@name='searchFrame']")));
		drivers.driver.findElement(By.id("lksrch")).sendKeys("divya Suresh MLE Care");
		drivers.driver.findElement(By.xpath("//input[@name='go']")).click();
		drivers.driver.switchTo().defaultContent();



		drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
		drivers.driver.findElement(By.xpath("//a[@href='#']")).click();



		}catch(Exception e){
		e.printStackTrace();
		}
		}



		}
		drivers.driver.switchTo().window(Parent);




		drivers.driver.findElement(By.xpath("//input[@name='save']")).click();
		return;
		
	}
		public static void ChangeOwnerSuborder() throws InterruptedException, IOException {




			drivers.driver.findElement(By.xpath("/html/body/div[1]/div[3]/table/tbody/tr/td[2]/div[5]/div[1]/div/form/div[2]/table/tbody/tr[2]/th/a")).click();
			drivers.driver.findElement(By.xpath("//div[@id='Owner_ileinner']//a[text()[normalize-space(.)= '[Change]']]")).click();




			drivers.driver.findElement(By.xpath("//*[contains(@class,'lookupIcon')]")).click();



			String Parent = drivers.driver.getWindowHandle();



			Set<String> Child = drivers.driver.getWindowHandles();
			Iterator<String> I = Child.iterator();



			while(I.hasNext()) {



			String Child_actual = I.next();



			if(!Parent.equals(Child_actual)){
			drivers.driver.switchTo().window(Child_actual);



			try {
			drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@name='searchFrame']")));
			drivers.driver.findElement(By.id("lksrch")).sendKeys("divya Suresh MLE Care");
			drivers.driver.findElement(By.xpath("//input[@name='go']")).click();
			drivers.driver.switchTo().defaultContent();



			drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
			drivers.driver.findElement(By.xpath("//a[@href='#']")).click();



			}catch(Exception e){
			e.printStackTrace();
			}
			}



			}
			drivers.driver.switchTo().window(Parent);
			


			drivers.driver.findElement(By.xpath("//input[@name='save']")).click();
			Thread.sleep(1000);
			String suborder=drivers.driver.findElement(By.id("Name_ileinner")).getText();
			Commonfunctions.logout();
			Thread.sleep(2000);



		
			Commonfunctions.mlecarelogin();
			drivers.driver.findElement(By.id("phSearchInput")).sendKeys(Excel.oppname());
			drivers.driver.findElement(By.id("phSearchButton")).click();
			drivers.driver.findElement(By.linkText(suborder)).click();
			Thread.sleep(2000);
			drivers.driver.findElement(By.xpath("//*[@id='topButtonRow']//input[@name='assign_flow_template']")).click();
			
}
		static void BillingAccountCase() throws InterruptedException {



			Thread.sleep(420000); //7 mins for first case

			drivers.driver.navigate().refresh();



			drivers.driver.findElement(By.xpath("//a[@data-uidsfdc='31']")).click();


			



			drivers.driver.findElement(By.xpath("//table/tbody/tr[contains(@class,'dataRow')]/td[contains(text(),'Create Billing Account')]//preceding-sibling::th//a")).click();




			drivers.driver.findElement(By.xpath("//span[contains(text(),'Details')]")).click();



			drivers.driver.findElement(By.xpath("//div[@id='cas1_ileinner']//a[text()[normalize-space(.)= '[Change]']]")).click();




			drivers.driver.findElement(By.xpath("//*[contains(@class,'lookupIcon')]")).click();



			



			Set<String> Child = drivers.driver.getWindowHandles();
			Iterator<String> I = Child.iterator();
			String p = I.next();
			String c=I.next();
			drivers.driver.switchTo().window(c);
			drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@name='searchFrame']")));
			drivers.driver.findElement(By.id("lksrch")).sendKeys("divya Suresh MLE Care");
			drivers.driver.findElement(By.xpath("//input[@name='go']")).click();
			drivers.driver.switchTo().defaultContent();



			drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
			drivers.driver.findElement(By.xpath("//a[@href='#']")).click();




			
			drivers.driver.switchTo().window(p);




			drivers.driver.findElement(By.xpath("//input[@name='save']")).click();




			//*****************************ADDITIONAL INFORMATION**********************



			drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//iframe[@name='0663z000002ZXAP']")));
			drivers.driver.findElement(By.xpath("//td[@class='pbButton ']//input[@value='Edit']")).click();



			drivers.driver.findElement(By.xpath("//input[@id='j_id0:gc1:j_id1:j_id28:j_id29:0:j_id33']")).sendKeys("Test account");



			drivers.driver.findElement(By.xpath("//input[@id='j_id0:gc1:j_id1:j_id28:j_id29:1:j_id33']")).sendKeys("B908");



			Select BillingSystem = new Select(drivers.driver.findElement(By.id("j_id0:gc1:j_id1:j_id28:j_id36:0:j_id40")));



			BillingSystem.selectByVisibleText("Yorkshire (ICOMS) - 14");




			drivers.driver.findElement(By.xpath("//input[@name='j_id0:gc1:j_id1:j_id56:j_id58']")).click();
			drivers.driver.switchTo().defaultContent();





			drivers.driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Close Case']")).click();



			Select CaseStatus = new Select(drivers.driver.findElement(By.id("cas7")));
			CaseStatus.selectByVisibleText("Completed");



			drivers.driver.findElement(By.xpath("//div[@class='pbHeader']//td[@class='pbButton']//input[@name='save']")).click();



			drivers.driver.findElement(By.xpath("//a[contains(text(),'SO-')]")).click();




			return;
			}
public static void updateremedycase() throws InterruptedException
{
	Thread.sleep(300000);
	drivers.driver.navigate().refresh();
	drivers.driver.findElement(By.xpath("//a[@data-uidsfdc='31']")).click();


	



	drivers.driver.findElement(By.xpath("//table/tbody/tr[contains(@class,'dataRow')]/td[contains(text(),'Update Remedy')]//preceding-sibling::th//a")).click();

	drivers.driver.findElement(By.xpath("//span[contains(text(),'Details')]")).click();

	drivers.driver.findElement(By.xpath("//div[@id='cas1_ileinner']//a[text()[normalize-space(.)= '[Change]']]")).click();

	drivers.driver.findElement(By.xpath("//*[contains(@class,'lookupIcon')]")).click();


	Set<String> Child = drivers.driver.getWindowHandles();
	Iterator<String> I = Child.iterator();
	String p = I.next();
	String c=I.next();
	drivers.driver.switchTo().window(c);
	drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@name='searchFrame']")));
	drivers.driver.findElement(By.id("lksrch")).sendKeys("divya Suresh MLE Care");
	drivers.driver.findElement(By.xpath("//input[@name='go']")).click();
	drivers.driver.switchTo().defaultContent();



	drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
	drivers.driver.findElement(By.xpath("//a[@href='#']")).click();

	drivers.driver.switchTo().window(p);

	drivers.driver.findElement(By.xpath("//input[@name='save']")).click();
	Thread.sleep(2000);
//---------------------------Additional Information--------------------------------------
	drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//iframe[@name='0663z000002ZXAP']")));
	drivers.driver.findElement(By.xpath("//td[@class='pbButton ']//input[@value='Edit']")).click();
	drivers.driver.findElement(By.id("j_id0:gc1:j_id1:j_id28:j_id36:0:j_id40")).sendKeys("Test");
	Select Remedy = new Select(drivers.driver.findElement(By.id("j_id0:gc1:j_id1:j_id28:j_id29:0:j_id33")));
	Remedy.selectByVisibleText("Yes");
	drivers.driver.findElement(By.xpath("//input[@name='j_id0:gc1:j_id1:j_id56:j_id58']")).click();
	drivers.driver.switchTo().defaultContent();

	drivers.driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Close Case']")).click();

	Select CaseStatus = new Select(drivers.driver.findElement(By.id("cas7")));
	CaseStatus.selectByVisibleText("Completed");
	drivers.driver.findElement(By.xpath("//div[@class='pbHeader']//td[@class='pbButton']//input[@name='save']")).click();

	drivers.driver.findElement(By.xpath("//a[contains(text(),'SO-')]")).click();	
	return;
}

public static void Billingtriggercase() throws InterruptedException
{
	Thread.sleep(240000);
	drivers.driver.navigate().refresh();
	drivers.driver.findElement(By.xpath("//a[@data-uidsfdc='31']")).click();


	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr[contains(@class,'dataRow')]/td[contains(text(),'Create Billing Account')]//preceding-sibling::th//a")));



	drivers.driver.findElement(By.xpath("//table/tbody/tr[contains(@class,'dataRow')]/td[contains(text(),'Billing')]//preceding-sibling::th//a")).click();

	drivers.driver.findElement(By.xpath("//span[contains(text(),'Details')]")).click();

	drivers.driver.findElement(By.xpath("//div[@id='cas1_ileinner']//a[text()[normalize-space(.)= '[Change]']]")).click();

	drivers.driver.findElement(By.xpath("//*[contains(@class,'lookupIcon')]")).click();


	Set<String> Child = drivers.driver.getWindowHandles();
	Iterator<String> I = Child.iterator();
	String p = I.next();
	String c=I.next();
	drivers.driver.switchTo().window(c);
	drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@name='searchFrame']")));
	drivers.driver.findElement(By.id("lksrch")).sendKeys("divya Suresh MLE Care");
	drivers.driver.findElement(By.xpath("//input[@name='go']")).click();
	drivers.driver.switchTo().defaultContent();



	drivers.driver.switchTo().frame(drivers.driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
	drivers.driver.findElement(By.xpath("//a[@href='#']")).click();

	drivers.driver.switchTo().window(p);

	drivers.driver.findElement(By.xpath("//input[@name='save']")).click();
	Thread.sleep(2000);
//-------------------------Closing the case--------------------------------------
	drivers.driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Close Case']")).click();

	Select CaseStatus = new Select(drivers.driver.findElement(By.id("cas7")));
	CaseStatus.selectByVisibleText("Completed");
	drivers.driver.findElement(By.xpath("//div[@class='pbHeader']//td[@class='pbButton']//input[@name='save']")).click();

	drivers.driver.findElement(By.xpath("//a[contains(text(),'SO-')]")).click();	
	return;
	
}


}
