package com.sva.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {


    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }

    }

    public static String linkcheck() {


        String currentWindow = Driver.getDriver().getWindowHandle();
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : handles) {
            if (!windowHandle.equals(currentWindow)) {
                Driver.getDriver().switchTo().window(windowHandle);
                break;
            }
        }


        String newWindowUrl = Driver.getDriver().getCurrentUrl();
        return newWindowUrl;
    }


}