package tirgul;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FileIO {



        private static WebDriver driver;
        private static ExtentTest test;
    private static ExtentReports extent;

    @BeforeClass
    public static void prepareTest () {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        ExtentReports extent= new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\or\\Desktop\\hedva\\test.html");
        extent.attachReporter(htmlReporter);
        test=extent.createTest("MyFirstTest","Sample Description");
        extent.setSystemInfo("Environment","Production");
        extent.setSystemInfo("Tester","Hedva");
        test.log(Status.INFO,"@Before class");
        }

        @Test
         public void test01_openURL () {
            driver.get("https://dgotlieb.github.io/Actions/");
            //driver.navigate().to(getData.getDataURL("URL"));
            test.log(Status.INFO,"open URL");

    }

    @AfterClass
    public  static void afterClass(){
        driver.quit();
        extent.flush();

    }

  //  @Test
//    public void test02_dragAndDrop() {
//
////WebElement elementl= (WebElement) driver.findElements(By.id("drag1"));
////        List <WebElement> locationElement =  driver.findElements(By.id("drag1"));
////        List <WebElement> destinationElement =  driver.findElements(By.id("div1"));
////       System.out.println(locationElement);
////       System.out.println(destinationElement);
//        //JavascriptException
//
//           // Actions DragAndDrop = new Actions(driver);
//            // DragAndDrop.dragAndDrop((WebElement)locationElement,(WebElement)destinationElement)
//            //
//           // Actions actions = DragAndDrop.clickAndHold((WebElement) locationElement);
//           // actions = DragAndDrop.moveToElement((WebElement) destinationElement);
//
//        WebElement locationElement = driver.findElement(By.id("drag1"));
//        WebElement destinationElement = driver.findElement(By.id("div1"));
//
//        System.out.println(locationElement.getLocation());
//      System.out.println(destinationElement.getLocation());
//        // JSUtil.class.JavascriptDragAndDrop(driver,locationElement, destinationElement);
//        Actions DragAndDrop = new Actions(driver);
//         DragAndDrop.dragAndDrop(locationElement,destinationElement);
//
//        }

}






    //}


