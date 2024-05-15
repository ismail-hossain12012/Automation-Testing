package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v120.browser.Browser;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleSelectTag extends BrowserSetup {
    @Test

    public void testSelectOption() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        clickOnElement(By.id("dropdown-class-example"));
        Select select = new Select(getElement(By.id("dropdown-class-example")));
        select.selectByVisibleText("Option2");
        Thread.sleep(2000);

        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(2000);

        select.selectByValue("option1");
        Thread.sleep(2000);

        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);

        System.out.println(select.getFirstSelectedOption().getText());

         List <WebElement> options =  select.getOptions();
         for (WebElement option : options){
             System.out.println(option.getText());
         }
    }
}
