package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareerOpportunitiesPage {
    public WebDriver driver;
    private By qaAutomationEngineerLink = By.xpath("//a[text()='QA Automation Engineer']");
    public CareerOpportunitiesPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnQAautomationEngineerJobLink(){
        driver.findElement(qaAutomationEngineerLink).click();
    }

}
