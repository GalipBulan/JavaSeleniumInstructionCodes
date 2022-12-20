package day02_driverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Driver_methods {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver" , "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        // Sayfayi tam ekran yapalim

        driver.manage().window().maximize();
        System.out.println("Maximize window boyutlari :" + driver.manage().window().getSize());
        System.out.println("Maximize window boyutlari :" + driver.manage().window().getPosition());

        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen window boyutlari :" + driver.manage().window().getSize());
        System.out.println("fullscreen window boyutlari :" + driver.manage().window().getPosition());



        // SAyfayi istedigimiz olculere getirelim

        driver.manage().window().setPosition(new Point(100, 100));


        Thread.sleep(3000);

        driver.close(); // Acilmis olan Browser i kapatir..


    }
}
