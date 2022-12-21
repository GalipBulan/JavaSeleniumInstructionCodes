package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        List<WebElement> fiyatListesi= driver.findElements(By.className("a-price-whole"));

        // Webelement bir oibje oldugundan direkt yazdirilamaz

        System.out.println(fiyatListesi);



        for (WebElement each:fiyatListesi
             ) {

            System.out.print(each.getText()+ " ");

        }

        Thread.sleep(4000);

        driver.close();


    }
}
