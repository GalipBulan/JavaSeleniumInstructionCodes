package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Driver_methods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chorome.driver","src/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getPageSource()); // Sayfanin kaynak kodlarini getirir..

        String pageSource = driver.getPageSource();

        String expectedKelime= "MEOV";

        if (pageSource.contains(expectedKelime))

            System.out.println();

        else {

            System.out.println();
        }

        driver.close();


    }
}
