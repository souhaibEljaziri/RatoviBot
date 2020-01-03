/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratovibot;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Montasser
 */
public class Ratovi {
    public  List<WebElement> chmps ; 
    public  List<WebElement> list ; 
    public  List<WebElement> builds ; 
    public  WebDriver driver ; 
    public static Ratovi r1 = new Ratovi()  ; 
    
    
    public void setDriver(String url){
    this.driver.get(url);
    
    }
    public WebDriver getDriver(){
        if (this.driver==null){
            this.driver=new ChromeDriver() ; 
        }
         return this.driver;   
    }
    public  WebDriver connect (String username , String password  , String server ){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Montasser\\Desktop\\projects\\librery\\chromedriver_win32\\chromedriver.exe");
       String osClient = System.getProperty("os.name"); 
       System.out.println(osClient);
        ChromeOptions chromeOptions = new ChromeOptions();
	  //    chromeOptions.addArguments("--headless");
	   //   chromeOptions.addArguments("start-maximized");
	      chromeOptions.addArguments("--disable-gpu");
	      chromeOptions.addArguments("--disable-extensions");
	     chromeOptions.addArguments("--headless");
		
		
       driver=new ChromeDriver(chromeOptions) ; 
       driver=getDriver();
       setDriver(server); 
       driver.findElement(By.name("name")).sendKeys(username) ; 
       driver.findElement(By.name("password")).sendKeys(password) ; 
       driver.findElement(By.id("btn_login")).click();
        
      // System.out.println(list.get(1).getAttribute("td//div//a//href"));

       
      
     

      return driver ; 
        
    
    }
}
