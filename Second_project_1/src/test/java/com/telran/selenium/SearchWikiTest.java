package com.telran.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWikiTest{
    WebDriver viki;


    public void setUp(){
        viki = new ChromeDriver();
        viki.get("https://en.wikipedia.org");

}

}
