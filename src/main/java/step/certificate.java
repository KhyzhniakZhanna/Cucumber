package step;

import conf.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.junit.Assert;
import pages.CertificateObject;
import pages.mainPageObject;

public class certificate extends BaseClass {

    private static mainPageObject mainpage;



    static {
        if (driver==null){BaseClass.BeforeParent();}
    }
    static final String mainUrl = "https://certificate.ithillel.ua/";

    @When("I open certificate page")
    public void iOpenCertificatePage() {
        driver.navigate().to(mainUrl);
    }
    CertificateObject certificateObject= new CertificateObject(driver);


    @And("input certificate number {string}")
    public void inputCertificateNumber(String CERTIFICATE) {
        certificateObject.sendNumber(CERTIFICATE);


    }


    @Then("Check certificate status {string}")
    public void checkCertificateStatus(String EXPECTED) throws Exception {
        Assert.assertEquals(Boolean.valueOf(EXPECTED),certificateObject.checkCertForm());
    }

}


