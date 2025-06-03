package makeMyTrip;

import baseTest.BaseTest;
import org.openqa.selenium.By;

import java.util.Calendar;

public class TestUtil extends BaseTest {

    public static  String depatruteDateCount;
    public static  String returnDateCount;


    public static TestUtil getCurrendate(){
        TestUtil date = new TestUtil();
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.DATE,1);
        String [] time = cale.getTime().toString().split(" ");
        TestUtil.depatruteDateCount = time[0]+ " "+time[1]+ " "+time[2]+ " "+time[5];
        cale.add(Calendar.DATE,2);
        time = cale.getTime().toString().split(" ");
        TestUtil.returnDateCount = time[0]+ " "+time[1]+ " "+time[2]+ " "+time[5];
         return date;
    }


    //create custom Xpath////
    public static By customXpath(String xpath, String param){
        String rawpath = xpath.replaceAll("%replace%", param);
        return  By.xpath(rawpath);
    }


    String pattern = "^[A-Z][a-z]{2} [A-Z][a-z]{2} \\d{2} \\d{4}$"; // e.g., "Wed Jun 04 2025"




}
