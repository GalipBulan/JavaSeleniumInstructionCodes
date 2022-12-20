package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // driver.navigate().to  // get ile ayni islevi yapar

        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(3000);

        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);


        // Yeniden amazon a gidelim

        driver.navigate().back();

        Thread.sleep(3000);

        // Tekrar wisequarte gitmek istersek

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.close();
    }
}
