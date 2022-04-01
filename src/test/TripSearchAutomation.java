package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TripSearchPage;

import java.util.concurrent.TimeUnit;

public class TripSearchAutomation {
    WebDriver driver;

    TripSearchPage objTripSearch;

    @BeforeTest
    public void setup(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tripadvisor.com/");
    }

    @Test(priority = 1)
    public void navigate_to_homepage_click_on_hotels(){
        objTripSearch = new TripSearchPage(driver);
        objTripSearch.clickHotels();
    }

    @Test(priority = 2)
    public void search_switzerland_and_navigate_to_hotel_search(){
        objTripSearch = new TripSearchPage(driver);
        objTripSearch.searchText();
        objTripSearch.searchResultClick();
    }

    @Test(priority = 3)
    public void enter_details_and_search_for_hotels(){
        objTripSearch = new TripSearchPage(driver);
        objTripSearch.selectCheckIn();
        objTripSearch.selectCheckOut();
        objTripSearch.childSelection();
        objTripSearch.childAgeSelection();
        objTripSearch.childAgeYearSelection();
        objTripSearch.childConfirmSelection();
        objTripSearch.checkBoxSelection();
    }

    @Test(priority = 4)
    public void print_searched_hotel_name(){
        objTripSearch = new TripSearchPage(driver);
        objTripSearch.getTitleFromSearch();
    }

}
