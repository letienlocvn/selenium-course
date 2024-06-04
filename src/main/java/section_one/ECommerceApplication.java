package section_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ECommerceApplication {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();

        String[] productName = {"Cucumber", "Brocolli", "Beetroot"};


        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        System.out.println(products.size());
        for (int i = 0; i < products.size(); i++) {
            String[] names = products.get(i).getText().split("-");
            String officialName = names[0].trim();
            System.out.println("Name: " + officialName);
            if (officialName.equals(productName[0])) {
                WebElement addToCartBtn = driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i);
                addToCartBtn.click();
                break;
            }
        }

        Thread.sleep(3000);
        // driver.quit();
    }
}
