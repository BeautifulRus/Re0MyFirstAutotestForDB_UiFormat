package MyFirstDBWithUI;

import org.junit.Test;

public class DbAddProductTest extends ProductPage{

    public DbAddProductTest() {

    }

    @Test
    public void addNewProductToTable() {
       // BaseSeleniumTestIn.driver.;
        //driver.get("http://localhost:8080/food");;;
        String productName = ConfigProvider.PRODUCT_NAME1;
        boolean isFruit = ConfigProvider.IS_FRUIT1;
        boolean isExotic = ConfigProvider.IS_EXOTIC1;
        AddProductToTable(productName, isFruit, isExotic);

        productName = ConfigProvider.PRODUCT_NAME2;
        isFruit = ConfigProvider.IS_FRUIT2;
        isExotic = ConfigProvider.IS_EXOTIC2;
        AddProductToTable(productName, isFruit, isExotic);












    }

}
