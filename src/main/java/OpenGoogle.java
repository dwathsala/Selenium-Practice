import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    //Open Google
    //Go to Google home page
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\SeliniumQA\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
