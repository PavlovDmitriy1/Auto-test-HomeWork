package org.example;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class AppTest 
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
    }
}
