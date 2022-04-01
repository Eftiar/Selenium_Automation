package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.tripadvisor.com/");

        WebElement button = driver.findElement(By.linkText("Hotels"));
        button.click();

        //driver.wait(30);

        Thread.sleep(3000);

        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.weiIG:nth-child(1) > form:nth-child(2) > input:nth-child(1)")));
        element1.click();
        element1.sendKeys("Switzerland");

        Thread.sleep(3000);

        WebElement searchResult = driver.findElement(By.xpath("//div[@class='dPHgr']//div[@class='WlYyy diXIH bQCoY'][contains(text(),'Europe')]"));
        //searchResult.sendKeys(Keys.ENTER);
        searchResult.click();

        WebElement selectCheckInDate = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div > div > div.kAgrN > div > div.fZVmW.q.c > div:nth-child(2) > div.nZEkx.notranslate > div:nth-child(1) > div:nth-child(3)"));
        selectCheckInDate.click();

        WebElement selectCheckOutDate = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div > div > div.eLjPa > div > div.fZVmW.q.c > div:nth-child(1) > div.nZEkx.notranslate > div:nth-child(2) > div:nth-child(5)"));
        selectCheckOutDate.click();


        WebElement childSelect = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div.ccWaH.S4.z > div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span"));
        childSelect.click();


        WebElement childAgeSelect = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.cJbNW.Mf.Z._V > div > div > button"));
        childAgeSelect.click();

        Thread.sleep(3000);

        WebElement childAgeYear = driver.findElement(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[7]/div/div/div/div[2]/button[3]/span"));
        childAgeYear.click();


        WebElement childConfirmSelect = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.chkmV.Mf > button"));
        childConfirmSelect.click();

        Thread.sleep(5000);

        WebElement checkBox = driver.findElement(By.cssSelector("#component_13 > div > div.dSlNe.bhcPI > div:nth-child(6) > div.czbRE > div:nth-child(4) > div > label > div > span.eLkFw > span"));
        checkBox.click();

        WebElement getTitle = driver.findElement(By.cssSelector("#property_264882"));
        getTitle.getText();
        System.out.println(getTitle.getText());

    }
}
