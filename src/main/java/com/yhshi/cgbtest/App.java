package com.yhshi.cgbtest;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.ImeHandler;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class App 
{
    public static void main( String[] args )
    {
    	//ChromeOptions options = new ChromeOptions();
    	//options.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver();
        String urlString = "http://192.168.43.179:8090/login/index.html";
        String userName = "wangzhijia";
        String passWord = "cgb20181123";
        
        driver.get(urlString);
        
        WebElement logInElement = (new WebDriverWait(driver, 20))
        		.until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));
        
        //driver.manage().deleteAllCookies();
        //driver.manage().addCookie(new Cookie("JSESSIONID","DFDFAA48951E52F9E3E6E51C9D26029B","192.168.43.179","/",null));
        
        //driver.get(urlString);
        
        //logInElement = new WebDriverWait(driver, 20)
        	//	.until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));
        
        List<WebElement> inputElements = driver.findElements(By.tagName("input"));
        WebElement userNameElement = inputElements.get(0);
        WebElement pwElement = inputElements.get(1);
        userNameElement.clear();
        userNameElement.click();
        userNameElement.sendKeys(userName);
        pwElement.click();
        try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_G);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_0);
			robot.keyRelease(KeyEvent.VK_0);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			//Thread.sleep(2000);
			pwElement.click();
			robot.keyPress(KeyEvent.VK_8);
			robot.keyRelease(KeyEvent.VK_8);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_1);
			robot.keyRelease(KeyEvent.VK_1);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_2);
			robot.keyRelease(KeyEvent.VK_2);
			//Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
			//Thread.sleep(2000);
		} catch (AWTException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //catch (InterruptedException e) {
			// TODO: handle exception
		//}
        //pwElement.sendKeys("c");
        //pwElement.sendKeys("2018");
        //pwElement.sendKeys("1123");
        
        logInElement.click();
        
        WebElement shglElement = (new WebDriverWait(driver, 10))
        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='审核管理']")));
        shglElement.click();
        
        WebElement fbshElement = (new WebDriverWait(driver, 10))
        		.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='发布审核']")));
        fbshElement.click();
        
        WebElement waitMElement = (new WebDriverWait(driver, 10))
        		.until(ExpectedConditions.presenceOfElementLocated(By.id("tab-waitme")));
        
        
        driver.quit();
        
        }
}
