package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificateObject {
    @FindBy(name = "certificate")
    WebElement certField;
    @FindBy(id = "certificateCheckForm")
    WebElement checkForm;


    WebDriver driver;

    public CertificateObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sendNumber(String number) {
        certField.sendKeys(number);
        certField.sendKeys(Keys.ENTER);
    }

    private boolean checkCertificate() {
        return driver.getCurrentUrl().contains("view");
    }

    public boolean checkCertForm() throws Exception {
        System.out.println(checkForm.getAttribute("class"));

        int i = 0;
        boolean result = false;
        while (true) {
            if (checkCertificate()) {
                result = true;
                break;
            }
            if (checkForm.getAttribute("class").contains("invalid")) {
                result = false;
                break;
            }

            Thread.sleep(1000);
            i++;
            if (i > 10) {
                throw new Exception("Out of time wait certif");
            }
        }
        return result;
        }
    }
