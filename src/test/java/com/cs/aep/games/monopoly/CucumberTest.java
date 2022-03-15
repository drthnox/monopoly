package com.cs.aep.games.monopoly;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created on 8:14 pm, 27/Aug./2019.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = {"com.cs.aep.games.monopoly"}
)
public class CucumberTest {
}
