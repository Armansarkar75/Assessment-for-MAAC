package MAAC;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UpdateProfile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.xampro.org/");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();//(Remove add)
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/nav/div/div/div/div[4]/div[2]/a[1]/div/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("armansarkar715@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("arman715");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div/div/div[1]/form/div[4]/div/button/div/img")).click();
		
		WebElement EL = driver.findElement(By.xpath("//div[@class='profile-view-btn nav-item dropdown']//a[@id='basic-nav-dropdown']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("EL"))); 
		
		EL.click();
		// Can to be Automated because selenium webdriver unable to locate the element.
		
	}

}
