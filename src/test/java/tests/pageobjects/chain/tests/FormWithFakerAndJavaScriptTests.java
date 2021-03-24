package tests.pageobjects.chain.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.pageobjects.chain.pages.FormWithFakerAndJavaScriptPage;

import static com.codeborne.selenide.Selenide.open;

@DisplayName("Test chain")
public class FormWithFakerAndJavaScriptTests extends TestBase {
    FormWithFakerAndJavaScriptPage formWithFakerAndJavaScriptPage;

    @Test
    void formWithFakerAndJavaScriptTests() {
        formWithFakerAndJavaScriptPage =
                open("https://demoqa.com/automation-practice-form", FormWithFakerAndJavaScriptPage.class)
                        .fillForm(userData)
                        .checkData(expectedData)
                        .closeModal();
    }
}
