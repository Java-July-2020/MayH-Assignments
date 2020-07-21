public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    protected void displayInfo(String make) {
        System.out.println(String.format("%s %s from %s", make, getVersionNumber(), getCarrier()));
    }
    // getters and setters removed for brevity. Please implement them yourself

    public String getVersionNumber(){
        return versionNumber;
    }

    public String getRingTone(){
        return ringTone;
    }

    public String getCarrier(){
        return carrier;
    }
}