package com.sva.step_definitions;

import com.sva.pages.BasePage;
import com.sva.utilities.BrowserUtils;
import com.sva.utilities.ConfigurationReader;
import com.sva.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class svaSocialMediaCheckStepDefinitions {

    BasePage basePage = new BasePage();

    @When("user is on the sva Page")
    public void user_is_on_the_sva_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //BrowserUtils.sleep(2);

    }

    @When("user click linkedin Link")
    public void user_click_linkedin_link() {
        basePage.linkedinLink.click();
        //BrowserUtils.sleep(2);

    }

    @Then("check user on the linkedin WebSite")
    public void check_user_on_the_facebook_web_site() {

        Assert.assertTrue(BrowserUtils.linkcheck().contains("linkedin"));
    }

    @When("user click Xing Link")
    public void user_click_xing_link() {
        basePage.xing.click();
    }

    @Then("check user on the Xing WebSite")
    public void check_user_on_the_xing_web_site() {

        Assert.assertTrue(BrowserUtils.linkcheck().contains("xing"));
    }

    @When("user click YouTube Link")
    public void user_click_you_tube_link() {
        basePage.youtube.click();
    }

    @Then("check user on the YouTube WebSite")
    public void check_user_on_the_you_tube_web_site() {
        Assert.assertTrue(BrowserUtils.linkcheck().contains("youtube"));
    }


}