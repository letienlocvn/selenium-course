package section_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SuggestiveDropDownApplication {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(1000);
        List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));
        for (WebElement option :
                options) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }

        // Handling checkbox
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());


    }
}
