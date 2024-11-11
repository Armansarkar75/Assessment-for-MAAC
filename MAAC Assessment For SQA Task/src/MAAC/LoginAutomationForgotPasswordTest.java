package MAAC;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationForgotPasswordTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.xampro.org/");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();//(Remove add)
		driver.findElement(By.xpath("/html/body/div/div/div[2]/nav/div/div/div/div[4]/div[2]/a[1]/div/span")).click();
		driver.findElement(By.id("email")).sendKeys("armansarkar715@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("arman725");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div/div/div[1]/form/div[2]/div/div/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div/div/div[1]/form/div[2]/div/div/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div/div/div[1]/form/div[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("armansarkar715@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div/div/form/button")).click();

	}

}
