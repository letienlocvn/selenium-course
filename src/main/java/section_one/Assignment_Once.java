package section_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;


public class Assignment_Once {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement checkboxOption1 = driver.findElement(By.id("checkBoxOption1"));
        checkboxOption1.click();
        Assert.assertTrue(checkboxOption1.isSelected());
        Thread.sleep(3000);
        checkboxOption1.click();
        Assert.assertFalse(checkboxOption1.isSelected());

        List<WebElement> elementCheckBox = driver.findElements(By.cssSelector("input[type*='checkbox']"));
        System.out.println("Count: "+elementCheckBox.size());
    }
}
