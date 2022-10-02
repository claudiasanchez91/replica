package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BasePage;



@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/resources/features",//DONDE SE ENCUENTRAN LOS FEATURES
    glue="steps",
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},//CREAR UN JSON EN ESTE DIRECTORIO Y ALIMENTAR EL REPORTE HTML
    monochrome = true,
    tags = "@Cart"
)

public class runner{
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();

    }
    
}