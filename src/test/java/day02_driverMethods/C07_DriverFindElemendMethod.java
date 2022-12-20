package day02_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverFindElemendMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.clear();
        Thread.sleep(4000);




        aramaKutusu.sendKeys("lichtmaschine");
        Thread.sleep(4000);
        aramaKutusu.clear();

        aramaKutusu.sendKeys("golf 6 thermostat");
        aramaKutusu.submit();


        Thread.sleep(4000);
        driver.close();
    }
}
