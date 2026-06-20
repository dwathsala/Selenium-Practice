import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtertExample {

    WebDriver driver;

    @BeforeMethod
    public void openAlertTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();   //to display the page in full screen/window..
        driver.get("https://www.leafground.com/alert.xhtml");
    }

    @Test
    public void alertTest() throws InterruptedException {
        //1. Alert (Simple Dialog)
        WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
        alertBox.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

        //2. Alert (Confirm Dialog)
        WebElement confirmedBox = driver.findElement(By.id("j_idt88:j_idt93"));
        confirmedBox.click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert1.dismiss();


        //3. Alert (Prompt Dialog) //user can type in alert
        WebElement promtBox = driver.findElement(By.id("j_idt88:j_idt104"));
        promtBox.click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000);
        String alertText = alert2.getText();
        System.out.println("Alert text is: " + alertText);
        alert2.sendKeys("My name is Dulari");
        alert2.accept();


    }
}
