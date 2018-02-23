package hanoca;


        import org.junit.*;
        import org.junit.runners.MethodSorters;
        import org.openqa.selenium.Alert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.ie.InternetExplorerDriver;

        import java.sql.Driver;
        import java.util.ArrayList;

        import static junit.framework.TestCase.assertEquals;
        import static org.openqa.selenium.By.cssSelector;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClassTest {
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


    @Before
    public void test01_runUrl() {
        driver.get("http://www.google.com");

    }

    @Test
    public void test01_MyAlert() throws InterruptedException {
       // driver.get("http://www.google.com");
        //driver.get("https://translate.google.co.il");
        //driver.get("https://dgotlieb.github.io/Navigation/Navigation.html");
        //Thread.sleep(5000);
        driver.navigate().to("https://dgotlieb.github.io/Navigation/Navigation.html");
        driver.findElement(By.id("MyAlert")).click();
        Alert alertM = driver.switchTo().alert();
        System.out.println(alertM.getText());
        Thread.sleep(5000);
        alertM.accept();


       // WebElement textArea= driver.findElement(By.id("source"));
      // textArea.sendKeys("Hello");
       // driver.findElement(By.id("gt-submit")).submit();
       // System.out.println(driver.findElement(By.id("hplogo")));




    }
    @Test
    public void test02_MyPrompt() throws InterruptedException {

        driver.findElement(By.id("MyPrompt")).click();
        Alert alertP = driver.switchTo().alert();
        alertP.sendKeys("Hedva");
        Thread.sleep(5000);
        alertP.accept();
        String name = "Hedva";
        assertEquals(name,driver.findElement(By.id("output")).getText());

        // WebElement textArea= driver.findElement(By.id("source"));
        // textArea.sendKeys("Hello");
        // driver.findElement(By.id("gt-submit")).submit();
        // System.out.println(driver.findElement(By.id("hplogo")));


    }

       @Test
    public void test03_MyConfirm() throws InterruptedException {

        driver.findElement(By.id("MyConfirm")).click();
        Alert alertC = driver.switchTo().alert();
        Thread.sleep(5000);
        alertC.accept();
        String accept = "Confirmed";
        assertEquals(accept,driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("MyConfirm")).click();
        Thread.sleep(5000);
        alertC.dismiss();
        String dismiss = "canceled";
        assertEquals(dismiss,driver.findElement(By.id("output")).getText());


        // WebElement textArea= driver.findElement(By.id("source"));
        // textArea.sendKeys("Hello");
        // driver.findElement(By.id("gt-submit")).submit();
        // System.out.println(driver.findElement(By.id("hplogo")));




    }

    @Test
    public void test04_MyFrame() throws InterruptedException {
        WebElement frameElement=driver.findElement(By.id("my-frame"));
        driver.switchTo().frame(frameElement);
        System.out.println("The text is: " + driver.findElement(By.id("iframe_container")).getText());


    }
//    @Test
//    public void test05_Tab()  {
////        String tab1= driver.getWindowHandle();
////
//        driver.findElement(By.id("openNewTab")).click();
////        ArrayList<String> TabS= new ArrayList<String>(driver.getWindowHandles());
////        TabS.remove(tab1);
////        driver.switchTo().window(TabS.get(0));
////        System.out.println("The TabText" + "is: " + driver.findElement(By.id("new_tab_containerr")).getText());
////        String TabText="This is a new Tab";
////        assertEquals(TabText,driver.findElement(By.id("new_tab_containerr")).getText());
////        driver.close();
////        driver.switchTo().window(tab1);
////        assertEquals("Navigation",driver.findElement(By.id("title")).getText());
////
//    }

    @Test
    public void test06_Windows() throws InterruptedException {
        String win= driver.getWindowHandle();
        driver.findElement(cssSelector("a[href='newWindow.html']")).click();
/*
WebElement frameElement=driver.findElement(By.id("my-frame"));
driver.switchTo().frame(frameElement);
System.out.println("The text is: " + driver.findElement(By.id("iframe_container")).getText());
*/


    }



}
