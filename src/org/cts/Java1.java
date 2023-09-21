package org.cts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Java1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\eclipse-workspace\\Dhina\\Dhina_Sele\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//WebElement username = driver.findElement(By.id("email"));
		//username.sendKeys("dhina");
		
		//WebElement password = driver.findElement(By.name("pass"));
		/*password.sendKeys("pass");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();*/
		
		WebElement newaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newaccount.click();
		
		/*WebElement firstname= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("karpaga");
		WebElement lastname= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		lastname.sendKeys("S");
		
		WebElement mobno= driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobno.sendKeys("9876543212");
		
		WebElement pass= driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("S");*/
		
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select dd=new Select(date);
		dd.selectByVisibleText("1");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s=new Select(month);
		s.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("Year"));
		Select yy=new Select(year);
		yy.selectByIndex(2);
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		gender.click();
		
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
