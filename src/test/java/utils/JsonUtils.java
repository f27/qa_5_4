package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static utils.FileUtils.readStringFromFile;


public class JsonUtils {
    public static Map<String, String> mapFromJson(String json) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> data = null;
        try {
            data = mapper.readValue(json,
                    new TypeReference<Map<String, String>>() {
                    });
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static String getJsonFromTable(String trSelector, String tdSelector) {
        String js = readStringFromFile("./src/test/resources/js/get_table_data_universal.js");
        return executeJavaScript(js, trSelector, tdSelector);
    }
}
