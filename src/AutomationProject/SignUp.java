package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class SignUp {
    public static void signUp(WebDriver driver) throws IOException {
        /* insert  username*/
        WebElement Data = (WebElement) driver.findElement(By.id("ember826"));
        Data.sendKeys("Hedva");
        /* insert  mail*/
        Data=(WebElement) driver.findElement(By.id("ember827"));
        Data.sendKeys("hedva.melamed2@gmail.com");
        /* insert  password*/
        Data=(WebElement) driver.findElement(By.id("valPass"));
        Data.sendKeys("orelne2018");
        /* insert  password again*/
        Data=(WebElement) driver.findElement(By.id("ember829"));
        Data.sendKeys("orelne2018");
        /* sign agree*/
        Data=driver.findElement(By.xpath("//*[@id='ember825']/div[5]/div/label"));
        Data.click();
        /* click signUp*/
        Data=driver.findElement(By.xpath("//*[@id='ember825']/button"));
        Data.click();
        /* already signUp*/
        Data=driver.findElement(By.className("login-error"));
        if (Data.isDisplayed()==true){
            driver.findElement(By.xpath("//span[@class='header-link']")).click();
            Data=(WebElement) driver.findElement(By.id("ember834"));
            Data.sendKeys("hedva.melamed2@gmail.com");
            Data=(WebElement) driver.findElement(By.id("ember835"));
            Data.sendKeys("orelne2018");
        }

        Data=driver.findElement(By.xpath("//*[@class='ember-view']/button"));
        Data.click();


    }
}
