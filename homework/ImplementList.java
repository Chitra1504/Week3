package week3.homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Home Assignment <5>: Implementing List Interface
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("rilrtl-button")).click();
		driver.findElement(By.xpath("//*[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@for='Men - Fashion Bags']")).click();
		List<WebElement> bags=driver.findElements(By.xpath("//*[@role='gridcell']"));
		System.out.println("The count of products in the page is "+bags.size());
		List<WebElement> bagsBrand=driver.findElements(By.className("brand"));
		System.out.println("The list of brands in the page");
		for(WebElement bagBrand:bagsBrand)
			System.out.println(bagBrand.getText());
		List<WebElement> bagNames=driver.findElements(By.className("nameCls"));
		System.out.println("The list of bag names in the page");
		for(WebElement bagName:bagNames)
			System.out.println(bagName.getText());
	}

}
