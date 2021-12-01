package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HotDeals extends Utility {
    By HotDeal = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By saleLink = By.cssSelector("li[class='leaf has-sub'] li:nth-child(1) a:nth-child(1)");


    public void mouseHoverToHotDeal() {
        mouseHoverToElement(HotDeal);

    }
    public void clickOnSaleLink(){
        clickOnElement(saleLink);
    }
}
