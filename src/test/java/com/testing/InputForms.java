package com.testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputForms {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-message\"]")).sendKeys("wavelabs for AI");
		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("(//a[text()='Checkbox Demo'])[2]")).click();
		driver.findElement(By.xpath("//*[@id='isAgeSelected']")).click();
		
		for (int i = 2; i <= 5; i++) {
			driver.findElement(By.xpath("(//input[@type='checkbox'])[" + i + "]")).click();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[2]/input")).click();
		driver.findElement(By.xpath("//button[text()='Get Checked value']")).click();
		driver.findElement(By.xpath("//button[text()='Get Checked value']")).isSelected();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("(//a[text()='Select Dropdown List'])[2]")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		select.selectByVisibleText("Monday");
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("(//a[text()='Input Form Submit'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Bhavani");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("K B");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhavanik358@gmail.com");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9110606039");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("no.12 harish nilaya");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//select[@class='form-control selectpicker']")).click();
		Select select1 = new Select(driver.findElement(By.xpath("//select[@class='form-control selectpicker']")));
		select1.selectByVisibleText("Indiana");
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("5600");
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("//https.goggle.com");
		driver.findElement(By.xpath("//input[@name='hosting']")).click();
		driver.findElement(By.xpath("//input[@name='hosting']")).click();
		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("my project title is automated ration material dispensing");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("(//a[text()='Ajax Form Submit'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Bhavani k");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("going good ,keep it up");
		driver.findElement(By.xpath("//input[@id='btn-submit']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
//		driver.findElement(By.xpath("(//a[text()='JQuery Select dropdown'])[2]")).click();
//		Select select9 = new Select(driver.findElement(By.id("country")));
//
//		   select9.selectByVisibleText("Japan");
//		Select select2 = new Select(driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]")));
//    	select2.selectByVisibleText("India");
//		Select select3 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li/input")));
//		select3.selectByVisibleText("California");
//		select9.selectByVisibleText("Indiana");
//		Select select4 = new Select(driver.findElement(By.xpath("//*[@id='select2-lx3b-container']")));
//		select4.selectByVisibleText("American Samoa");
//		Select select5= new Select(driver.findElement(By.xpath("//*[@id='files']")));
//		select5.selectByVisibleText("PHP");
//		driver.findElement(By.xpath("//a[text()='Selenium Easy']")).isDisplayed();
//		String title = driver.findElement(By.xpath("//a[text()='Selenium Easy']")).getText();
//		Assert.assertEquals("Selenium Easy", title);
		driver.close();
		}
}
