package Apps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Apps {

    private static AndroidDriver<MobileElement> driver;

    @BeforeClass
    public static void setUp() throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
      //capabilities.setCapability("appPackage", "com.android.chrome");
       // capabilities.setCapability("appPackage", "co.il.webt.buyme.redeem");
        capabilities.setCapability("appPackage", "il.co.mintapp.buyme");
        capabilities.setCapability("appActivity",
                "il.co.mintapp.buyme.activities.common.SplashScreen");
       // capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      // capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
    }
 @Test
      public void test1_skipIntro() throws InterruptedException, IOException {
       //  driver.findElement(By.id("123"));
                  System.out.println("123");
   }


//    @AfterClass
//    public static void tearDown() throws IOException, InterruptedException {
//
//        driver.quit();
//    }
}
