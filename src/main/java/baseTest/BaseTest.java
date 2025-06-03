package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Properties;

public class BaseTest {


    public static Properties config;
    public static WebDriver driver;

    public  void driverInitialization(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
//    String expectedDate = "Wed Jun 04 2025";
//    String xpath = String.format("//div[@class='DayPicker-Day' and @aria-label='%s']", expectedDate);
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
//    String pattern = "^[A-Z][a-z]{2} [A-Z][a-z]{2} \\d{2} \\d{4}$"; // e.g., "Wed Jun 04 2025"

   // List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
//for(
//    WebElement dateElement :allDates)
//
//    {
//        String label = dateElement.getAttribute("aria-label");
//        if (label != null && label.matches(pattern)) {
//            System.out.println("Valid date found: " + label);
//            dateElement.click();
//            break;
//        }

//    }




//    public void redPropertyFile() throws FileNotFoundException {
//        try {
//            config = new Properties();
//            String path = System.getProperty("E:/Personal/PageObjectProject/src/resources/property/config.properties");
//            FileInputStream fis = new FileInputStream(path);
//            //FileInputStream fis = new FileInputStream(System.getProperty("E:\\Personal\\PageObjectProject\\src\\resources\\property\\config.properties"));
//            config.load(fis);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
  //  }







}
