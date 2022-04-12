package com.sonnecto.pages;

import com.sonnecto.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "contact-link")
    public WebElement contactLink;

}
