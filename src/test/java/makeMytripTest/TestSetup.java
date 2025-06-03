package makeMytripTest;

import baseTest.BaseTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileNotFoundException;

public class TestSetup  extends BaseTest {

    @BeforeSuite
    public void setUp() throws FileNotFoundException {
        //redPropertyFile();
        driverInitialization();
    }



    @AfterSuite
    public  void tearDown(){

       // driver.quit();
    }
}
