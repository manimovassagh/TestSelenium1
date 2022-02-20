import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class FirstTest {

    WebDriver driver;


    @Before
    public void beforeTest(){

        System.out.println("Start The TEst Automation");
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://codingsolo.de");

    }



    @AfterEach
    void afterTests() {
        System.out.println("Test abgeschlossen. - Aufräumen");
        driver.close();
    }

    @Test
    public void testTitle() {
        String expect ="coding blog - Coding Solo | programmierblog | tutorials | Videos";

        driver.findElement(By.cssSelector("#header_main > div > div > span > a > img")).click();
        assertEquals(expect, driver.getTitle());
    }
}
