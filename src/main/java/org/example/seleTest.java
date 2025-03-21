package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleTest {
    private String url;

    public seleTest(String url) {
        this.url = url;
    }
    public  String getUrl  () {
        System.setProperty("webdriver.chrome.driver ", this.url );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        return driver.getCurrentUrl();
    }
    public String getTitel() {
        System.setProperty("webdriver.chrome.driver ", this.url );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        return driver.getTitle();
    }
}
