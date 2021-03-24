package tests.pageobjects.chain.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.pageobjects.chain.pages.FormWithFakerAndJavaScriptPage;

import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.expectedData;
import static tests.TestData.userData;


@DisplayName("Test chain")
public class FormWithFakerAndJavaScriptTests extends TestBase {
    FormWithFakerAndJavaScriptPage formWithFakerAndJavaScriptPage;

    @Test
    void formWithFakerAndJavaScriptTests() {
        formWithFakerAndJavaScriptPage =
                open("/automation-practice-form", FormWithFakerAndJavaScriptPage.class)
                        .fillForm(userData)
                        .checkData(expectedData);
    }
}
