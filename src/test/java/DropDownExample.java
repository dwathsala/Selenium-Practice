import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownExample {

    WebDriver driver;

    @BeforeMethod
    public void dropDownTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();   //to display the page in full screen/window..
    }

    @Test
    public void leafGroundPageDropDown() throws InterruptedException {

        driver.get("https://www.leafground.com/select.xhtml");

        //1.1. Ways of select values in basic dropdown
        WebElement dropDown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(dropDown);  //need to pass web element as parameter
        select.selectByIndex(1);  //Select by visible text denwanam value kiyla ttribute ekk thiyenn oni aniwaren
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");
        Thread.sleep(3000);

        //1.2. Get the number of dropdown options
        // List<WebElement> =====> Generics
        List<WebElement> listofOptions = select.getOptions();
        int size = listofOptions.size();
        System.out.println("Number of options in dropdown: "+size);

        for (WebElement element:listofOptions){
             System.out.println(element.getText());
        }
        //1.3. Using sendkeys selct dropdown value
        dropDown.sendKeys("Puppeteer");
        Thread.sleep(3000);

        //1.4. Selecting value in a Boostrap dropdown
        WebElement dropDown2 = driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
        dropDown2.click();
        List<WebElement> listofDropDownValues = driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
        listofDropDownValues.size();
        System.out.println(size);

        for (WebElement element : listofDropDownValues){
            String dropDownValue = element.getText();
            if (dropDownValue.equals("USA")){
                element.click();
                break;
            }
        }
    }

    //2. Google Search - pick a value from suggestions
    @Test
    public  void googleSearchDropdown() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Palitha");
        Thread.sleep(2000);
        List<WebElement> googleSearchList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']"));
        System.out.println(googleSearchList.size());

        for (WebElement element : googleSearchList){
            System.out.println(element.getText());
        }
    }

    //3. Handle Hidden Auto Suggestions Drop Down And Search using DOM Debugger Trick

}
