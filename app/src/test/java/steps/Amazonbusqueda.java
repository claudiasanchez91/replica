
package steps;

import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Amazon;

public class Amazonbusqueda {
    Amazon amazonc = new Amazon();
    // SE LLAMAN LOS METODOS 
    @Given("^the user navigates to www.amazon.com$")
    public void navigateToAmazon(){
        amazonc.navigateToAmazon();
    }

    @When("^Searches for (.+)$")
    public void enterSearchCriteria(String criteria){
    amazonc.entersearchCriteria(criteria);
    amazonc.clickSearch();
    }

    @And("^navigates to the page number (.+)$")
    public void navigateToSecondPage(String pageNumber){
    amazonc.goToPage2(pageNumber);
    }
    
    @And("^selects the third item$")  
    public void selectsThirdItem(){
     amazonc.pick3rdItem();
    }

    @Then("^the user is able to add it to the cart$")
    public void itemCanBeAddedToTheCart(){
    amazonc.addToCart();
    Assert.assertEquals("Agregado al carrito", amazonc.addedToCartMessage());
    }
}
