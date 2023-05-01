package com.sva.pages;

import com.sva.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fab fa-youtube']")
    public WebElement youtube;

    @FindBy(xpath = "//i[@class='fa fa-xing-square']")
    public WebElement xing;


    @FindBy(xpath = "//i[@class='fab fa-linkedin']")
    public WebElement linkedinLink;


}

