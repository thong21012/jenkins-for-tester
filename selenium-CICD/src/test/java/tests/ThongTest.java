package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ThongTest {
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        ChromeOptions options = new ChromeOptions();

        // Đọc parameter từ command line
        String headless = System.getProperty("headless", "false");
        if ("true".equals(headless)) {
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
        }

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
        System.out.println("Đây là test case 1");
        driver.get("https://www.google.com/");

    }

    @Test
    public void test2(){
        System.out.println("Đây là test case 2");
        driver.get("https://www.google.com/");
    }

    @AfterClass
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
