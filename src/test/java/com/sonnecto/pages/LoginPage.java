package com.sonnecto.pages;

import com.sonnecto.utilites.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage extends TestBase {

    @FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[1]")
    public WebElement emailField;

    @FindBy(id = "id_gender1")
    public WebElement selectGenderMale;

    @FindBy(id = "customer_firstname")
    public WebElement firstNameField;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameField;

    @FindBy(id = "passwd")
    public WebElement passwordField;

    @FindBy(id = "address1")
    public WebElement addressField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(id = "uniform-id_state")
    public WebElement stateField;

    public void selectDaysOfBirth(int index){
        Select select = new Select(driver.findElement(By.id("days")));
        select.selectByIndex(index);
    }

    public void selectMonthOfBirth(String month){
        Select select = new Select(driver.findElement(By.id("months")));
        select.selectByVisibleText(month);
    }

    public void selectYearOfBirth(String year){
        Select select = new Select(driver.findElement(By.id("years")));
        select.selectByVisibleText(year);
    }

    public void verifyLoginTitle(){
        String expectedDriver = "Login - My Store";
        String actualDriver = driver.getTitle();
        Assert.assertEquals(expectedDriver, actualDriver);


    }
}
