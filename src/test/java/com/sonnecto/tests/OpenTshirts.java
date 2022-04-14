package com.sonnecto.tests;

import com.sonnecto.utilites.ConfigurationReader;
import com.sonnecto.utilites.TestBase;
import org.testng.annotations.Test;

public class OpenTshirts extends TestBase {

    @Test
    public void openTshirts(){
        driver.get(ConfigurationReader.getProperty("url"));
        TshirtsBttn
    }
}
