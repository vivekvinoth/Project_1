/*package pageobjectmanager;

import pageobjectmodel.LoginPage;
import utility.FileReaderManager;

public class PageObjectManager {

    private LoginPage loginPage;
    private FileReaderManager fileReader;
    private static PageObjectManager pageObjectManager;

    public LoginPage getLoginPage() {
        if(loginPage == null)
        {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public FileReaderManager getFileReader()  {
        if(fileReader == null)
        {
            fileReader = new FileReaderManager();
        }
        return fileReader;
    }

    public static PageObjectManager getPageObjectManager()  {
        if(pageObjectManager == null)
        {
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }

}*/
package pageobjectmanager;

import pageobjectmodel.AddressPage;
import pageobjectmodel.CheckOutPage;
import pageobjectmodel.LoginPage;
import pageobjectmodel.SearchProduct;
import utility.FileReaderManager;

public class PageObjectManager {

    private LoginPage loginPage;
    private FileReaderManager fileReader;
    private SearchProduct searchProduct;
    private CheckOutPage checkOutPage;
    private AddressPage addressPage;
    private static PageObjectManager pageObjectManager;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public FileReaderManager getFileReader() {
        if (fileReader == null) {
            fileReader = new FileReaderManager();
        }
        return fileReader;
    }

    public static PageObjectManager getPageObjectManager() {
        if (pageObjectManager == null) {
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }

    public SearchProduct getSearchProduct() {
        if (searchProduct == null) {
            searchProduct = new SearchProduct();
        }
        return searchProduct;
    }

    public CheckOutPage getCheckOutPage() {
        if (checkOutPage== null) {
            checkOutPage = new CheckOutPage();
        }
        return checkOutPage;
    }

    public AddressPage getAddressPage() {
        if (addressPage== null) {
            addressPage = new AddressPage();
        }
        return addressPage;
    }
}

