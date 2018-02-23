package tirgul;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)



public class HWwait {

    private static WebDriver driver;


    @BeforeClass
    public static void FirstClass()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
        driver = new ChromeDriver();
         driver.manage().window().maximize();

    }
    @Test
    public void test01_MyText() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://dgotlieb.github.io/WebCalculator/");
//        WebDriverWait wait= new WebDriverWait(driver,100);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gt-submit")));

        System.out.println(driver.findElement(By.id("seven")).getSize());
        assertEquals(true,driver.findElement(By.id("six")).isEnabled());
        System.out.println(driver.findElement(By.id("six")).isDisplayed());

    }
    @Test
    public void test02_Calc() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        WebDriverWait wait= new WebDriverWait(driver,100);
//       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gt-submit")));
        Thread.sleep(1000);
        driver.findElement(By.id("five")).click();
        driver.findElement(By.id("multiply")).click();
        driver.findElement(By.id("three")).click();
        driver.findElement(By.id("equal")).click();
        System.out.println(driver.findElement(By.id("seven")).getSize());
       String intcalc="15";
      String equal =driver.findElement(By.id("screen")).getText();
       assertEquals(intcalc,equal);


        //Thread.sleep(10000);
        //num =(integer) (driver.findElement(By.id("screen")).getText());

        // driver.findElement(By.id("gt-submit")).click();


    }

    @Test
    public void test03_SIZE() throws InterruptedException {


        System.out.println(driver.findElement(By.id("two")).getSize().height);
        System.out.println(driver.findElement(By.id("six")).getSize().width);
        int nineH=driver.findElement(By.id("nine")).getSize().height;
        int nineW=driver.findElement(By.id("nine")).getSize().width;
        assertEquals(nineH,driver.findElement(By.id("nine")).getSize().height);
        assertEquals(nineW,driver.findElement(By.id("nine")).getSize().width);
       // System.out.println(driver.findElement(By.id("six")).isDisplayed());

    }

    }