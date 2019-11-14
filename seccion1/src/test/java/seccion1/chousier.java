package seccion1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Dimension;


public class chousier {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/driverchrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(974, 860));;
		driver.get("https://www.choucairtesting.com/");
	}
	
	@Test
	public void secicionSerChoucair() {
		
		driver.findElement(By.cssSelector(".mob-icon-menu")).click();
		driver.findElement(By.linkText("Empleos")).click();
		{
		WebElement element = driver.findElement(By.cssSelector(".elementor-element-e42abd8 .elementor-animation-grow"));
		Actions builder = new Actions(driver);
	    builder.moveToElement(element).perform();
		}
	    driver.findElement(By.cssSelector(".elementor-element-e42abd8 .elementor-animation-grow")).click();

	}
}
