package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Techlistic {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Dhina\\Dhina_Sele\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		/*WebElement firstname= driver.findElement(By.name("firstname"));
		firstname.sendKeys("karpaga");
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("S");
		
		WebElement gender= driver.findElement(By.id("sex-1"));
		gender.click();
		
		WebElement exp= driver.findElement(By.id("exp-4"));
		exp.click();
		
		WebElement date= driver.findElement(By.id("datepicker"));
		date.sendKeys("01-01-2001");
		
		WebElement profession= driver.findElement(By.id("profession-0"));
		profession.click();
		WebElement profession1= driver.findElement(By.id("profession-1"));
		profession1.click();
		
		WebElement tool= driver.findElement(By.id("tool-0"));
		tool.click();
		
		WebElement continent= driver.findElement(By.id("continents"));
		Select s=new Select(continent);
		s.selectByVisibleText("Asia");*/
		
		WebElement command= driver.findElement(By.id("selenium_commands"));
		Select y=new Select(command);
		y.selectByVisibleText("Browser Commands");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		j.executeScript("window.scrollTo(0,675.5555419921875)");
		
		WebElement file= driver.findElement(By.id("submit"));
		file.click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
