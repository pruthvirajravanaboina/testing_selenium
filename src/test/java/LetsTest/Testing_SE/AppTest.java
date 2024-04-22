package LetsTest.Testing_SE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AppTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pruthvi3191@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pruthvi@0007");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.close();
	}
}
