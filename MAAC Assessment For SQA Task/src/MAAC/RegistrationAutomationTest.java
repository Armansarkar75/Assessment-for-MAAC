package MAAC;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationAutomationTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.xampro.org/");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();//(Remove add)
		
		//(Registration form Test Automation) 
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/nav/div/div/div/div[4]/div[2]/a[2]/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Md Arman Ali");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("armansarkar715@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("phoneNumber")).sendKeys("01311848915");
		Thread.sleep(1000);
		//Password
		driver.findElement(By.id("password")).sendKeys("arman725");
		//check toggle is open
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div/div[2]/form/div[4]/div/div/span/i")).click();
		Thread.sleep(1000);
		//check toggle is off
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div/div[2]/form/div[4]/div/div/span/i")).click();
		Thread.sleep(1000);
		//Confirm password
		driver.findElement(By.id("confirmPassword")).sendKeys("arman725");
		//check toggle is open
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div/div[2]/form/div[5]/div/div/span/i")).click();
		Thread.sleep(1000);
		//check toggle is off
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div/div[2]/form/div[5]/div/div/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div/div[2]/form/div[6]/div/button/div/img")).click();
		
		//(Sign In or Login form Test Automation click by Sign In which given in registration page)
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[3]/div/div[3]/p/a")).click();
		
		driver.findElement(By.id("email")).sendKeys("armansarkar715@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("arman715");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div/div/div[1]/form/div[4]/div/button/div/img")).click();
		
		//Update profile
		
		//driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]")).click();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]")).click();
		//driver.findElement(By.cssSelector("#basic-nav-dropdown")).click();


	}

}
