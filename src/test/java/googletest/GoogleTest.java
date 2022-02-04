package googletest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class GoogleTest {
    WebDriver webDriver;

    @Before
    public void openUp() {
        File fileChromdriver = new File("chromdriver.exe");
        System.setProperty("webdriver.chrom.driver", fileChromdriver.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://google.com");
    }
    @Test
    public void googleTest() {
        webDriver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("maven selenium java");
        webDriver.findElement(By.cssSelector("input.gNO89b")).click();
        webDriver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
        System.out.println("Page was opened !");
    }
    @After
    public void TearDown() {
        webDriver.quit();
    }
}