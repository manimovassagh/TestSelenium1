package testWithSeleniumAsynchFirst;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHello {
	WebDriver driver;

	@Before
	public void beforeTest() {

		System.out.println("Start The TEst Automation");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://codingsolo.de");

	}

	@After
	public void afterTests() {
		System.out.println("Test abgeschlossen. - Aufräumen");
		driver.close();
	}

	@Test
	public void testTitle() {
		String expect = "coding blog - Coding Solo | programmierblog | tutorials | Videos";

		driver.findElement(By.cssSelector("#header_main > div > div > span > a > img")).click();
		driver.findElement(By.cssSelector("#cookie_action_close_header")).click();
		assertEquals(expect, driver.getTitle());
		assertEquals(expect, "coding blog - Coding Solo | programmierblog | tutorials | Videos");
	}
}
