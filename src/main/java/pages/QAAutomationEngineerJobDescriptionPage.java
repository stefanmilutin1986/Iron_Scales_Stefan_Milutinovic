package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QAAutomationEngineerJobDescriptionPage {

    public WebDriver driver;

    private By yearsOfExperienceTxt = By.xpath("//*[text()='2+ year of experience in Test Automation']");

    public QAAutomationEngineerJobDescriptionPage(WebDriver driver){
        this.driver=driver;
    }

    public String getYearsOfExperienceTxt(){
        return driver.findElement(yearsOfExperienceTxt).getText();
    }

}
