package AutomateEcommerce;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AutomateFlipkart {
	WebDriver driver;
	  @Test
	  public void f() throws IOException
	  
	  {
		 //1
		  driver.get("https://www.flipkart.com/");  
		  //2
		  System.out.println("The title of the page is :" + driver.getTitle()); 
	      Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
	                "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
	      System.out.println("load time is :"+loadtime);
	      //3
	      driver.findElement(By.name("q")).sendKeys("iphone 13");
	      driver.findElement(By.className("L0Z3Pu")).click();
	      WebElement i = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
			Boolean check = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
					+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

			if (check) {
				System.out.println("Image is loaded");
			} else {
				System.out.println("Image not loaded");
			}

	      //4
	      driver.get("https://www.flipkart.com/apple-iphone-13-midnight-128-gb/p/itmca361aab1c5b0?pid=MOBG6VF5Q82T3XRS&lid=LSTMOBG6VF5Q82T3XRSOXJLM9&marketplace=FLIPKART&q=iphone+13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=a2b529bf-6e47-4950-b0e3-33ca14d03be1.MOBG6VF5Q82T3XRS.SEARCH&ppt=hp&ppn=homepage&ssid=2dpx9e0d7k0000001665379065155&qH=c68a3b83214bb235\"");
	      
	      //5
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("scrollBy(0, 2500)");


	      try {
	          long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

	          while (true) {
	              ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
	              Thread.sleep(2000);

	              long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
	              if (newHeight == lastHeight) {
	                  break;
	              }
	              lastHeight = newHeight;
	          }
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
	      
	  
	  
		  
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		// set path of Chromedriver executable
	      System.setProperty("webdriver.chrome.driver", "E:\\chrome connector/chromedriver.exe");
	     
	      // initialize new WebDriver session
	      driver = new ChromeDriver();
	      
	   		// Refresh browser
	   		driver.navigate().refresh();

	   		  }
	  @Test(groups="Firefox")
	  public void LaunchFirefox() {
	      System.setProperty("webdriver.gecko.driver","E:\\fireFox connector/geckodriver.exe");
	      driver = new FirefoxDriver();
	      driver.get("https://www.flipkart.com/");
	      try {
	          Thread.sleep(4000);
	      } catch (Exception e) {
	          e.printStackTrace();
	      }
	      //2
		  System.out.println("The title of the page is :" + driver.getTitle()); 
	      Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
	                "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
	      System.out.println("load time is :"+loadtime);
	      //3
	      driver.findElement(By.name("q")).sendKeys("iphone 13");
	      driver.findElement(By.className("L0Z3Pu")).click();


	      //4
	      driver.get("https://www.flipkart.com/apple-iphone-13-midnight-128-gb/p/itmca361aab1c5b0?pid=MOBG6VF5Q82T3XRS&lid=LSTMOBG6VF5Q82T3XRSOXJLM9&marketplace=FLIPKART&q=iphone+13&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=a2b529bf-6e47-4950-b0e3-33ca14d03be1.MOBG6VF5Q82T3XRS.SEARCH&ppt=hp&ppn=homepage&ssid=2dpx9e0d7k0000001665379065155&qH=c68a3b83214bb235\"");
	      
	      //5
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("scrollBy(0, 2500)");


	      try {
	          long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");

	          while (true) {
	              ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
	              Thread.sleep(2000);

	              long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
	              if (newHeight == lastHeight) {
	                  break;
	              }
	              lastHeight = newHeight;
	          }
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
	      
	      
	  }
	  
	}