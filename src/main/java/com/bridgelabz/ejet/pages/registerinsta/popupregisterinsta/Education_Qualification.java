package com.bridgelabz.ejet.pages.registerinsta.popupregisterinsta;

import com.bridgelabz.ejet.base.ReadWebinarPropertiesFile;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class Education_Qualification extends ReadWebinarPropertiesFile {
    private final WebDriver driver;
    @FindBy(id="poptdegree")
    WebElement dr_stream;
    @FindBy(xpath="//p[text()='Stream Required']")
    WebElement error;
    @FindBy(xpath="(//div[text()=' Engineering (CS/IT) '])[2]")
    WebElement dr_Ecs;
    @FindBy(xpath="(//div[text()=' Engineering (Non IT) '])[2]")
    WebElement dr_Enon;
    @FindBy(xpath="(//div[text()=' Masters (CS/IT) '])[2]")
    WebElement dr_Mcs;
    @FindBy(xpath="(//div[text()=' Masters (Non IT) '])[2]")
    WebElement dr_Mnon;
    @FindBy(xpath="(//div[text()=' Others (Non Engineering and Non MSc/MCA) '])[2]")
    WebElement dr_other;
    public Education_Qualification(WebDriver driver) throws IOException {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    public String eduction_Qualification(String education) throws InterruptedException, AWTException {
        Robot robot=new Robot();
        dr_stream.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(3000);
        String value = null;
        dr_stream.click();
        Thread.sleep(3000);
        if (education.equals("Engineering (CS/IT)")) {
            value=dr_Ecs.getText();
            dr_Ecs.click();
        } else if (education.equals("Engineering (Non IT)")) {
            value=dr_Enon.getText();
            dr_Enon.click();
        } else if (education.equals("Masters (CS/IT)")) {
            value=dr_Mcs.getText();
            dr_Mcs.click();
        } else if (education.equals("Masters (Non IT)")) {
            value=dr_Mnon.getText();
            dr_Mnon.click();
        } else if (education.equals("Others (Non Engineering and Non MSc/MCA)")) {
            value=dr_other.getText();
            dr_other.click();
        }
        return value;
    }

    public String empty_Value() throws AWTException, InterruptedException {
        Robot robot=new Robot();
        robot.mouseWheel(5);
        Thread.sleep(3000);
        dr_stream.click();
        Thread.sleep(3000);
        String value =error.getText();
        return value;
    }
}
