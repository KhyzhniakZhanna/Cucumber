package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class mainPageObject {
    private WebDriver driver;
    private By consultationButton= By.id("btn-consultation-hero");
    private By coursetittle=By.xpath("//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[1]/div/h1/span[1]/strong");
    private By courserate=By.className("course-rating");
    private By coursedescription=By.className("introduction-info_content");
    private By coacheslist=By.className("coach-list_item");
    private By coachesnames=By.className("coach-card_name");


    public mainPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getConsultationButton() {
        return driver.findElement(consultationButton);
    }

    public WebElement getCoursetittle() {
        return driver.findElement(coursetittle);
    }

    public WebElement getCourserate() {
        return driver.findElement(courserate);
    }
    public WebElement getcoursedescription() {
        return driver.findElement(coursedescription);
    }

    public List <String> getcoacheslist() {
        List <String> stringlist=new ArrayList<>();
        List <WebElement> list=driver.findElements(coacheslist);
        for (WebElement element : list) {
            stringlist.add(element.findElement(By.className("coach-card_name")).getText());
        }
        return stringlist;
  }



}
