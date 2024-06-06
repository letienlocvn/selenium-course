package section_three;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlesApplication {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        driver.findElement(By.className("blinkingText")).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> windowIterator = windows.iterator();
        String mainWindow = windowIterator.next();
        String childWindow = windowIterator.next();

        driver.switchTo().window(childWindow);

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        driver.findElement(By.cssSelector(".im-para.red")).getText();

        String emailId = driver.findElement(By.cssSelector(".im-para.red"))
                .getText()
                .split("at")[1].trim().split(" ")[0];

        driver.switchTo().window(mainWindow);

        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}
