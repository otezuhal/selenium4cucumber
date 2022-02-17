package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPage {
     public DemoGuruPage (){
         PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath="//thead//tr//th")
    public List<WebElement> baslikWebElementListesi;


     public List<WebElement> sutunListesiGetir(int index ){
         String dinamikxpath="//tbody//tr//td["+(index+1)+"]";

         List<WebElement> istenenSutunWebElementleri=Driver.getDriver().findElements(By.xpath(dinamikxpath));

         return istenenSutunWebElementleri;
     }



}
