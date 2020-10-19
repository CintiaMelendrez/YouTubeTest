package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button searchButton;

    public MainActivity(){
        searchButton= new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Buscar\"]"));
    }

    public static boolean isVideoDisplayed(String nameVideo){
        String locator="//android.view.ViewGroup[@content-desc='"+nameVideo+"']";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }
}

