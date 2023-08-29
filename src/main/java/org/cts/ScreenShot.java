package org.cts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://amazon.com");
WebElement searchtxt=driver.findElement(By.id("twotabsearchtextbox"));
searchtxt.sendKeys(Keys.chord(Keys.SHIFT,"shoe"));
	TakesScreenshot shot= (TakesScreenshot) driver;
	File src=shot.getScreenshotAs(OutputType.FILE);
	Files.copy(src, new File ("C:\\Users\\admin\\Desktop\\Java\\amazon_shoe"));
	Thread.sleep(2000);
//Actions a= new Actions(driver);

	driver.close();
	
	
	}

}
