package tests.pageobjects.parameterized.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tests.pageobjects.TestBase;
import tests.pageobjects.parameterized.pages.FormWithFakerAndJavaScriptPage;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@DisplayName("Test parameterized")
public class FormWithFakerAndJavaScriptTests extends TestBase {
    static FormWithFakerAndJavaScriptPage formWithFakerAndJavaScriptPage;

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
        formWithFakerAndJavaScriptPage = open("https://demoqa.com/automation-practice-form", FormWithFakerAndJavaScriptPage.class);
        formWithFakerAndJavaScriptPage.fillForm(userData);
    }

    @AfterAll
    static void closeModal() {
        formWithFakerAndJavaScriptPage.closeModal();
    }

    @ParameterizedTest
    @MethodSource("getTableDataAsStream")
    void formFillTestWithFaker(String key, String actualValue) {
        assertThat(expectedData.get(key), is(actualValue));
    }

    public static Stream<Arguments> getTableDataAsStream() {
        return FormWithFakerAndJavaScriptPage.getTableDataAsStream();
    }

}
