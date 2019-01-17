package com.xavient.chatbot;


import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

public class BaseE2ETest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseE2ETest.class);
    protected Map<String, String> testProperties;
    public int count=0;

    @Before
    @SuppressWarnings("unchecked")
    public void setUp() throws FileNotFoundException {
        String environmentName = System.getProperty("spring.profiles.active");
        if (environmentName == null || environmentName.isEmpty() ) {
            throw new IllegalArgumentException(
                    "Test requires environment parameterization via -Dspring.profiles.active=esp-xxx");
        }

        Yaml yaml = new Yaml();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/" + "properties.yml");
        Map<String, Map<String, String>> data = (Map<String, Map<String, String>>) yaml.load(fileInputStream);
        if (!data.keySet().contains(environmentName)) {
            throw new IllegalArgumentException("Unable to find specified environment named " + environmentName);
        }
        testProperties = data.get(environmentName);
        testProperties.put("profile", environmentName);

     
    }

    protected byte[] readFileContent(final String filePath) throws IOException {
        return readAllBytes(get("src/main/resources/" + filePath));
    }

    protected String getGenericFileName(String testCaseName) {
        if (testProperties.get("profile").indexOf("prd") > 0)
            return testCaseName + "_prod.json";
        else if (testProperties.get("profile").indexOf("stg") > 0)
            return testCaseName + "_stage.json";

        else {
            return testCaseName + ".json";
        }
    }

}
