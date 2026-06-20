import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {
    WebDriver driver;          //make driver as public reference for all method include openLinkTestPage and LinkTest.

    //if there is to do something before the test we can add it before @Test withing separate method..For that we can use @BeforeMethod annotation..

    @BeforeMethod  //Preconditions of manual testing
    public void openTextBoxPage(){

        //to change the browser version
        /*ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("148");
        driver = new ChromeDriver(chromeOptions); */  //if change the browser version must need to pass "chromeOptions" as parameter

        driver = new ChromeDriver();  //use when don't change the browser version
        driver.manage().window().maximize();   //to display the page in full screen/window..
        driver.get("https://www.leafground.com/input.xhtml");
        //Thread.sleep(Long.parseLong("3"));   //use to identify how much time to take for load the page
    }

    @Test
    public void textBoxTest(){

        //1.Type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Dulari Dayananda");

        //2. Append Country to this city
        WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("India");

        //3. Verify if text box is disable
        boolean enabled =  driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is Text Box Enabled? :" + enabled);

        //4. Clear the type text
        //xpath = //*[@id="j_idt88:j_idt95"]
        WebElement clearText = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearText.clear();

        //5. Retrieve the typed text
        WebElement textElement = driver.findElement(By.id("j_idt88:j_idt97"));
        String value = textElement.getAttribute("value");
        System.out.println(value);

        //6. Type email and tab. Confirm control moved to next element
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("dulariwathsala824@gmail.com" + Keys.TAB + "Confirmed control moved to next element");

    }

}
