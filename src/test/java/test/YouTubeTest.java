package test;

import activity.YouTubeManagerActivity;
import activity.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class YouTubeTest {

    MainActivity mainActivity = new MainActivity();
    YouTubeManagerActivity youTubeManagerActivity = new YouTubeManagerActivity();

    @Test
    public void verifySearchVideo() throws MalformedURLException {

        String nameVideo = "miley cyrus malibu";

        mainActivity.searchButton.click();
        youTubeManagerActivity.searchVideo.type(nameVideo);

        // Verification
        Assert.assertFalse("ERROR, The video wasn't found",mainActivity.isVideoDisplayed(nameVideo));

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
