package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public By solutionLinkInHeader = By.xpath("//*[text()='Solution']");
    public By byPlanLinkInHeaderInsideSolutionLink = By.xpath("//*[text()='By Plan']");
    public By starterLinkInHeaderInsideSolutionLink = By.xpath("//*[text()='Starter™']");
    public By emailProtectLinkInHeaderInsideSolutionLink = By.xpath("//*[text()='Email Protect™']");
    public By completeProtectLinkInHeaderInsideSolutionLink = By.xpath("//*[text()='Complete Protect™']");
    public By companyLinkInHeader = By.xpath("//*[text()='Company']");
    public By careersLinkInHeaderInsideCompanyLink = By.xpath("//*[text()='Careers']");
    public By linkedinLinkInFooter = By.id("LinkedIn In1_layer");
    public By youtubeLinkInFooter = By.id("YouTube2_layer");
    public By twitterLinkInFooter = By.id("Twitter3_layer");
    public By facebookLinkInFooter = By.id("Facebook F4_layer");
    public By instagramLinkInFooter = By.id("Instagram5_layer");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getByPlanFirstLinkInDropDown(){
        return driver.findElement(starterLinkInHeaderInsideSolutionLink).getText();
    }
    public String getByPlanSecondLinkInDropDown(){
        return driver.findElement(emailProtectLinkInHeaderInsideSolutionLink).getText();
    }

    public String getByPlanThirdLinkInDropDown(){
        return driver.findElement(completeProtectLinkInHeaderInsideSolutionLink).getText();
    }

    public void clickOnCareersLinkInCompanyDropDown(){
        driver.findElement(careersLinkInHeaderInsideCompanyLink).click();
    }

    public boolean linkedinIconFooterPresent(){
        return driver.findElement(linkedinLinkInFooter).isDisplayed();
    }

    public boolean youtubeIconFooterPresent(){
        return driver.findElement(youtubeLinkInFooter).isDisplayed();
    }

    public boolean twitterIconFooterPresent(){
        return driver.findElement(twitterLinkInFooter).isDisplayed();
    }

    public boolean facebookIconFooterPresent(){
        return driver.findElement(facebookLinkInFooter).isDisplayed();
    }

    public boolean instagramIconFooterPresent(){
        return driver.findElement(instagramLinkInFooter).isDisplayed();
    }

    public void clickOnInstagramLinkInFooter(){
        driver.findElement(instagramLinkInFooter).click();
    }

}
