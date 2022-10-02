package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import pages.BasePage;

public class Hooks extends BasePage{ //herencia
    
    public Hooks(){ //CONSTRUCTOR
        super(driver);
    }
    @After 
    public void tearDown(Scenario scenario){ //BLOQUE LO QUE HACE CUANdo el scenario falle añada un Screenshot, funcion TearDown
        if(scenario.isFailed()){ // si nuestro scenario esta como fallo
            scenario.write("esto fallo"); // escribe algo en reporte
            final byte[] screenshot = ((TakesScreenshot) driver)//permita hacer algo en el navegador
            .getScreenshotAs(OutputType.BYTES);//Nos crea ScreenshotAs
            scenario.embed(screenshot,"image/png");//embed ingresar algo
        }
    }
}