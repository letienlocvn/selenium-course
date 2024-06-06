package section_three;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionApplication {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.cssSelector("textarea.gLFyf"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("dev java").build().perform();

    }
}
