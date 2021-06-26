package com.demoqa.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript {
    public static void clickJS(WebDriver driver, By by){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",driver.findElement(by));

    }
    public static void scrollVertical(WebDriver driver){
        JavascriptExecutor executorScroll = (JavascriptExecutor) driver;
        executorScroll.executeScript("scroll(0,400)");
    }

}
