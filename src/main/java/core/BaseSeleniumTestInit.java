package core;

import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumTestInit extends BaseSeleniumTest{

    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) { driver = webDriver;}

}
