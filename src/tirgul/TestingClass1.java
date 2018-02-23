package tirgul;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestingClass1 {

    //    String NameButton;
    private static WebDriver driver;
    static NgWebDriver ngWebDriver;

    @BeforeClass
    public static void FirstClass() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //to used angular function
        ngWebDriver = new NgWebDriver((JavascriptExecutor)driver);
        ngWebDriver.waitForAngularRequestsToFinish();

    }


    @Test
    public void test01_Angular()  {
//
       driver.navigate().to("https://github.com/paul-hammant/ngWebDriver");
        new NgWebDriver((JavascriptExecutor) driver).waitForAngularRequestsToFinish();
      driver.findElement(ByAngular.exactRepeater("too"));
    }

}