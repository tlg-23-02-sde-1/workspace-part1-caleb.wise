import java.util.Arrays;

/*
 * Business class to model the workings of a television set.
 * No main() method here.
 */
class Television {

    // Static constants
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS =
            { "Samsung", "LG", "Sony", "Toshiba" };

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - -

    // attributes or properties, called "fields" or "instance variables"
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;  //null if we don't provide a default

    private boolean isMuted;
    private int oldVolume;  // not exposed by get/set methods - internal use only

    // constructors

    public Television() {
        instanceCount++;
    }

    public Television(String brand){
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // functions or operations, called " business methods" in Java
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted()) { // not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {            // are currently muted
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    // accessor methods
    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }
    // data constraint: must be "Samsung," "LG," "Sony," or "Toshiba"
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand: " + brand + ", valid brands are " +
                    Arrays.toString(VALID_BRANDS));
        }
    }

    // data constraint: must be "Samsung," "LG," "Sony," or "Toshiba"
    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equals(brand)) { // we have a match
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
        }

    // data constraint: must be {0-100} - use your class constants (MIN/MAX_VOLUME)
    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {  // valid
            this.volume = volume;
            isMuted = false;
        }
        else {
            System.out.printf("Invalid volume setting: %s, valid range is %s-%s\n",
                    volume, MIN_VOLUME, MAX_VOLUME);

//            System.out.println("Invalid volume setting: " + volume +
//                    ", valid range is " + MIN_VOLUME + "-" + MAX_VOLUME + ".");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation (obviously)
    }

    // toString
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand = %s, volume = %s, display = %s",
                getBrand(), volumeString, getDisplay());
    }
}