package example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Tests {

    @Test
    public void testOne() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("q")).submit();
        driver.quit();
    }
}