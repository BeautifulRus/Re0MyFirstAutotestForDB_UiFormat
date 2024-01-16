package MyFirstDBWithUI;

import core.BaseSeleniumTest;
import core.BaseSeleniumTestInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseSeleniumTestInit {


    @FindBy(xpath = "//div/div/div/div[1]/button")
    private static WebElement buttonAddProduct;

    @FindBy(xpath = "//input [@id='name']") 
    private static WebElement inputName;

    @FindBy(xpath = "//select/option [@value=\"FRUIT\"]")
    private static WebElement listType_Fruit;

    @FindBy(xpath = "//select/option [@value=\"VEGETABLE\"]")
    private static WebElement listType_Vegetable;

    @FindBy(xpath = "//input [@id = \"exotic\"]")
    private static WebElement checkboxExotic;

    @FindBy(xpath = "//button [@id = \"save\"]")
    private static WebElement buttonSave;








    public ProductPage(){

        PageFactory.initElements(driver, this);
        driver.get(ConfigProvider.URL);
    }

    public static void AddProductToTable(String productName, boolean isFruit, boolean isExotic){
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
