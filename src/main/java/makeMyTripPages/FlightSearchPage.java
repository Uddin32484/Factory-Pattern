package makeMyTripPages;

import baseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlightSearchPage extends BaseTest {



    public FlightSearchPage() {
        super();
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    //@find
    @FindBy(xpath = "//a[@class='headerIcons makeFlex hrtlCenter column active']")
    WebElement flightMenu;

    @FindBy(xpath = "//li[@data-cy='oneWayTrip']")
    WebElement roundTripRadioSelection;
    @FindBy(xpath = "//input[@data-cy='fromCity']")
    WebElement ClickfromCity;
    @FindBy(xpath = "//p[contains(text(), 'New York-LaGuardia Apt, United States')]")
    WebElement searchFromCity;
     //driver.findElement(By.xpath("//label[@for='toCity']")).click();
    @FindBy(xpath = "//label[@for='toCity']")
    WebElement ClickToCity;
    @FindBy(xpath = "//p[text()='Neptune, United States']")
    WebElement searchToCity;
    @FindBy(xpath = "//input[contains(@class, 'react-autosuggest__input')]")
    WebElement ClickOnDepatureDate;
    @FindBy(xpath = "//div[@data-cy='returnArea']")
    WebElement ClickonReturnDate;
    String depatureDate = "//div[@aria-label='%replace%' and @aria-disabled='false'";
    String returnDate = "//div[@aria-label='%replace%' and @aria-disabled='false'";


    @FindBy(xpath = "//a[@class ='primaryBtn font24 latoBold widgetSearchBtn ']")
    WebElement searchButton;
    @FindBy(xpath = "//span[@class='commonModal__close']")
    WebElement clickPopDisplayed;

    String expectedDate = "Wed Jun 04 2025";
    String returnedDate = "Thu Jul 10 2025";
    String xpath = String.format("//div[@class='DayPicker-Day' and @aria-label='%s']", expectedDate);
    String xpath1 =String.format("//div[@class='DayPicker-Day' and @aria-label='%s']", returnedDate);


    //Method//

    public void clickOnPoupDisplay(){
           if(clickPopDisplayed.isDisplayed()){
               clickPopDisplayed.click();
           }
    }
    public  void ClickOnFlightMenu(){
        flightMenu.click();
    }
    public void roundTripSelection(){
        roundTripRadioSelection.click();
    }
    public void enterDepatureCity(){
        ClickfromCity.click();

    }
    public void searchFromCity(){
        searchFromCity.click();
    }
    public void clickToCity(){
        ClickToCity.click();
    }
    public void enterToCity(){
        searchToCity.click();
    }

    //Create Date

    public  void enterDepatureDate(){
        ClickOnDepatureDate.click();
        driver.findElement(By.xpath(xpath)).click();
        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        date.click();

    }

    public  void enterReturnDate(){
        ClickonReturnDate.click();
        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath1)));
        date.click();



    }

    public void searchButton(){
        searchButton.click();
    }
}
