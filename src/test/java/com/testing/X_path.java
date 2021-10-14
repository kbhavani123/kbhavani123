package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class X_path {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https:\\www.myntra.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("ethnic wear for women");
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class='desktop-main' and text()='Men']")).click();
		driver.findElement(By.xpath("//a[@class='desktop-main' and text()='Women']")).click();
		driver.findElement(By.xpath("//span[text()='Profile'] ")).click();
		driver.close();
	}
}
