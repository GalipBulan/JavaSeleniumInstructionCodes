package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_Driver_get {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://www.amazon.com");



        System.setProperty("webdriver.firefox.driver","C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs");

        WebDriver driver2 = new FirefoxDriver();

        driver2.get("https://www.amazon.com");




    }
}
