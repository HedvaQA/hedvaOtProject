package tirgul;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class tirgulWait {


    private static WebDriver driver;
    //String NameButton;

    @BeforeClass
    public static void FirstClass()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
        driver = new ChromeDriver();
        // System.setProperty("webdriver.Firefox.driver","C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs");
        //driver = new FirefoxDriver();
//        System.setProperty("webdriver.ie.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();

    }


//    @Before
//    public void test01_runUrl() {
//        driver.get("http://www.google.com");
//
//    }

    @Test
    public void test01_MyText() throws InterruptedException {
        // driver.get("http://www.google.com");
        //driver.get("https://translate.google.co.il");
        //driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        //Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://translate.google.co.il/?hl=iw");
//        WebDriverWait wait= new WebDriverWait(driver,100);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gt-submit")));

        driver.findElement(By.id("source")).sendKeys("Hello");
        //Thread.sleep(10000);
        driver.findElement(By.id("gt-submit")).click();

    }
    }
