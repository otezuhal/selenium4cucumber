package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticePage {

    public    AutomationPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
