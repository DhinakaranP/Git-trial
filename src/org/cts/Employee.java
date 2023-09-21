package org.cts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Employee {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Dhina\\Dhina_Sele\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement newaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newaccount.click();
		
		Thread.sleep(3000);
		
		WebElement firstname= driver.findElement(By.name("firstname"));
		firstname.sendKeys("karpaga");
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("S");
		
		WebElement mobno= driver.findElement(By.name("reg_email__"));
		mobno.sendKeys("9876543212");
		
		WebElement pass= driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("S");
		
        Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select dd=new Select(date);
		dd.selectByVisibleText("27");
		
		List<WebElement> day = dd.getOptions();
		for (int i = 0; i < day.size(); i++) {
			WebElement element = day.get(i);
			String text = element.getText();
			System.out.println(text);
			
			
		}
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s=new Select(month);
		s.selectByValue("8");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select yy=new Select(year);
		yy.selectByVisibleText("2022");
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		
		


}
}
