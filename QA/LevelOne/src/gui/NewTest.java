package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void OpenBrowser() throws InterruptedException {
	  WebDriver obj;
	  System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM TRAINING\\SETUP\\geckodriver.exe");
	  obj=new FirefoxDriver();
	  obj.manage().window().maximize();
	  obj.get("file:///D:/ITU/GIT/MyWork/FinalProject/pioneers/Development/index.html");
	  System.out.println("Clicking on Links");
	  for(int i=1;i<=10;i++){
	  obj.findElement(By.xpath(".//*[@id='links']/li["+i+"]/a")).click();
	  System.out.println("Clicked on the link "+obj.findElement(By.xpath(".//*[@id='links']/li["+i+"]/a")).getText());
	  Thread.sleep(2000);
	  
	  }
  }
  @Test
  public void levelTwo(){
	  System.out.println("Verify level two Navigations");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Open Application Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Open Application Method");
  }

}
