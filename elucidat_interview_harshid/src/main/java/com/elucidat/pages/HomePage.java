package com.elucidat.pages;

import com.elucidat.utility.Utility;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

     
    @FindBy(id = "pa_5c9126fe3b767_p15577f075e9-button__text")
    private WebElement startButton;
     
    @FindBy(xpath = "//div[contains(@id,'p154ce332d27-text')]//p[1]")
    private WebElement caseTitle;

    @FindBy(xpath = "//span[@id='pa_5c9126fe3f4fb_p179d7b273e1-icon-1']/i")
    private WebElement caseAgainstLink;

    @FindBy(xpath = "//span[@id='pa_5c9126fe3f4fb_p179d7b273e1-icon-2']/i")
    private WebElement caseToBlame;

  /*  @FindBy(xpath = "//span[@id='pa_5c9126fe3f4fb_p179d7b273e1-caption__text-2']")
    private WebElement caseBlame;*/

    @FindBy(css = "div#pa_5c9126fe434ba_p1550efedbe9-text>p>em")
    private WebElement judgeThisText;
     
    @FindBy(css = "div#pa_5c9126fe434ba_p154ce332d27-text>p:nth-child(2)>em")
    private WebElement videoLinkText;

    @FindBy(id = "pa_5c9126fe434ba_p15564daa856-button__text")
    private WebElement judgeThisButton;

    @FindBy(css = "div#pa_5c9126fe47260_p15515116385-question>div")
    List<WebElement> guiltyAndNonGuiltyButton;

     
    @FindBy(id = "pa_5c9126fe47260_p15515116385-itemInner-1")
    private WebElement guiltyButton;

     
    @FindBy(id = "pa_5c9126fe47260_p15515116385-itemInner-2")
    private WebElement notGuiltyButton;

     
    @FindBy(id = "pa_5c9126fe47260_p15515116385-button__text")
    private WebElement voteButton;


     
    @FindBy(id = "pa_5c9126fe47260_p1554e607e3b-modalTitle")
    private WebElement guiltyOptionResult;


     
    @FindBy(id = "pa_5c9126fe47260_p1554e60707e-modalTitle")
    private WebElement notGuiltyOptionResult;


     
    @FindBy(id = "pa_5c9126fe47260_p15583b88249-button__text")
    private WebElement continueButton;


    public String getPageURLOfCurrentPage() {
        String urlLink = driver.getCurrentUrl();
        return urlLink;
    }

    public void clickOnStartButton() {
        clickOnElement(startButton);
    }

    public void clickOnWhoToBlameCaseLink() {
       waitUntilVisibilityOfElement(caseToBlame, 50);
       clickOnElement(caseToBlame);
    }

    public String getTextFromCaseTwoTitlePage() {

        waitUntilVisibilityOfElement(caseTitle, 50);
        String titleText = getTextFromElement(caseTitle);
        return titleText;

        /*String titleText = null;
        try{
         titleText = getTextFromElement(caseTitle);}

        catch(NoSuchElementException e){
        }
        return titleText;*/
    }


    public void clickOnMakingACaseAgainstKevinLink() {
        clickOnElement(caseAgainstLink);
    }

    public String getTextFromVideoTitleText() {
        String videoText = getTextFromElement(videoLinkText);
        return videoText;
    }

    public String getTextFromJudgeThisText() {
        String judgeButtonText = getTextFromElement(judgeThisText);
        return judgeButtonText;
    }

    public void clickOnJudgeThisButton() {
        clickOnElement(judgeThisButton);
    }

    public List<String> getTextFromShowingOptionWithGuiltyAndNonGuilty() {
        List<String> optionsText = getTextFromListOfElements(guiltyAndNonGuiltyButton);
        return optionsText;
    }

    public void clickOnGuiltyOption() {
        clickOnElement(guiltyButton);
    }

    public void clickOnVoteButton() {
        clickOnElement(voteButton);
    }

    public String getTextFromGuiltyOptionResult() {
        String guiltyOptionResultText = getTextFromElement(guiltyOptionResult);
        return guiltyOptionResultText;
    }

    public void clickOnNotGuiltyOption() {
        clickOnElement(notGuiltyButton);
    }

    public String getTextFromNotGuiltyOptionResult() {
        String notGuiltyOptionResultText = getTextFromElement(notGuiltyOptionResult);
        return notGuiltyOptionResultText;
    }

}
