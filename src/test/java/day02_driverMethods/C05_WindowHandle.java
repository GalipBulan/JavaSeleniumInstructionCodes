package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandle {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ramazon.com");


        driver.getWindowHandle(); // CDwindow-F6A13F75D73BE8C791891A7FF87BCF11


        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());



        Thread.sleep(4000);

        driver.quit();

        driver.close();


    }
}
