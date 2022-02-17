package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepDefinition {
EditorPage editorPage=new EditorPage();
    @When("kullanici editor anasayfaya gider")
    public void kullaniciHttpsEditorDatatablesNetAdresineGider() {

        Driver.getDriver().get("https://editor.datatables.net");
    }
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButonu.click();
    }
    @Then("Firstname olarak {string} yazar")
    public void firstname_olarak_yazar(String firstname) {
editorPage.firstNameBox.sendKeys(firstname);
    }
    @Then("lastname olarak {string} yazar")
    public void lastname_olarak_yazar(String lastname) {
editorPage.lastNameBox.sendKeys(lastname);
    }
    @Then("Position olarak {string} yazar")
    public void position_olarak_yazar(String position) {
editorPage.possitionBox.sendKeys(position);
    }
    @Then("Office olarak {string} yazar")
    public void office_olarak_yazar(String office) {
editorPage.officeBox.sendKeys(office);
    }
    @Then("Extension olarak {string} yazar")
    public void extension_olarak_yazar(String extension) {
editorPage.extensionBox.sendKeys(extension);
    }
    @Then("startdate olarak {string} yazar")
    public void startdate_olarak_yazar(String starDate) {
editorPage.dateBox.sendKeys(starDate);
    }
    @Then("Salary olarak {string} yazar")
    public void salary_olarak_yazar(String salary) {
editorPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
editorPage.createButonElement.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        editorPage.searchBoxElement.sendKeys(firstname);
    }


    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        String sonucStr=editorPage.aramasonucuElement.getText();
        Assert.assertTrue(sonucStr.contains(firstname));
    }
}
