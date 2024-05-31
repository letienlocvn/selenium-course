package section_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumApplication {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/product/selenium-ruby/");
        System.out.println(driver.getCurrentUrl());

        WebElement element = driver.findElement(By.cssSelector("input.qty"));
        element.clear();
        element.sendKeys("2");

        WebElement elementByClassName = driver.findElement(By.className("single_add_to_cart_button"));
        elementByClassName.click();


//        WebElement viewBasket = driver.findElement(By.cssSelector(".wc-forward"));
//        viewBasket.click();

        WebElement reviewAnchor = driver.findElement(By.xpath("//a[@href='#tab-reviews']"));
        reviewAnchor.click();

        // Building custom xpath or css selector
        WebElement descriptionAnchor = driver.findElement(By.xpath("//a[@href='#tab-description']"));
        descriptionAnchor.click();



    }
}
