package com.dande.ex_17_DataDrivenTesting;

import com.dande.Boilerplate;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testselenium059_POI_Real extends Boilerplate {
    @Test(dataProvider = "getdata")
    public void testselenium_POI_Real(String email, String password)
    {

        System.out.println(email+ "-" +password);

    }
    @DataProvider
    public Object[][] getdata()
    {
            return utilExcel.getTestdatafromExcel("sheet1");

    }

}
