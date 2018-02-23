package hanoca;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newJunitHW {

    private static WebDriver driver;
    @BeforeClass
    public static void FirstClass(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
        driver = new ChromeDriver();
    }



    @Test
    public void test01_runUrl(){
        driver.get("http://www.google.com");

    }

    @AfterClass
    public static void EndClass(){
        driver.quit();
    }


}
