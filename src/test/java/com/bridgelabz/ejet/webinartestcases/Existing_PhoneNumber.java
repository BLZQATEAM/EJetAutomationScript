package com.bridgelabz.ejet.webinartestcases;

import com.bridgelabz.ejet.base.BaseClass;
import com.bridgelabz.ejet.pages.webinar.Phone_Number_Field;
import com.bridgelabz.ejet.pages.webinar.WebinarRegistration_Page;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class Existing_PhoneNumber extends BaseClass {
    Phone_Number_Field number;
    WebinarRegistration_Page page;

    @BeforeTest
    public void setUp() throws InterruptedException, IOException {
        initialization();
        number = new Phone_Number_Field(driver);
        page = new WebinarRegistration_Page(driver);
    }

    @Test
    public void verifyExistingPhoneNumber_registration() throws InterruptedException {
        number.phoneNumberExist();
        boolean msg = page.clickEnter();
        Thread.sleep(3000);
        Assert.assertTrue(msg);
    }

    @AfterTest
    public void close_Browser(){
        driver.close();
    }
}
