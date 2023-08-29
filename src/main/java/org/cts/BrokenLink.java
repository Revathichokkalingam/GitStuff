package org.cts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.amazon.com/");
List<WebElement> links=driver.findElements(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']/descendant::a"));
List<String> urls=links.parallelStream().map(s->s.getAttribute("href")).collect(Collectors.toList());
urls.parallelStream().forEach(s->s.link(s));

	}
public static void link(String url) {
	try {
		HttpURLConnection check = (HttpURLConnection) new URL(url).openConnection();
		check.setRequestMethod("Head");
		check.connect();
		if(check.getResponseCode()>=400) {
			System.out.println("Broken link"+url);
		}
		System.out.println(url);
	}
	
	catch(Exception e) {
		
	}
}
}
