package com.xcart.mobile.testsuit;

import com.xcart.mobile.pages.BestSellers;
import com.xcart.mobile.pages.HotDeals;
import com.xcart.mobile.pages.SalePage;
import com.xcart.mobile.testbase.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class HotDealsTest extends TestBase {

    HotDeals hotdeal = new HotDeals();
    SalePage salepage = new SalePage();
    BestSellers bestseller = new BestSellers();


    @Test
    public void verifyUserShouldNavigateToHotDealSuccessfully() {
        hotdeal.mouseHoverToHotDeal();
        hotdeal.clickOnSaleLink();
    }

    @Test

    public void verifyUserShouldNavigateToSalePageSuccessfully() {


        String expectedMessage = "Sale";
        String actualMessage = salepage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Verifiction failed: Sale");
    }

    @Test
    public void verifySaleProductArrangeAlphabetically() {
        salepage.mouseHoverToSortBy();
        salepage.clickOnNameAtoZ();
    }

    @Test

    public void verifySaleProductPriceLowToHigh() {
        salepage.mouseHoverToSortBy();
        salepage.clickOnLowToHigh();
    }

    public void verifyProductsArrangedByRates() {
        salepage.mouseHoverToSortBy();
        salepage.clickOnRates();

    }

    @Test
    public void verifyProductArrangesZtoA() {
        hotdeal.mouseHoverToHotDeal();
        bestseller.clickOnBestseller();
        bestseller.mouseHoverToSorBy();
        bestseller.clickOnzToa();
        //verify Z-A -need to finish
    }

    @Test

    public void verifyProductArrangedHighToLow() {
        bestseller.mouseHoverToSorBy();
        bestseller.clickOnHighToLow();

        //need to do verification
    }

    public void verifyProductsArrangedByRates1() {
        bestseller.mouseHoverToSorBy();
        bestseller.clickOnRates();

//RATES verification-need to do
    }
}
