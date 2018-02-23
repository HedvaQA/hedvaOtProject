package Apps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Testing {


    private static AndroidDriver<MobileElement> driver;


@BeforeClass
    public static void setUp() throws IOException {

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "Android Device");
    capabilities.setCapability("appPackage", "com.android.chrome");
    capabilities.setCapability("appActivity", "com.google.an-droid.apps.chrome.Main");
    capabilities.setCapability("newCommandTimeout", 120);
    capabilities.setCapability("unicodekeyboard", true);
    capabilities.setCapability("resetkeyboard", true);
    driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

@Test

public void test1_skipIntro() throws InterruptedException, IOException {

    WebElement introSkipButton = driver.findElement(By.id("il.co.mintapp.buyme:id/skipButton"));introSkipButton.click();

}

@AfterClass

    public static void tearDown() throws IOException, InterruptedException {

    driver.quit();

}

}