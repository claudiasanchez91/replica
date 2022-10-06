package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import  cucumber.api.java.en.When;
import   pages.formularioPage;

public class formularioSteps{

    formularioPage formuc = new  formularioPage();
    
    @Given("^the user navigates to https://178.128.77.104/Softesting/Frontend/Caso1.html$")
     public void  navigateToFormu(){
        formuc.navigateToFormu();
     }
     @And("^Enter name (.+)$")
     public void entername(String criteria){
     formuc.entername(criteria);
    
     }
     @And("^Enter email (.+)$")
     public void enteremail(String criteria){
     formuc.enteremail(criteria);
     }
     @And("^Enter the neighborhood(.+)$")
     public void enterneighborhood(String criteria){
     formuc.enterneighborhood(criteria);
     }
     @And("^Enter the subject(.+)$")
     public void entersubject(String criteria){
     formuc.entersubject(criteria);
     }
     @And("^Enter Message(.+)$")
     public void enterMessage(String criteria){
     formuc.enterMessage(criteria);
     }
     @When("^Send the information(.+)$")
     public void entersend(String criteria){
     formuc.entersend(criteria);
     }
    
}




        