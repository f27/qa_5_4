package tests.pageobjects.scenario.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.pageobjects.scenario.pages.FormWithFakerAndJavaScriptPage;



import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.expectedData;
import static tests.TestData.userData;

@DisplayName("Test scenario")
public class FormWithFakerAndJavaScriptTests extends TestBase {
    FormWithFakerAndJavaScriptPage formWithFakerAndJavaScriptPage;

    @Test
    void formWithFakerAndJavaScriptTests() {
        formWithFakerAndJavaScriptPage = open("/automation-practice-form", FormWithFakerAndJavaScriptPage.class);
        formWithFakerAndJavaScriptPage.fillForm(userData);
        formWithFakerAndJavaScriptPage.checkData(expectedData);
    }
}
