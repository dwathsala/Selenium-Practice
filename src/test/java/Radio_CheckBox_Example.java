import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Radio_CheckBox_Example {

    WebDriver driver;

    @BeforeMethod
    public void dropDownTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public  void radioTest(){
        //1. Find the default select radio button
        driver.get("https://www.leafground.com/radio.xhtml");

        boolean chromeRadioOption = driver.findElement(By.id("j_idt87:console1:0")).isSelected();
        boolean firefoxRadioOption = driver.findElement(By.id("j_idt87:console1:1")).isSelected();
        boolean safariRadioOption = driver.findElement(By.id("j_idt87:console1:2")).isSelected();
        boolean edgeRadioOption = driver.findElement(By.id("j_idt87:console1:3")).isSelected();

        if(chromeRadioOption){
            String chromeText = driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).getText();
            System.out.println("default select radio button: " + chromeText);
        } else if (firefoxRadioOption) {
            String firefoxText = driver.findElement(By.xpath("//label[@for='j_idt87:console1:1']")).getText();
            System.out.println("default select radio button: " + firefoxText );
        } else if (safariRadioOption) {
            String safariText = driver.findElement(By.xpath("//label[@for='j_idt87:console1:2']")).getText();
            System.out.println("default select radio button: " +  safariText);
        } else if (edgeRadioOption) {
            String edgeText = driver.findElement(By.xpath("//label[@for='j_idt87:console1:3']")).getText();
            System.out.println("default select radio button: " +  edgeText);
        }


        //Most Proper way is use for loop***********
        /*
        List<WebElement> radioElements =driver.findElements(By.xpath("//table[@id='j_idt87:console2']//td//input"));
        int radioCount = radioElements.size();
        System.out.println("Radio size : "+ radioCount);

        int index = -1;

        for (WebElement radioElement: radioElements) {
            index++;
            if (radioElement.isSelected()){
                WebElement defaultSelectedRadioButton = driver.findElement(By.xpath("//label[@for='j_idt87:console2:" + index + "']"));
                String defaultSelectedRadioButtonText = defaultSelectedRadioButton.getText();
                System.out.println("Default Selected Radio Button Text : " + defaultSelectedRadioButtonText);
                break;
             }
         */



        //2. Select the age group(If not selected)

    }


    @Test
    public void CheckboxTest(){


    }


}
