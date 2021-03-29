package tests.pageobjects.parameterized.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tests.TestBase;
import tests.pageobjects.parameterized.pages.FormWithFakerAndJavaScriptPage;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.expectedData;
import static tests.TestData.userData;

@DisplayName("Test parameterized")
public class FormWithFakerAndJavaScriptTests extends TestBase {

    @ParameterizedTest
    @MethodSource("getTableDataAsStream")
    void formFillTestWithFaker(String key, String actualValue) {
        assertThat(expectedData.get(key)).isEqualTo(actualValue);
    }

    public static Stream<Arguments> getTableDataAsStream() {
        return open("/automation-practice-form", FormWithFakerAndJavaScriptPage.class)
                .fillForm(userData)
                .getTableDataAsStream();
    }

}
