package hanoca;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewJunit {

    private static WebDriver driver;

    @BeforeClass
    public static void FirstClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
        driver = new ChromeDriver();
        // System.setProperty("webdriver.Firefox.driver","C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs");
        //driver = new FirefoxDriver();
//        System.setProperty("webdriver.ie.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
       driver.manage().window().maximize();

    }


    @Test
    public void test01_runUrl() {
        driver.get("http://www.walla.co.il");

    }

    @Test
    public void test02_runUrl() {
        driver.get("http://www.ynet.co.il");

    }

    @Test
    public void test03_runUrl() {
        driver.get("http://www.nrg.co.il");

    }
}


//    @AfterClass
//    public static void EndClass(){
//        driver.quit();
//    }


//}
