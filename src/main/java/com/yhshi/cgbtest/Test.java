package com.yhshi.cgbtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://oa.joyintech.com");
		
		WebElement userNamElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("loginid")));
		WebElement passWordElement = driver.findElement(By.id("userpassword"));
		List<WebElement> logInElements = driver.findElements(By.id("login"));
		userNamElement.sendKeys("shiyunhao");
		passWordElement.sendKeys("syhattack9353");
		logInElements.get(0).click();
		
		(new WebDriverWait(driver, 10))
		.until(ExpectedConditions.presenceOfElementLocated(By.className("logout")));
		
		driver.quit();
		
	}
}
