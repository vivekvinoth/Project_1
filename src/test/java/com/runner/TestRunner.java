/*package com.runner;

import com.base.Base_Class;
import pageobjectmanager.PageObjectManager;

import static pageobjectmodel.LoginPage.validLogin;

public class TestRunner extends Base_Class {
    public static void main(String[] args) throws InterruptedException {
        launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
        launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
        PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
    }
}*/
package com.runner;

import com.base.Base_Class;
import pageobjectmanager.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.time.Duration;

public class TestRunner extends Base_Class {
    public static void main(String[] args) throws InterruptedException {
        launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
        launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
        PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
        Thread.sleep(2000);
        //screenshot(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("screenshot"));
        PageObjectManager.getPageObjectManager().getSearchProduct().searchProduct();
        PageObjectManager.getPageObjectManager().getCheckOutPage().checkOut();
        Thread.sleep(4000);
        screenshot(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("screenshot"));
        PageObjectManager.getPageObjectManager().getAddressPage().addressPage();
    }
}