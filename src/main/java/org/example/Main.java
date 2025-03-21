package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver ", "/Users/harel/Downloads/chromedriver-mac-arm64/chromedriver ");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        // driver.manage().window().maximize();
        Thread.sleep(2500);
        //driver.quit();
        WebElement element = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
        element.click();
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        element.click();
        element.sendKeys("harel");
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
        element.click();
        element.sendKeys("harel@harel1.com");
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[4]"));
        element = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
        element.click();
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[1]/div[1]/label/div/span/input"));
        element.click();
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[4]/input"));
        element.click();
        element.sendKeys("Aa123456");
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[6]"));
        element.click();
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[3]"));
        element.click();
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[42]"));
        element.click();
        Thread.sleep(2500);
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[1]/input"));
        element.sendKeys("xxx1");
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[2]/input"));
        element.sendKeys("xxx2");
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[3]/input"));
        element.sendKeys("xxx3");
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[4]/input"));
        element.sendKeys("xxx4");
        element = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
        element.sendKeys("xxx5");
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select/option[5]"));
        element.click();

        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[7]/input"));
        element.sendKeys("israel");
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[8]/input"));
        element.sendKeys("Tel Aviv");
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[9]/input"));
        element.sendKeys("12345678");
        element = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[10]/input"));
        element.sendKeys("0501234567");
        Thread.sleep(2500);

        element = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
        element.click();


    }
}