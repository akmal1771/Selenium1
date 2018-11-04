package com.cbt;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator"
	 		+ "\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
     driver.get("http://cybertek-bnb.herokuapp.com");
	    String title=driver.getTitle();
	    String url=driver.getCurrentUrl();
		System.out.println("Title:"+ title);
		System.out.println("Url:"+url);
		if(title.equals("Intro | cybertek-bnb")) {
			System.out.println("Title verification passed");
		}
		else {
			System.out.println("Title verifcation failed");
		}
		Random ran=new Random();
		int r=ran.nextInt(10000);
		String firstName="Akmal";
		String lastName="Omonov";
		String email="akmal"+r+"@yahoo.com";
		String password="Omo1245";
		
		driver.findElement(By.linkText("sign up")).click();
		Thread.sleep(2000);
		WebElement FName=driver.findElement(By.name("first-name"));
		FName.sendKeys("firstName");
		
		WebElement LName=driver.findElement(By.name("last-name"));
		LName.sendKeys("lastName");
		
		WebElement eMail=driver.findElement(By.name("email"));
		eMail.sendKeys(email);
		WebElement ePass=driver.findElement(By.name("password"));
		ePass.sendKeys(password);
      
        WebElement eSignUp=driver.findElement(By.xpath("//button[.='sign up']"));
        
		if(driver.getTitle().equalsIgnoreCase("Sing in | cybertek-bnb")) {
			System.out.println("Sign up successfully");
		}
		else {
			System.out.println("Sign up failed");
		}
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.xpath("//button[.='sign in']")).click();

   String loggedInTitle=driver.getTitle();
    if(loggedInTitle.equals("Map | cybertek-bnb")) {
    	System.out.println("User signed-in successfully");
    }
    else {System.out.println("Sign in failed");}
	
	
	WebDriver driver2 = new ChromeDriver();
	driver2.get("https://amazon.com");
	}
}
