package com.yhshi.cgbtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	
	private WebDriver driver;
	private WebElement userNameElement;
	private WebElement passWordElement;
	private String userName;
	private String passWord;
	
	public LogIn(WebDriver driver,String userName,String passWord) {
		this.driver = driver;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public void logIn() {
		
	}
	
	public WebElement getUserNameElement() {
		return driver.findElements(By.tagName("input")).get(0);
	}
	
	public WebElement getPassWordElement() {
		return driver.findElements(By.tagName("input")).get(1);
	}
	
	public WebElement getLogInBtnElement() {
		return driver.findElement(By.tagName("button"));
	}
	
	
}
