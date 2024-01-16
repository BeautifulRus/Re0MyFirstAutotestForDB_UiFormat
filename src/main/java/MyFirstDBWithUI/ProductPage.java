package MyFirstDBWithUI;

import core.BaseSeleniumTestInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseSeleniumTestInit {

    @FindBy(xpath = "//div/div/div/div[1]/button")
    private WebElement buttonAddProduct;

    @FindBy(xpath = "//input [@id='name']") 
    private WebElement inputName;

    @FindBy(xpath = "//select/option [@value=\"FRUIT\"]")
    private WebElement listType_Fruit;

    @FindBy(xpath = "//select/option [@value=\"VEGETABLE\"]")
    private WebElement listType_Vegetable;

    @FindBy(xpath = "//input [@id = \"exotic\"]")
    private WebElement checkboxExotic;

    @FindBy(xpath = "//button [@id = \"save\"]")
    private WebElement buttonSave;








    public ProductPage(){
        driver.get("http://localhost:8080/food");
        PageFactory.initElements(driver, this);

    }



    public void AddProductToTable (String productName, boolean isFruit, boolean isExotic){
        buttonAddProduct.click();
        inputName.sendKeys(productName);
        /*listTypeFruit.click*/
            if (isFruit){
            listType_Fruit.click();

        }else listType_Vegetable.click();
        /*checkboxExotic.click*/
            if (isExotic){
                checkboxExotic.click();
            }
        buttonSave.click();
    }
}
