package org.cts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScrpitExecutor {
	
	public static void main(String[] args){
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Dhina\\Dhina_Sele\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        
        driver.manage().window().maximize();
        
        Dimension d=new Dimension(2000,1000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,2250)", "");
	}
}
