package LetsTest.Testing_SE;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='userid']")).sendKeys("pruthviravanaboina");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Pruthvi@0007");
		driver.findElement(By.xpath("//input[@aria-autocomplete='list' and @aria-controls='pr_id_1_list']")).sendKeys("sbc");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@role='option' and @class='ng-tns-c57-8 ng-star-inserted ui-autocomplete-list-item ui-corner-all'][1]")).click();
		driver.findElement(By.xpath("//input[@aria-autocomplete='list' and @aria-controls='pr_id_2_list']")).sendKeys("kcg");
		driver.findElement(By.xpath("//li[@role='option' and @class='ng-tns-c57-9 ng-star-inserted ui-autocomplete-list-item ui-corner-all'][1]")).click();
		driver.findElement(By.xpath("//span[@class='ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();
		driver.findElement(By.xpath("//li[@role='option' and @aria-label='Sleeper (SL)']")).click();
		
//		driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pruthvi3191@gmail.com");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pruthvi@0007");
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		driver.close();
	}

}
