package com.telran.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWikiTest{
    WebDriver driver;
    //@Test

    public void setUp(){
      driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");

}

}
