package com.sonnecto.tests;

import com.sonnecto.pages.DashboardPage;
import com.sonnecto.utilites.Driver;
import org.testng.annotations.Test;

public class FirstTest {
    DashboardPage dashboardPage = new DashboardPage();
    @Test
    public void testOne(){
        Driver.getDriver().get("http://automationpractice.com/index.php");

        dashboardPage.contactLink.click();


        String a;
    }




    //berkan hoti branch
}
