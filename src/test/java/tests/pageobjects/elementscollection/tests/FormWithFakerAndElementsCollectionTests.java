package tests.pageobjects.elementscollection.tests;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.pageobjects.elementscollection.pages.FormWithFakerAndElementsCollectionPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.expectedData;
import static tests.TestData.userData;

@DisplayName("Elements collection tests")
public class FormWithFakerAndElementsCollectionTests extends TestBase {


    @Test
    void formFillWithFakerTest() {
        Map<String,String> actualData =
                open("/automation-practice-form", FormWithFakerAndElementsCollectionPage.class)
                .fillForm(userData)
                .getTableData();
        SoftAssertions softly = new SoftAssertions();
        expectedData.forEach((key, value) -> softly.assertThat(actualData.get(key)).isEqualTo(value));
        softly.assertAll();
    }

}
