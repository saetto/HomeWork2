package FirstTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Andrei Pazniak on 4/2/2017.
 */
public class MainPage {

    @Test
    public void firstTest(){

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://javaguru.lv");
        driver.quit();
    }
}
