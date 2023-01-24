package testsPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pages.CareerOpportunitiesPage;
import pages.CareersPage;
import pages.HomePage;
import pages.QAAutomationEngineerJobDescriptionPage;

public class Tests extends BaseClass {
    Actions actions = new Actions(driver);
    HomePage homePage = new HomePage(driver);
    CareerOpportunitiesPage careerOpportunitiesPage = new CareerOpportunitiesPage(driver);
    CareersPage careersPage = new CareersPage(driver);
    QAAutomationEngineerJobDescriptionPage qaAutomationEngineerJobDescriptionPage = new QAAutomationEngineerJobDescriptionPage(driver);

    @Before
    public void setUp() throws Exception {
        driver.get("https://ironscales.com/");
    }

    @Test
    public void taskNumberOneCheckingByPlanDropDownLinks() throws InterruptedException {
        actions.moveToElement(driver.findElement(homePage.solutionLinkInHeader)).perform();
        actions.moveToElement(driver.findElement(homePage.byPlanLinkInHeaderInsideSolutionLink)).perform();
        String firstInByPlanDropDown = homePage.getByPlanFirstLinkInDropDown();
        String secondInByPlanDropDown = homePage.getByPlanSecondLinkInDropDown();
        String thirdInByPlanDropDown = homePage.getByPlanThirdLinkInDropDown();
        String expectedInByPlanFirstDropDownTxt = "Starter™";
        String expectedInBySecondFirstDropDownTxt = "Email Protect™";
        String expectedInByThirdFirstDropDownTxt = "Complete Protect™";
//        System.out.println(firstInByPlanDropDown);
//        System.out.println(secondInByPlanDropDown);
//        System.out.println(thirdInByPlanDropDown);
        Assert.assertTrue("First drop down is not proper one", firstInByPlanDropDown.equals(expectedInByPlanFirstDropDownTxt));
        Assert.assertTrue("Second drop down is not proper one", secondInByPlanDropDown.equals(expectedInBySecondFirstDropDownTxt));
        Assert.assertTrue("Third drop down is not proper one", thirdInByPlanDropDown.equals(expectedInByThirdFirstDropDownTxt));
    }

    @Test
    public void taskNumberTwoValidationYearsOfExperienceBiggerThanOneYear() throws InterruptedException {
        actions.moveToElement(driver.findElement(homePage.companyLinkInHeader)).perform();
        homePage.clickOnCareersLinkInCompanyDropDown();
        careersPage.clickOnJoBOpeningButton();
        scrollToBottomOfPage();
        Thread.sleep(5000);
        careerOpportunitiesPage.clickOnQAautomationEngineerJobLink();
        scrollToBottomOfPage();
        Thread.sleep(5000);
        String yearsOfExperienceTxt = qaAutomationEngineerJobDescriptionPage.getYearsOfExperienceTxt();
//        System.out.println(yearsOfExperienceTxt);
        String notExpectedYearsOfExperienceTxt = "1+ year of experience in Test Automation";
        Assert.assertFalse("1 year of experienceTxt written for years of Expreience need", yearsOfExperienceTxt.equals(notExpectedYearsOfExperienceTxt));
    }

    @Test
    public void taskNumberThreeFooterLinksPresent() throws InterruptedException {
        scrollToBottomOfPage();
        Thread.sleep(2000);
        Assert.assertTrue("Linkedin icon in footer not present", homePage.linkedinIconFooterPresent());
        Assert.assertTrue("Youtube icon in footer not present", homePage.youtubeIconFooterPresent());
        Assert.assertTrue("Twitter icon in footer not present", homePage.twitterIconFooterPresent());
        Assert.assertTrue("Facebook icon in footer not present", homePage.facebookIconFooterPresent());
        Assert.assertTrue("Instagram icon in footer not present", homePage.instagramIconFooterPresent());
    }

    @Test
    public void taskNumberThreeFooterLinksClicking() throws InterruptedException {

//        Tried with this two strategies but no success:
//        scrollToBottomOfPage();
//        Thread.sleep(10000);
//        homePage.clickOnInstagramLinkInFooter();
//        Element is not clickable at point (1890, 1382)
//        switchToNewTab();

//        scrollToBottomOfPage();
//        Thread.sleep(5000);
//        actions.moveToElement(driver.findElement(homePage.instagramLinkInFooter)).click().perform();
//        MoveTargetOutOfBoundsException: move target out of bounds
//        switchToNewTab();

//        Did not see any pop up window on page that preventing footer links not accessible
//        Tried in FireFox also but no success
    }
}
