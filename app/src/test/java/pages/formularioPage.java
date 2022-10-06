package pages;

public class formularioPage extends BasePage {

private String name = "//*[@id='nombre']";
private String  email = "//*[@id='grupo__email']";
private String  neighborhood ="//*[@id='grupo__barrio']";
private String  subject ="//*[@id='grupo__asunto']/div/input']";
private String   Message = "//*[@id='formulario']/div[5]/textarea]";
private String    send = "//*[@id='formulario']/div[7]/button]";

public formularioPage(){
    super(driver);
}

public void  navigateToFormu(){
navigateTo("https://178.128.77.104/Softesting/Frontend/Caso1.html");

}
public void entername(String criteria){
    writename(name,criteria);
}
public void enteremail(String criteria){
    writeemail(email,criteria);
}
public void enterneighborhood(String criteria){
    writeneighborhood(neighborhood,criteria);
}
public void entersubject(String criteria){
    writeentersubject(subject,criteria);
}
public void enterMessage(String criteria){//ESCRIBIR EL CRITERIO
    writeMessage(Message,criteria);
}
public void entersend(String criteria){//ESCRIBIR EL CRITERIO
    writesend(send,criteria);
   }
}