package activity;

import appiumControl.TextBox;
import org.openqa.selenium.By;

public class YouTubeManagerActivity {

    public TextBox searchVideo;

    public YouTubeManagerActivity() {

        searchVideo= new TextBox(By.id("com.google.android.youtube:id/search_edit_text"));
    }
}