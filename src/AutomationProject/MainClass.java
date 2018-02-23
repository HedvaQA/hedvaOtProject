package AutomationProject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainClass {

    private static WebDriver driver;
    private static String url;
    String GW;
    public TestName name = new TestName();
    private static ExtentTest test = null;
    private static ExtentReports extent;
    @BeforeClass
    public static void FirstClass() throws InterruptedException, IOException {

        /*report*/
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\or\\Desktop\\hedva\\hedvareport.html");
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        htmlReporter.setAppendExisting(true);
        htmlReporter.config().setTheme(Theme.STANDARD);
        test = extent.createTest("BuyMe Test", "Start test ");
        test.log(Status.INFO, "@Before class");
        boolean driverEstablish = false;
        /*cheack the browser*/
        String br = "";
        Browser browser = new Browser();
        br = browser.returnbrowser();
        // System.out.println(br);
        /*The browser is chrome*/
        try {
            if (br.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
                driver = new ChromeDriver();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-extensions");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driverEstablish = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            fail("Cant connect chromeDriver");
            test.log(Status.FATAL, "Driver Connection Failed! " + e.getMessage());
            driverEstablish = false;
        } finally {
            if (driverEstablish) {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                test.log(Status.PASS, "Driver established successfully");

            }

        }
    }

    @Test
    /*Insert to site 'BuyMe'*/
    public void test01_url() throws InterruptedException, IOException {

        boolean pageOpened = false;
        try {
            URL URLc = new URL();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().to(URLc.returnURL("URL"));
            pageOpened = true;

        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Site BuyMe was not found " + e.getMessage());
            pageOpened = false;
        } finally {
            if (pageOpened ) {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                test.log(Status.PASS, "Webpage opened successfully");

           }

        }
    }
//    @Test
//    public void test02_sizeDot() throws InterruptedException {
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        int size;
//        Thread.sleep(5000);
//        size = driver.findElement(By.xpath("//div[@class='bounce2']")).getSize().getWidth();
//        System.out.println(String.valueOf(size));
//        Thread.sleep(5000);
//        size = driver.findElement(By.xpath("//div[@class='bounce2']")).getSize().getHeight();
//        System.out.println(String.valueOf(size));
//    }

    @Test
    /*SignUp to the site BuyMe*/
    public void test03_signUp() throws InterruptedException, IOException {
        boolean signup = false;
        try{
        GW=driver.getWindowHandle();
        driver.findElement(By.className("seperator-link")).click();
        ArrayList<String> newTab= new ArrayList <String>(driver.getWindowHandles());
        //newTab.remove(GW);
        driver.switchTo().window(newTab.get(0));
        //driver.findElement(By.className("header-link bold")).click();
        driver.findElement(By.xpath("//span[@class='header-link bold']")).click();
        SignUp signUp= new SignUp();
        signUp.signUp(driver);
        driver.switchTo().window(GW);
        signup=true;

        } catch (Exception e) {
           e.printStackTrace();
           test.log(Status.FAIL, "SignUp was failed " + e.getMessage());
            signup = false;

       } finally {
           if (signup ) {
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               test.log(Status.PASS, "SignUp successfully");

           }

       }

    }

   @Test
   /*Select option to find a GiftCard */
   public void test04_SearchGift() throws InterruptedException, IOException {
       boolean searchGift = false;
       try{
       SearchGift SearchGift = new SearchGift();
       SearchGift.SearchGift(driver);
       searchGift=true;
       } catch (Exception e) {
           e.printStackTrace();
           test.log(Status.FAIL, "SearchGift was failed " + e.getMessage());
           searchGift = false;

       } finally {
           if (searchGift ) {
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               test.log(Status.PASS, "SearchGift successfully");

           }

       }


    }

    @Test
    /*Select Buisness from the result of the select */
    public void test05_ChoseBuisness() throws InterruptedException, IOException {
        boolean ChoseBuisness = false;
        try{
        chooseBuisness chooseBuisness = new chooseBuisness();
        chooseBuisness.chooseBuisness(driver);
            ChoseBuisness=true;
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "ChoseBuisness was failed " + e.getMessage());
            ChoseBuisness = false;

        } finally {
            if (ChoseBuisness ) {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                test.log(Status.PASS, "ChoseBuisness successfully");

            }

        }

    }


    @Test
    /*Sender & Receiver information screen  */
    public void test06_SRInformation() throws InterruptedException, IOException {
        boolean srInformation = false;
        try{
        SRInformation SRInformation = new SRInformation();
        SRInformation.SRInformation(driver);
            srInformation =true;
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Sender & Receiver Information was failed " + e.getMessage());
            srInformation = false;

        } finally {
            if (srInformation ) {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                test.log(Status.PASS, "Sender & Receiver Information successfully");

            }

        }

    }

@AfterClass

public static void Quit() throws InterruptedException {
    Thread.sleep(10000);
        driver.quit();
         extent.flush();

}

}




