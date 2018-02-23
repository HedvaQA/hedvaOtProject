package tirgul;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class controllers {
    private static WebDriver driver;
    String NameButton;

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
    @Test
    public void test01_MyAlert() throws InterruptedException {
        // driver.get("http://www.google.com");
        //driver.get("https://translate.google.co.il");
        //driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        //Thread.sleep(5000);
        driver.navigate().to("https://translate.google.co.il/?hl=iw");
        //driver.findElement(By.id("gt-sl")).equals("עברית");
       // Select lang = new (driver.findElement(By.id(gt-sl)));
       // lang.selectByValue("עברית");


        //Alert alertM = driver.switchTo().alert();
        //System.out.println(alertM.getText());
        //Thread.sleep(5000);
        //alertM.accept();

    }



}
