package deviceFactory;

import static io.appium.java_client.remote.MobilePlatform.IOS;

public class FactoryDevice {

    public static IDevice make(String type) {
        IDevice device;
        switch (type) {
            case "android":
                    device = new Android();
                    break;
            case "ios":
                    device = new IOs();
                    break;
            case "windowsphone":
                    device = new WindowsPhone();
                    break;
            default:
                    device = new Android();
                    break;
        }
        return device;
    }
}

