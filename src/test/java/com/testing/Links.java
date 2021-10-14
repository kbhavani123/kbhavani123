package com.testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		driver.findElement(By.xpath("//a[text()='Selenium Easy']")).isDisplayed();
		String title = driver.findElement(By.xpath("//a[text()='Selenium Easy']")).getText();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='All Examples']")).isDisplayed();
		for (int i = 3; i <= 9; i++) {
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("(//ul[@id='treemenu']//following-sibling::li//a)[" + i + "]")).click();
		String link = driver.findElement(By.xpath("(//ul[@id='treemenu']//following-sibling::li//a)[" + i + "]"))
					.getText();
		System.out.println(link);
		}

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int j = 4; j <= 31; j++) {
			System.out.println(links.get(j).getText());
		}
	}
}
