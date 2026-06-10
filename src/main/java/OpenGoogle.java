//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    //Open Google
    //Go to Google home page
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","D:\\SeliniumQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); //STAGE 1

        //WebDriverManager.chromedriver().setup();    //STAGE 02

        //In Stage 03 only need these 02 command
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");     //to redirect to URL
        driver.quit();
    }
}
