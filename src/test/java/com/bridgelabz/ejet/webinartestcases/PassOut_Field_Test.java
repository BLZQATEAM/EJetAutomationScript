package com.bridgelabz.ejet.webinartestcases;

import com.bridgelabz.ejet.base.BaseClass;
import com.bridgelabz.ejet.pages.webinar.PassOut_Field;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;

public class PassOut_Field_Test extends BaseClass {
    PassOut_Field passout;

    public PassOut_Field_Test() {
        super();
    }
    @BeforeTest
    public void setUp() throws InterruptedException {
        initialization();
        passout = new PassOut_Field(driver);
    }

    @Test
    public void select_passOut_year_TwoThousandTwentyFour() throws InterruptedException, AWTException {
        String msg = passout.passout("2024");
        Assert.assertEquals(msg,"2024");
    }
    @Test
    public void select_passOut_year_TwoThousandTwentyThree() throws InterruptedException, AWTException {
        String msg = passout.passout("2023");
        Assert.assertEquals(msg,"2023");
    }
    @Test
    public void select_passOut_year_TwoThousandTwentyTwo() throws InterruptedException, AWTException {
        String msg = passout.passout("2022");
        Assert.assertEquals(msg,"2022");
    }
    @Test
    public void select_passOut_TwoThousandTwentyOne() throws InterruptedException, AWTException {
        String msg = passout.passout("2021");
        Assert.assertEquals(msg,"2021");
    }
    @Test
    public void select_passOut_year_TwoThousandTwenty() throws InterruptedException, AWTException {
        String msg = passout.passout("2020");
        Assert.assertEquals(msg,"2020");
    }
    @Test
    public void select_passOut_before_TwoThousandTwenty() throws InterruptedException, AWTException {
        String msg = passout.passout("Before 2020");
        Assert.assertEquals(msg,"Before 2020");
    }
    @Test
    public void select_passOut_after_TwoThousandTwentyFour() throws InterruptedException, AWTException {
        String msg = passout.passout("After 2024");
        Assert.assertEquals(msg,"After 2024");
    }
    @Test
    public void not_select_passOut_Year() throws InterruptedException, AWTException {
        String msg = passout.empty_Value();
        Assert.assertEquals(msg,"Year Required");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
