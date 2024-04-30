package com.elucidat.steps;

import com.elucidat.pages.HomePage;
import com.elucidat.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps extends Utility {

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        String expectedUrl = "https://learning.elucidat.com/course/5c9126fd760e5-611a53751213a";
        String actualUrl = new HomePage().getPageURLOfCurrentPage();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @When("I click on the start button")
    public void iClickOnTheStartButton() {
        new HomePage().clickOnStartButton();
    }

    @And("I click on Who is to blame case link")
    public void iClickOnWhoIsToBlameCaseLink() {
        new HomePage().clickOnWhoToBlameCaseLink();
    }

    @Then("I should be navigate to correct case")
    public void iShouldBeNavigateToCorrectCase(){

       String actualText = new HomePage().getTextFromCaseTwoTitlePage();
        String expectedText= "A young man has been in an accident in the warehouse where he worked and has subsequently died";
        Assert.assertEquals(actualText,expectedText);
    }


    @And("I choose Making a case against Kevin")
    public void iChooseMakingACaseAgainstKevin() {
        new HomePage().clickOnMakingACaseAgainstKevinLink();
    }

    @And("I am redirected to a video with the JUDGE THIS button")
    public void iAmRedirectedToAVideoWithTheJUDGETHISButton() {
        new HomePage().getTextFromVideoTitleText();
        new HomePage().getTextFromJudgeThisText();
    }

    @And("I click on the JUDGE THIS button")
    public void iClickOnTheJUDGETHISButton() {
        new HomePage().clickOnJudgeThisButton();
    }

    @And("I see two options: Guilty and Not Guilty")
    public void iSeeTwoOptionsGuiltyAndNotGuilty() {
        for (int i = 0; i < new HomePage().getTextFromShowingOptionWithGuiltyAndNonGuilty().size(); i++) {
            System.out.println(new HomePage().getTextFromShowingOptionWithGuiltyAndNonGuilty().get(i));
        }
    }

    @When("I select the Guilty option and then click on the Vote button")
    public void iSelectTheGuiltyOptionAndThenClickOnTheVoteButton() {
        new HomePage().clickOnGuiltyOption();
        new HomePage().clickOnVoteButton();

    }

    @Then("I should see the result indicating that I selected the Guilty option")
    public void iShouldSeeTheResultIndicatingThatISelectedTheGuiltyOption() {
        String expectedResult = "GUILTY!";
        String actualResult = new HomePage().getTextFromGuiltyOptionResult();
        Assert.assertEquals(actualResult, expectedResult);

    }


    @When("I select the Not Guilty option and then click on the Vote button")
    public void iSelectTheNotGuiltyOptionAndThenClickOnTheVoteButton() {
        new HomePage().clickOnNotGuiltyOption();
        new HomePage().clickOnVoteButton();
    }

    @Then("I should see the result indicating that I selected the Not Guilty option")
    public void iShouldSeeTheResultIndicatingThatISelectedTheNotGuiltyOption() {
        String expectedResult = "NOT GUILTY!";
        String actualResult = new HomePage().getTextFromNotGuiltyOptionResult();
        Assert.assertEquals(actualResult, expectedResult);

    }

}
