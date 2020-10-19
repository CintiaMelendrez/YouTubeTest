package runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import sessionManager.Session;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
public class Runner {
    // Hooks (acciones antes y despues de cada scenario)
    @Before
    public void beforeCucumber(){

        System.out.println("BEFORE Cucumber");
    }

    @After
    public void afterCucumber(Scenario scenario) throws MalformedURLException {
        //agregando la captura de pantalla
        if (scenario.isFailed()){
            byte[] screenShoot=Session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
            //agregando en el archivo .json la informacion de la captura de pantalla
            scenario.embed(screenShoot, "Image/png");
        }

        System.out.println("AFTER Cucumber");
        Session.getInstance().closeSession();
    }
}

