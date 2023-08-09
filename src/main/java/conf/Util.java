package conf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Util {
    public static void scrollToElementVisibilityOf(WebDriver driver, By by) {//scroll untill find
        JavascriptExecutor js = (JavascriptExecutor) driver;

        boolean bool = false;



        while (!bool) {//find Element
            try {
                driver.findElement(by);
                bool = true;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,500)");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}