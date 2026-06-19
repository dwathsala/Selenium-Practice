import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkExample {

    WebDriver driver;          //make driver as public reference for all method include openLinkTestPage and LinkTest.

    //if there is to do something before the test we can add it before @Test withing separate method...
    //For that we can use @BeforeMethod annotation..
    @BeforeMethod
    public void openLinkTestPage(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();   //to display the page in full screen/window..
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public void LinkTest() {
        //1.Tke me to dashboard
        WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();     //Use to back to previous page. We can use back(), refresh(), and forward() with navigate() method..


        //2.Find my destination
        WebElement whereToGo =driver.findElement(By.partialLinkText("Find the URL"));
        String path = whereToGo.getAttribute("href");
        System.out.println("This link is going to : " + path );

        //3.Am I broken link?
        //4.Duplication link
        //5.Count page links
        //6.Count layout links


    }
}
