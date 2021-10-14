package com.testing;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
	public class Launch_firefox {
		private static final TimeUnit TimeUnit = null;

		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https:\\www.gmail.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("identifierId")).sendKeys("kbhavani949@gmail.com",Keys.ENTER);
			driver.findElement(By.name("password")).sendKeys("nevergiveup@123" ,Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit);
			driver.close();
			}
		}


