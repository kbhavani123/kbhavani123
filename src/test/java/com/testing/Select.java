package com.testing;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Select {
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		/*
		 * Selecting Dropddown
		 */
		driver.findElement(By.partialLinkText("Table")).click();
		/*
		 * printing all the elements present in a Dropdown
		 *
		 */
		WebElement block = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[3]/ul"));
		System.out.println("Text is :" + block.getText());

		List<WebElement> filter = block.findElements(By.tagName("a"));
		filter.get(3);
		System.out.println("Total elements:" + filter.size());

	}

}