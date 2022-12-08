package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class FormIntereaction {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            // Navigate to the target page
            driver.get ("https://the-internet.herokuapp.com/login");

        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
