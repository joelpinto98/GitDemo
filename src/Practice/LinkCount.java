package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerLinks = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerLinks.findElements(By.tagName("a")).size());
		WebElement columnLinks = footerLinks.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnLinks.findElements(By.tagName("a")).size());
		for (int i = 1; i < columnLinks.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnLinks.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
			Thread.sleep(5000);

		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}