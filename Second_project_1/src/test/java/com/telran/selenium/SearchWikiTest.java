package com.telran.selenium;

import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWikiTest{
    WebDriver viki;
    @Test

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");

}

}
