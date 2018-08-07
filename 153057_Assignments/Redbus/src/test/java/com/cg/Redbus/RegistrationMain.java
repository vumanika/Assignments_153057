package com.cg.Redbus;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class RegistrationMain {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Homepage page = PageFactory.initElements(driver, Homepage.class);
		page.src.sendKeys("Pune");
		Thread.sleep(2000);
		page.src.sendKeys(Keys.ENTER);
	
		//page.src1.click();
		
		page.dest.sendKeys("Hyderabad");
		Thread.sleep(2000);
		page.dest.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//page.dest1.click();
		page.boardingdate.sendKeys("");
		Thread.sleep(2000);
		page.boardingdate1.click();
		Thread.sleep(10000);
		page.search.click();
		Thread.sleep(10000);
		page.seats.click();
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"rt_9455434\"]/div/div/div/div[3]/div[2]/div[2]/canvas"));
        Actions action=new Actions(driver);
        action.moveToElement(element, 60,40).click().build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"9455434\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"9455434\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"9455434\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"seatno-04\"]")).sendKeys("RAM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"22_0\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"seatno-01\"]")).sendKeys("21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"seatno-05\"]")).sendKeys("vunnam@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"seatno-06\"]")).sendKeys("7842280695");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div/label[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")).click();
		Thread.sleep(2000);
	}
}
