package tirgul;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HWwait2 {


    private static WebDriver driver;


    @BeforeClass
    public static void FirstClass()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void test01_cheak1() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://dgotlieb.github.io/Selenium/synchronization.html");
        driver.findElement(By.id("checkbox")).isDisplayed();
        driver.findElement(By.id("btn")).click();
        driver.findElement(By.id("message")).isDisplayed();


    }
    @Test
    public void test02_cheak2() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElement(By.id("checkbox")).isDisplayed();
        driver.findElement(By.id("hidden")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("div[style='']")).isDisplayed();
        //driver.findElement(By.id("message")).isDisplayed();



        //Thread.sleep(10000);
        //num =(integer) (driver.findElement(By.id("screen")).getText());

        // driver.findElement(By.id("gt-submit")).click();


    }

    @Test
    public void test03_cheak3() throws InterruptedException {

        driver.findElement(By.id("rendered")).click();
        WebDriverWait wait= new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
       String output = driver.findElement(By.id("finish2")).getText();
        assertEquals(output,"This is a new element");



    }

    @Test
    public void test04_cheak4() throws InterruptedException {


        driver.navigate().to("https://dgotlieb.github.io/AngularJS/main.html");

        new NgWebDriver((JavascriptExecutor) driver).waitForAngularRequestsToFinish();
        WebElement firstname = (WebElement)driver.findElement(ByAngular.model("firstName"));
        firstname.clear();
        firstname.sendKeys("Hedva");
        assertEquals(driver.findElement(By.xpath("//input")).getAttribute("value"),"Hedva");

        }

//    @Test
//    public void test05_cheak5() throws InterruptedException {
//
//
//        driver.navigate().to("https://dgotlieb.github.io/AngularJS/main.html");
//
//       // new WebDriver((JavascriptExecutor) driver).waitForAngularRequestsToFinish();
//        WebElement firstname = (WebElement)driver.(By.className("ng-pristine ng-valid"));
//        driver.findElements(By.className("ng-pristine ng-valid")).clear();
//        driver.findElements(By.className("ng-pristine ng-valid")).;
//        driver.findElement(By.className("ng-pristine ng-valid"));
//        //driver.findElement(By.className("ng-pristine ng-valid").toString());
//        assertEquals(driver.findElement(By.className("ng-pristine ng-valid")).getText(),"Hedva");
//
//    }




}
