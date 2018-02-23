package tirgul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainClassInternet {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\or\\Desktop\\hedva\\2\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //System.out.println("The Current URL is :"+driver.getCurrentUrl());
        //System.out.println("The Title is :"+driver.getTitle());
        //System.out.println("The SourcePage is:"+driver.getPageSource());
       //driver.close();
        //driver.quit();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("-incognito");
        options.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        System.out.println(driver.getWindowHandle());

    }
}
