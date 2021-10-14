package com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome {
	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-cart")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("nevergiveup@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		driver.get("https:\\www.amazon.com"); // get method
		driver.manage().window().maximize();
		driver.findElementById("twotabsearchtextbox");
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
		driver.quit();
	}
}
