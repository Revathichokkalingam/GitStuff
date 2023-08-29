package org.cts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Macbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WebDriver driver= new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 * driver.get("https://www.amazon.com/");
		 */

}
//li.stream().filter(s->s.getText().equals("macbook air 13 inch")).cl
public static void Macbook15() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook");
	//div[@class='s-suggestion-container']/div[@aria-label='macbook air 13 inch']
	driver.findElement(By.xpath("//div[@class='s-suggestion-container']/div[@aria-label='macbook air 13 inch']")).click();
	/*List<WebElement> li =driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div"));

	for(int i=0;i<li.size();i++) {
		if(li.get(i).getText().equals("macbook air 13 inch")) {
			li.get(i).click();
		}*/
}
	}


