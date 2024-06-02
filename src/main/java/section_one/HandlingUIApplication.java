package section_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingUIApplication {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement dropdownElement = driver.findElement(By.id("divpaxinfo"));

        dropdownElement.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        // Click done button
        WebElement doneButton = driver.findElement(By.cssSelector("input.buttonN"));
        doneButton.click();

        System.out.println(dropdownElement.getText());
    }
}
