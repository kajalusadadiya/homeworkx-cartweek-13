package com.xcart.mobile.testsuit;

import com.xcart.mobile.pages.TopMenu;
import com.xcart.mobile.testbase.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class TopMenuTest extends TestBase {

    TopMenu topMenu = new TopMenu();

    @Test

    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        topMenu.clickOnShipping();

        String expectedMessage = "Shipping";
        String actualMessage = topMenu.getShippingText();
        Assert.assertEquals(expectedMessage, actualMessage, "Verification failed for Text : Shippping");

    }

    @Test

    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        topMenu.clickOnNew();
        String expectedMessage = "New arrivals";
        String actualMessage = topMenu.getNewText();
        Assert.assertEquals(expectedMessage, actualMessage, "Verifiction failed: Text-New arrivals ");

    }

    @Test

    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() {
        topMenu.clickOnComingSoon();
        String expectedMessage = "Coming Soon";
        String actualMessage = topMenu.getComingSoonText();
        Assert.assertEquals(expectedMessage, actualMessage, "Verifiction failed: Coming soon ");


    }

    @Test

    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        topMenu.clickOnContactUs();
        String expectedMessage = "Contact Us";
        String actualMessage = topMenu.getContactUsText();
        Assert.assertEquals(expectedMessage, actualMessage, "Verifiction failed: Contact US ");


    }
}
