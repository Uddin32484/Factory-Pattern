package makeMyTripPages;

import baseTest.BaseTest;
import makeMyTrip.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static makeMyTrip.TestUtil.depatruteDateCount;
import static makeMyTrip.TestUtil.returnDateCount;

public class HomePage extends BaseTest {

    public HomePage() {
        super();
        PageFactory.initElements(driver, this);
    }

    //@find
    @FindBy(xpath = "//a[@class='headerIcons makeFlex hrtlCenter column active']")
    WebElement flightMenu;

    @FindBy(xpath = "//li[@data-cy='oneWayTrip']")
    WebElement roundTripRadioSelection;
    @FindBy(xpath = "//input[@data-cy='fromCity']")
    WebElement ClickfromCity;
    @FindBy(xpath = "//input[@placeholder='From']")
    WebElement searchFromCity;

    @FindBy(xpath = "//input[@id='toCity']")
    WebElement ClickToCity;
    @FindBy(xpath = "//input[@placeholder='To']")
    WebElement searchToCity;
    @FindBy(xpath = "//span[@class ='lbl_input appendBottom10']']")
    WebElement ClickOnDepatureDate;
    @FindBy(xpath = "//div[@data-cy ='returnArea']")
    WebElement ClickonReturnDate;
    String depatureDate = "//div[@aria-label='%replace%' and @aria-disabled='false'";
    String returnDate = "//div[@aria-label='%replace%' and @aria-disabled='false'";


    @FindBy(xpath = "//a[@class ='primaryBtn font24 latoBold widgetSearchBtn ']")
    WebElement searchButton;

    //Method//
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
       searchFromCity.sendKeys(config.getProperty("From"));
       searchFromCity.sendKeys(Keys.TAB);
    }
    public void clickToCity(){
        ClickToCity.click();
    }
    public void searToCity(){
        searchToCity.sendKeys(config.getProperty("To"));
        searchToCity.sendKeys(Keys.TAB);
    }

    //Create Date

    public  void enterDepatureDate(){
        ClickOnDepatureDate.click();
        TestUtil date = TestUtil.getCurrendate();
        driver.findElement(TestUtil.customXpath(depatruteDateCount, TestUtil.depatruteDateCount)).click();
    }

    public  void enterReturnDate(){
        searchToCity.click();
        TestUtil date = TestUtil.getCurrendate();
        driver.findElement(TestUtil.customXpath(returnDateCount, returnDateCount)).click();
    }

    public void searchButton(){
         searchButton.click();
    }
}
