package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class handleAlert extends BrowserSetup{

    @Test
    public void test_Alert() throws InterruptedException {
    browser.get("https://the-internet.herokuapp.com/javascript_alerts");


        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
        Thread.sleep(2000);

        Alert alert = browser.switchTo().alert();
        System.out.println(alert.getText());

        alert.accept();
        Thread.sleep(2000);


        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
        Thread.sleep(2000);

        alert = browser.switchTo().alert();
        System.out.println(alert.getText());

        alert.dismiss();
        System.out.println(getElement(By.xpath("//p[@id='result']")).getText());



        clickOnElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        Thread.sleep(2000);

        alert = browser.switchTo().alert();
        System.out.println(alert.getText());

        alert.sendKeys("Hello");
        alert.accept();
        System.out.println(getElement(By.xpath("//p[@id='result']")).getText());
        Thread.sleep(2000);
    }
}
