public class Light {
private boolean isOn;
public void setOn(boolean isOn) {
    this.isOn = isOn;
}
public boolean getOn () {
    return isOn;
}

public String toString() {
        return "the light is: " + isOn;
}

}
