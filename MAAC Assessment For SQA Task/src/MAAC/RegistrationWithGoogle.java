package MAAC;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationWithGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.xampro.org/");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();//(Remove add)
		
		//(Registration form Test Automation with google) 
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[4]/div[2]/a[2]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/a[1]")).click();//google button click
		//driver.findElement(By.cssSelector("div.App div.student-login-main-wrap.signup-page div.account-profile"
				//+ "-main-area div.account-main-right-submit-info div.student-account-form-wrap div.login-form div.account-with-social-"
				//+ "media-link-bx-area div.account-with-social-media-single-link-items"
				//+ "-wrap:nth-child(2) > a.account-with-social-media-google-plus")).click();
		//driver.findElement(By.linkText("Google")).click();
	}

}

