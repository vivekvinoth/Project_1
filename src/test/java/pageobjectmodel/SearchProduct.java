package pageobjectmodel;

import com.base.Base_Class;
import interfaceelements.SearchProductInterfaceElements;
import pageobjectmanager.PageObjectManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SearchProduct extends Base_Class implements SearchProductInterfaceElements {

    @FindBy(xpath = laptop_xpath)
    private static WebElement laptop;

    @FindBy(linkText = variation_linkText)
    private static WebElement variation;

    @FindBy(xpath = add_to_cart_xpath)
    private static WebElement addToCart;

    public SearchProduct() {
        PageFactory.initElements(driver, this);
    }

    public static void searchProduct() throws InterruptedException {
        clickOnElement(laptop);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        clickOnElement(variation);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        clickOnElement(addToCart);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        handleAlert("accept");
        System.out.println("hai git");


    }
}
