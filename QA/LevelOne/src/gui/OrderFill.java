package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrderFill {
  @Test
  public void OrderFilling() throws InterruptedException {
	  WebDriver obj;
	  System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM TRAINING\\SETUP\\geckodriver.exe");
	  obj=new FirefoxDriver();
	  obj.manage().window().maximize();
	  obj.get("file:///D:/ITU/GIT/MyWork/FinalProject/pioneers/Development/index.html");
	  System.out.println("Clicking on Orders");
	  obj.findElement(By.xpath(".//*[@id='links']/li[8]/a")).click();
	  System.out.println("Clicked on the Orders Link");
	  obj.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Pioneers");
	  obj.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("Project");
	  Thread.sleep(2000);
	  obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[3]/td[2]/textarea")).sendKeys("Pioneers Address"+Keys.ENTER+"Street Number 1"+Keys.ENTER+"California");
	  obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("Santa Clara");
	  obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[5]/td[2]/input")).sendKeys("California");
	  obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[6]/td[2]/input")).sendKeys("95051");
	  Thread.sleep(2000);
	  obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[7]/td[2]/input")).sendKeys("(408)-718-1144");
	  obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[8]/td[2]/input")).sendKeys("pioneers@gmail.com");
	  obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[9]/td[2]/input")).sendKeys("4101124564245544");
	  Thread.sleep(2000);
//	  Select objSelCard=new Select(obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[10]/td[2]/select")));
//	  objSelCard.selectByVisibleText("Visa");
//	  Select objSelMonth=new Select(obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[11]/td[2]/select[1]")));
//	  objSelMonth.selectByVisibleText("SEPtEMBER");
//	  Select objSelYear=new Select(obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[11]/td[2]/select[2]")));
//	  objSelYear.selectByVisibleText("2016");
	  obj.findElement(By.xpath("html/body/form/fieldset[1]/table/tbody/tr[12]/td[2]/textarea")).sendKeys("What and Why"
	  		+ "is a very good project and helpful"+Keys.ENTER+"Thank you for developing");
	  obj.findElement(By.xpath("html/body/form/fieldset[2]/table/tbody/tr[2]/td[4]/input")).sendKeys("3");
	  obj.findElement(By.xpath("html/body/form/fieldset[2]/table/tbody/tr[2]/td[5]/input")).sendKeys("600");
	  Thread.sleep(2000);
	  obj.findElement(By.xpath("html/body/form/fieldset[2]/table/tbody/tr[6]/td[2]/input")).sendKeys("600");
	  Thread.sleep(2000);
	  obj.findElement(By.xpath("html/body/form/fieldset[2]/table/tbody/tr[23]/td[2]/input")).sendKeys("600");
	  obj.findElement(By.xpath(".//*[@id='submitsection']/button[1]")).click();
  }
}
