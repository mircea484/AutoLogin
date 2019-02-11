import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/mircamolistanu/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //String url = "https://accounts.google.com/signin";
        String url = "file:///Users/mircamolistanu/Downloads/Programing/AutoLogin/src/page/page.html";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement email_phone = driver.findElement(By.xpath("//input[@placeholder='username']"));
        //WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
        email_phone.sendKeys("gosudari2@gmail.com");
        //driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.xpath("//input[@name='pass']")).click();
        WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("Password");
        driver.findElement(By.id("passwordNext")).click();
    }
}
