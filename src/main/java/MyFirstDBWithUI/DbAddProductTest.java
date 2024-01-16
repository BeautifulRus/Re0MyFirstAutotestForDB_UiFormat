package MyFirstDBWithUI;

import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

import java.time.Duration;

public class DbAddProductTest extends BaseSeleniumTest {
    private int tableScopeToCheck = 4;


    @Test
    public void addNewProductToTable() throws InterruptedException {

        String productName = ConfigProvider.PRODUCT_NAME1;
        boolean isFruit = ConfigProvider.IS_FRUIT1;
        boolean isExotic = ConfigProvider.IS_EXOTIC1;
        ProductPage productPage = new ProductPage();
        productPage.AddProductToTable(productName, isFruit, isExotic);
        Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(1));
        tableScopeToCheck++;
        //hasDataInFieldElements();
                            {
                                String prePathForTableCheck = "//tr[" + tableScopeToCheck + "]";
                                By colomnNumberPath = By.xpath(prePathForTableCheck + "/th[text()=" + tableScopeToCheck + "]");
                                WebElement rowNumber = driver.findElement(colomnNumberPath);

                                String rowNumberText = rowNumber.getText();
                                int rowNumberInt = Integer.parseInt(rowNumberText);


                                if (rowNumberInt == tableScopeToCheck) {
                                    By colomnNamePath = By.xpath(prePathForTableCheck + "/td[1]");
                                    WebElement rowName = driver.findElement(colomnNamePath);
                                    String rowNameText = rowName.getText();

                                    if (rowNameText != ConfigProvider.PRODUCT_NAME1) {
                                        Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().ProductName \n " +
                                                "The condition of matching the entered data and element values is not met. \n \n", true);
                                    }
                                } else Assert.assertFalse("DbAddProductTest.(if (rowNumberInt == tableScopeToCheck))\n " +
                                        "The condition of matching the entered data and element values is not met. \n \n", true);
                                //Проверка полей таблицы # и Наименование


                                By rowFruitt = By.xpath(prePathForTableCheck + "/td[2]");
                                WebElement rowFruit = driver.findElement(rowFruitt);
                                String rowFruitText = rowFruit.getText();
                                //сам не понял что написал, но работает
                                // с именем переменной тоже самое
                                if (rowFruitText == "Фрукт") {
                                    if (ConfigProvider.IS_FRUIT1 != true) {
                                        Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isFruit \n " +
                                                "The condition of matching the entered data and element values is not met. \n \n", true);
                                    }
                                } else Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isFruit \n " +
                                            "The condition of matching the entered data and element values is not met. \n \n", true);
                                //Проверка поля таблицы Тип


                                By rowExoticc = By.xpath(prePathForTableCheck + "/td[3]");
                                WebElement rowExotic = driver.findElement(rowExoticc);
                                String rowExoticText = rowExotic.getText();

                                if (rowExoticText == "true") {
                                    if (ConfigProvider.IS_EXOTIC1 != true) {
                                        Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isExotic \n " +
                                                "The condition of matching the entered data and element values is not met. \n \n", true);
                                    }
                                } else Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isExotic \n " +
                                            "The condition of matching the entered data and element values is not met. \n \n", true);
                                //Проверка поля таблицы Экзотический

                            }


















        productName = ConfigProvider.PRODUCT_NAME2;
        isFruit = ConfigProvider.IS_FRUIT2;
        isExotic = ConfigProvider.IS_EXOTIC2;
        productPage.AddProductToTable(productName, isFruit, isExotic);
        tableScopeToCheck++;
        //hasDataInFieldElements();


                                    {
                                        String prePathForTableCheck = "//tr[" + tableScopeToCheck + "]";
                                        By colomnNumberPath = By.xpath(prePathForTableCheck + "/th[text()=" + tableScopeToCheck + "]");
                                        WebElement rowNumber = driver.findElement(colomnNumberPath);

                                        String rowNumberText = rowNumber.getText();
                                        int rowNumberInt = Integer.parseInt(rowNumberText);


                                        if (rowNumberInt == tableScopeToCheck) {
                                            By colomnNamePath = By.xpath(prePathForTableCheck + "/td[1]");
                                            WebElement rowName = driver.findElement(colomnNamePath);
                                            String rowNameText = rowName.getText();

                                            if (rowNameText != ConfigProvider.PRODUCT_NAME2) {
                                                Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().ProductName \n " +
                                                        "The condition of matching the entered data and element values is not met. \n \n", true);
                                            }
                                        } else Assert.assertFalse("DbAddProductTest.(if (rowNumberInt == tableScopeToCheck))\n " +
                                                "The condition of matching the entered data and element values is not met. \n \n", true);
                                        //Проверка полей таблицы # и Наименование


                                        By rowFruitt = By.xpath(prePathForTableCheck + "/td[2]");
                                        WebElement rowFruit = driver.findElement(rowFruitt);
                                        String rowFruitText = rowFruit.getText();
                                        //сам не понял что написал, но работает
                                        // с именем переменной тоже самое
                                        if (rowFruitText == "Фрукт") {
                                            if (ConfigProvider.IS_FRUIT2 != true) {
                                                Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isFruit \n " +
                                                        "The condition of matching the entered data and element values is not met. \n \n", true);
                                            }
                                        } else Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isFruit \n " +
                                                    "The condition of matching the entered data and element values is not met. \n \n", true);
                                        //Проверка поля таблицы Тип


                                        By rowExoticc = By.xpath(prePathForTableCheck + "/td[3]");
                                        WebElement rowExotic = driver.findElement(rowExoticc);
                                        String rowExoticText = rowExotic.getText();

                                        if (rowExoticText == "true") {
                                            if (ConfigProvider.IS_EXOTIC2 != true) {
                                                Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isExotic \n " +
                                                        "The condition of matching the entered data and element values is not met. \n \n", true);
                                            }
                                        } else
                                            Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isExotic \n " +
                                                    "The condition of matching the entered data and element values is not met. \n \n", true);
                                        //Проверка поля таблицы Экзотический

                                    }

























    }





    private void hasDataInFieldElements() {

            String prePathForTableCheck = "//tr[" + tableScopeToCheck + "]";
            By colomnNumberPath = By.xpath(prePathForTableCheck + "/th[text()=" + tableScopeToCheck + "]");
            WebElement rowNumber = driver.findElement(colomnNumberPath);

            String rowNumberText = rowNumber.getText();
            int rowNumberInt = Integer.parseInt(rowNumberText);


            if (rowNumberInt == tableScopeToCheck) {
                By colomnNamePath = By.xpath(prePathForTableCheck + "/td[1]");
                WebElement rowName = driver.findElement(colomnNamePath);
                String rowNameText = rowName.getText();

                if (rowNameText != ConfigProvider.PRODUCT_NAME1) {
                    Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().ProductName \n " +
                            "The condition of matching the entered data and element values is not met. \n \n", true);
                }
            }else Assert.assertFalse("DbAddProductTest.java:50 (if (rowNumberInt == tableScopeToCheck))\n " +
                            "The condition of matching the entered data and element values is not met. \n \n", true);
         //Проверка полей таблицы # и Наименование



            By rowFruitt = By.xpath(prePathForTableCheck + "/td[2]");
            WebElement rowFruit = driver.findElement(rowFruitt);
            String rowFruitText = rowFruit.getText();
            //сам не понял что написал, но работает
            // с именем переменной тоже самое
            if (rowFruitText == "Фрукт") {
                if (ConfigProvider.IS_FRUIT1 != true) {
                    Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isFruit \n " +
                            "The condition of matching the entered data and element values is not met. \n \n", true);
                }
            } else Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isFruit \n " +
                        "The condition of matching the entered data and element values is not met. \n \n", true);
            //Проверка поля таблицы Тип



        By rowExoticc = By.xpath(prePathForTableCheck + "/td[3]");
        WebElement rowExotic = driver.findElement(rowExoticc);
        String rowExoticText = rowExotic.getText();

        if (rowExoticText == "true") {
            if (ConfigProvider.IS_EXOTIC1 != true) {
                Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isExotic \n " +
                        "The condition of matching the entered data and element values is not met. \n \n", true);
            }
        } else   Assert.assertFalse("DbAddProductTest.hasDataInFieldElements().isExotic \n " +
                    "The condition of matching the entered data and element values is not met. \n \n", true);
                  //Проверка поля таблицы Экзотический












        }
    }




