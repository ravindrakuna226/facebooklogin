package facebook1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","D:\\Automationfiles\\msedgedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email") ).sendKeys("deepika.kpd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("riojan2015");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector("div[aria-label='Account']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		driver.close();

	}

}
