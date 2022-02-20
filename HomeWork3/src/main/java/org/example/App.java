package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class App
{
    public static void main( String[] args ){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://demowebshop.tricentis.com/register");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@class = \"ico-login\"]")).click();
        driver.findElement(By.xpath("//input[@class = \"email\"]")).sendKeys("pavlov7058@mail.ru");
        driver.findElement(By.xpath("//input[@class = \"password\"]")).sendKeys("user1234");
        driver.findElement(By.xpath("//input[@class = \"button-1 login-button\"]")).submit();
        driver.findElement(By.xpath("//ul[@class = \"top-menu\"]/li/a")).click();
        driver.findElement(By.xpath("//input[@class = \"button-2 product-box-add-to-cart-button\"]")).click();
        driver.findElement(By.xpath("//a[@class = \"ico-cart\"]")).click();
        driver.findElement(By.xpath("//input[@name = \"removefromcart\"]")).click();
        driver.findElement(By.xpath("//input[@name = \"updatecart\"]")).click();



    }
}
