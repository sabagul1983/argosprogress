import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[data-test=\"search-input\"]")
    WebElement searchBox;

    public void clickSearchBox() {
        searchBox.click();
    }

    @FindBy(css = "input[data-test=\"search-input\"]")
    WebElement typeSearchBox;

    public void productSearchBox(String product) {
        typeSearchBox.sendKeys(product);
        System.out.println("my product is:" + product);
    }

    @FindBy(css = "button[data-test=\"search-button\"]")
    WebElement searchButton;

    public void clickSearchButton() {
        searchButton.click();
    }

    @FindBy(css = "label[name=\"price\"]")
    List<WebElement> priceFilter;

    public void selectPrice() {
        int priceSize = priceFilter.size();
        for (int i = 0; i < priceSize; i++) {
            priceFilter.get(1).click();
            break;
        }
    }

    @FindBy(css = "label[class=\"RadioListstyles__Label-sc-4132xt-5 gywEET\"]")
    List<WebElement> customerRating;

    public void selectCustomerReview() {
        int ratingSize = customerRating.size();
        for (int i = 0; i < ratingSize; i++) {
            customerRating.get(2).click();
            break;
        }
    }

    @FindBy(css = "div[data-test=\"component-product-card\"]")
    List<WebElement> choseItems;

    public void clickChoseItem() {
        int itemSize = choseItems.size();
        for (int i = 0; i < itemSize; i++) {
            choseItems.get(2).click();
            break;
        }
    }
    @FindBy(css="input[placeholder=\"Postcode or town\"]")
    WebElement postCode;
    public void enterPostCode(String postcode){
        postCode.sendKeys(postcode);
    }
    @FindBy(css="button[data-test=\"fulfilment-search-stock-search-button\"]")
    WebElement submitButton;
    public void clickSubmitButton(){
        submitButton.click();
    }
    @FindBy(css="button[data-test=\"component-att-button\"]")
    WebElement addTrolley;
    public void addToTrolley(){
        addTrolley.click();
    }
    @FindBy(css="button[data-test=\"component-att-button-continue\"]")
    WebElement carryOn;
    public void carryOnShopping(){
        carryOn.click();
    }

}

