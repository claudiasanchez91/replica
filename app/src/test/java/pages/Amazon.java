package pages;



public class Amazon extends BasePage {
//DEFINIMOS LOS WEB ELEMENTOS
 private String searchBox = "//input[@id='twotabsearchtextbox']";
 private String searchButton = "//input[@id='nav-search-submit-button']";
private String thirdResult ="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";//TERCER PRODUCTO SE BUSCA CON EL PATH ABSOLUTO
private String addToCartButton ="//input[@id='add-to-cart-button']";
private String addedMessageText = "//span[contains(text(),'Agregado al carrito')]";

public Amazon(){
    super(driver);
}
public void navigateToAmazon(){
    navigateTo("https://www.amazon.com"); // NAVEGAR A
}

public void entersearchCriteria(String criteria){//ESCRIBIR EL CRITERIO
    write(searchBox,criteria);
}

public void clickSearch(){ //CLCIK EN EL BOTON
    clickElement(searchButton);
}

public void goToPage2(String pageNumber){ //NUMERO DE LA PAGINA
    goToLinkText(pageNumber);
}

public void pick3rdItem(){
    clickElement(thirdResult);
}

public void addToCart(){
    clickElement(addToCartButton);
}

public String addedToCartMessage(){
    return textFromElement(addedMessageText);
}

}