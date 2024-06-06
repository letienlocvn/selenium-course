package section_three;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AssignmentWindowHandles {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> window = windows.iterator();
        String main = window.next();
        String child = window.next();

        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
        driver.switchTo().window(main);
    }
}
