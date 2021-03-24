package tests.pageobjects.steps.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.pageobjects.steps.pages.FormWithFakerAndJavaScriptPage;

import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.expectedData;
import static tests.TestData.userData;

@DisplayName("Test steps")
public class FormWithFakerAndJavaScriptTests extends TestBase {
    FormWithFakerAndJavaScriptPage formWithFakerAndJavaScriptPage;

    @Test
    void formWithFakerAndJavaScriptTests() {
        formWithFakerAndJavaScriptPage = open("/automation-practice-form", FormWithFakerAndJavaScriptPage.class);
        formWithFakerAndJavaScriptPage.checkPageIsLoaded(userData.get("Form Title"));
        formWithFakerAndJavaScriptPage.fillFirstName(userData.get("First Name"));
        formWithFakerAndJavaScriptPage.fillLastName(userData.get("Last Name"));
        formWithFakerAndJavaScriptPage.fillEmail(userData.get("Email"));
        formWithFakerAndJavaScriptPage.fillGender(userData.get("Gender"));
        formWithFakerAndJavaScriptPage.fillMobile(userData.get("Mobile"));
        formWithFakerAndJavaScriptPage.fillDateOfBirthday(userData.get("Year Of Birth"), userData.get("Month Of Birth"), userData.get("Day Of Birth"));
        formWithFakerAndJavaScriptPage.fillSubjects(userData.get("Subjects"));
        formWithFakerAndJavaScriptPage.fillHobbies(userData.get("Hobbies"));
        formWithFakerAndJavaScriptPage.fillPicture(userData.get("Picture"));
        formWithFakerAndJavaScriptPage.fillAddress(userData.get("Address"));
        formWithFakerAndJavaScriptPage.fillState(userData.get("State"));
        formWithFakerAndJavaScriptPage.fillCity(userData.get("City"));
        formWithFakerAndJavaScriptPage.clickSubmit();
        formWithFakerAndJavaScriptPage.checkData(expectedData);
    }
}
