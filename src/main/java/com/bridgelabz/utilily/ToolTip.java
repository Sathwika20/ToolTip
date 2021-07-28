package com.bridgelabz.utilily;

import com.bridgelabz.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToolTip extends Base {
    public static void verifyToolTip() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        WebElement tooltipOnButton = driver.findElement(By.id("toolTipButton"));

        actions.moveToElement(tooltipOnButton).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[text()='You hovered over the Button']")));
        WebElement tooltipTextOnButton =
                driver.findElement(By.xpath("//*[text()='You hovered over the Button']"));
        String tooltipText = tooltipTextOnButton.getText();
        System.out.println(tooltipText);
    }
}
