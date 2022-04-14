package com.sonnecto.tests;

import com.sonnecto.utilites.ConfigurationReader;
import com.sonnecto.utilites.TestBase;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test
    public void createAccountTest(){
        driver.get(ConfigurationReader.getProperty("url"));


    }
}
