package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandelAssertion extends BrowserSetup{

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        getElement(By.cssSelector("input[value='radio1']")).click();
        getElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello");
        String optionName = getElement(By.xpath("//label[@for='bmw']")).getText();
        System.out.println(optionName);
        Thread.sleep(2000);
        getElement(By.xpath("//input[@id='autocomplete']")).clear();
        Thread.sleep(2000);
        getElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi");
        String placeholder = getElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
        System.out.println(placeholder);

        String fontSize = getElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color");
        System.out.println(fontSize);
        Boolean isSelect = getElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println(isSelect);
        getElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        isSelect = getElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println(isSelect);
        System.out.println("-----------------------------------------");
        Boolean isDisplay = displayStatus(By.xpath("//input[@id='displayed-text']"));
        System.out.println(isDisplay);
        getElement(By.id("hide-textbox")).click();
        isDisplay = displayStatus(By.xpath("//input[@id='displayed-text']"));
        System.out.println(isDisplay);
        browser.get("https://www.google.com");
        System.out.println("-----------------------------------------");
        Boolean isEnable = getElement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
        System.out.println(isEnable);
    }

}