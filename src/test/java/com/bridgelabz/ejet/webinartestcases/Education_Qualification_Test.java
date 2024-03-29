package com.bridgelabz.ejet.webinartestcases;

import com.bridgelabz.ejet.base.BaseClass;
import com.bridgelabz.ejet.pages.webinar.Education_Qualification;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;

public class Education_Qualification_Test extends BaseClass {
    Education_Qualification qualification;

    public Education_Qualification_Test()  {
        super();
    }
    @BeforeTest
    public void setUp() throws InterruptedException {
        initialization();
        qualification = new Education_Qualification(driver);
    }
    @Test
    public void select_Engineering_Cs_Or_It() throws InterruptedException, AWTException {
        String msg=qualification.eduction_qua("Engineering (CS/IT)");
        Assert.assertEquals(msg,"Engineering (CS/IT)");
    }
    @Test
    public void select_Engineering_Non_Cs_Or_It() throws InterruptedException, AWTException {
        String msg=qualification.eduction_qua("Engineering (Non IT)");
        Assert.assertEquals(msg,"Engineering (Non IT)");
    }
    @Test
    public void select_Masters_Cs_Or_It() throws InterruptedException, AWTException {
        String msg=qualification.eduction_qua("Masters (CS/IT)");
        Assert.assertEquals(msg,"Masters (CS/IT)");
    }
    @Test
    public void select_Masters_Non_Cs_Or_It() throws InterruptedException, AWTException {
        String msg=qualification.eduction_qua("Masters (Non IT)");
        Assert.assertEquals(msg,"Masters (Non IT)");
    }
    @Test
    public void select_Other() throws InterruptedException, AWTException {
        String msg=qualification.eduction_qua("Others (Non Engineering and Non MSc/MCA)");
        Assert.assertEquals(msg,"Others (Non Engineering and Non MSc/MCA)");
    }
    @Test
    public void not_select_EducationQualification() throws InterruptedException, AWTException {
        String msg = qualification.empty_Value();
        Assert.assertEquals(msg,"Stream Required");
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
