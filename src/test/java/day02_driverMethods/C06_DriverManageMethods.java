package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Her projenin basina ustteki 4 asamayi yapmak zorundayiz
        // Gittigimiz sayfa acilincaya veya aradigimiz web elemen bulununcaya kadar driver in bekleyecegi maximum sureyi belirler.

        driver.get("https://www.kar360.com");
        driver.close();


    }
}
