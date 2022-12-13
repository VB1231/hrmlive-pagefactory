package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgetPassword extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgot();
        Assert.assertEquals(loginPage.verifyResetText(), "Reset Password", "not verify");
    }
}
