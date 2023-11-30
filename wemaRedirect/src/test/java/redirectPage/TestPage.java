package redirectPage;

import io.qameta.allure.Description;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import redirectobject.RedirectObjectPage;
import redirectobject.Selectors;

public class TestPage {
    RedirectObjectPage redirectObjectPage = new RedirectObjectPage();
    @BeforeMethod
    public void openPage(){
        redirectObjectPage.setUp();
    }
    @Test
    @Description("object page redirects with user password input and name input")
    public void scrollDown(){
        redirectObjectPage.scrollDownToElementLink();
        redirectObjectPage.changeTab();
        redirectObjectPage.insertText(Selectors.textField,Selectors.text1);
        redirectObjectPage.joinMailingList();
        redirectObjectPage.insertText(Selectors.fieldName,Selectors.text2);
    }
    @AfterTest
    public void tearDown(){
        redirectObjectPage.tearDown();
    }

}
