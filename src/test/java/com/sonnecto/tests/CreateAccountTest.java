package com.sonnecto.tests;

import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilites.ConfigurationReader;
import com.sonnecto.utilites.Driver;
import com.sonnecto.utilites.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CreateAccountTest {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    @Test
    public void createAccountTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        dashboardPage.logInBttn.click();
        loginPage.emailField.sendKeys(loginPage.faker.internet().emailAddress() + Keys.ENTER);
        loginPage.verifyLoginTitle();
        loginPage.selectGenderMale.click();
        loginPage.firstNameField.sendKeys(loginPage.faker.name().firstName());
        loginPage.lastNameField.sendKeys(loginPage.faker.name().lastName());
        loginPage.passwordField.sendKeys(loginPage.faker.internet().password());
        loginPage.selectDaysOfBirth(6);
        loginPage.selectMonthOfBirth("June");
        loginPage.selectYearOfBirth("1999");
        loginPage.addressField.sendKeys(loginPage.faker.address().fullAddress());
        loginPage.cityField.sendKeys(loginPage.faker.address().city());
        loginPage.selectState(1);
        loginPage.postalCodeField.sendKeys(loginPage.faker.address().zipCode());
        loginPage.mobilePhoneField.sendKeys(loginPage.faker.phoneNumber().cellPhone() + Keys.ENTER);


    }
}
