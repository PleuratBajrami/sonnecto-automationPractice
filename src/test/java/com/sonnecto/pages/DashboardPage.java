package com.sonnecto.pages;

import com.sonnecto.utilites.Driver;
import com.sonnecto.utilites.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "contact-link")
    public WebElement contactLink;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement logInBttn;


}
