package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.TripSearchPage;
import pages.TripPage;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class TripSearchAutomation {
    static WebDriver driver = null;

    TripSearchPage objTripSearch;

    static TripPage objPage;

    @Test
    public void TripSearch() throws InterruptedException {
        FirefoxDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tripadvisor.com/");
        TripPage.button(driver).click();
        Thread.sleep(5000);
        TripPage.element1(driver).click();
        TripPage.element1(driver).sendKeys("Switzerland");
        Thread.sleep(5000);
        TripPage.searchResult(driver).click();
        TripPage.selectCheckInDate(driver).click();
        TripPage.selectCheckOutDate(driver).click();
        TripPage.childSelect(driver).click();
        TripPage.childAgeSelect(driver).click();
        TripPage.childAgeYear(driver).click();
        TripPage.childConfirmSelect(driver).click();
        Thread.sleep(5000);

      /*  WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[5]/div/div/div[2]/div[6]/div[2]/div[4]/div/label"));
        js.executeScript("arguments[0].scrollIntoView();", element);

       */
       // TripPage.checkBox(driver).click();

        System.out.println(TripPage.getTitle(driver).getText());

    }


   /* @Test
    public static void tripSearch() {
        TripPage.button(driver).click();

    }

    */

}