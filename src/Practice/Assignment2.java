package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name'][1]")).sendKeys("Joel");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("joelpinto@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("joelpinto");
		driver.findElement(By.id("exampleCheck1")).click();
//		driver.findElement(By.id("exampleFormControlSelect1")).click();
//		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");
		
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("05-06-2022");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

		
		
	}

}
