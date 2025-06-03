package makeMytripTest;

import baseTest.BaseTest;
import makeMyTripPages.FlightSearchPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FlightSearchTestPage extends BaseTest {
    @Test
    public void searchFlight() throws InterruptedException {
        FlightSearchPage flightSearchPage = new FlightSearchPage();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //flightSearchPage.clickOnPoupDisplay();
//        flightSearchPage.ClickOnFlightMenu();
//        flightSearchPage.roundTripSelection();
//        flightSearchPage.enterDepatureCity();
//        flightSearchPage.searchFromCity();
//        flightSearchPage.clickToCity();
//        flightSearchPage.enterToCity();
//        flightSearchPage.enterDepatureDate();
//        flightSearchPage.enterDepatureDate();

//        driver.findElement(By.xpath("//div[@data-cy='returnArea']")).click();
//        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//div[@class='DayPicker-Day' and @aria-label='Thu Jul 10 2025']")
//        ));
//        date.click();;
      // flightSearchPage.enterDepatureDate();
      // flightSearchPage.enterReturnDate();
       flightSearchPage.searchButton();

    }
}
