package day02_driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Selenium'u kullanarak Chrome tarayıcısını açın
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        // WebDriver driver = new ChromeDriver();

        // Amazon ana sayfasına gidin
        driver.get("https://www.amazon.com");

        // Arama kutusuna "Nutella" yazın ve arama düğmesine tıklayın
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella");
        searchBox.submit();

        Thread.sleep(4000);

        // Sonuç sayısını bulun
        WebElement resultCount = driver.findElement(By.cssSelector("#s-result-count"));

        // Sonuç sayısını yazdırın
        System.out.println(resultCount.getText());

        driver.close();
    }
}
