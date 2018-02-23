package hanoca;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitHW1 {


        private static WebDriver driver;
        @BeforeClass
        public static void FirstClass(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://www.walla.co.il");
            driver.get("http://www.ynet.co.il");
            driver.get("http://www.nrg.co.il");
        }
//        @Test
//        public void test01_runUrl(){
//            driver.get("http://www.google.com");
//
//        }
//    @Test
//    public void test02_runUrl() {
//        System.setProperty("webdriver.Firefox.driver", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//        driver = new FirefoxDriver();
//    }
//
//    @Test
//    public void test03_runUrl(){
//        driver.get("http://www.ynet.co.il");
//
//    }
//
//
//      //  @AfterClass
//       // public static void EndClass(){
//       //     driver.quit();
//        //}
//

    }

