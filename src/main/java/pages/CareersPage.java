package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareersPage {
    public WebDriver driver;
    private By jobOpeningsButton = By.xpath("//a[text()='Job Openings']");
    //Tried using contains xpath method locator - //*[contains(text(),'year of experience in Test Automation')]
    // AS logic was to make something universal not depending from number of years showed but even with ctrl+f in DevTools Elements this lcoator was showing as valid I could not make it work in script
    public CareersPage (WebDriver driver){
        this.driver=driver;
    }
    public void clickOnJoBOpeningButton(){
        driver.findElement(jobOpeningsButton).click();
    }

}
