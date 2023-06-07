public class House {
    private String window;
    private String door;
    private String roof;

    public House() {
    }

    public House(String window, String door, String roof) {
        this.window = window;
        this.door = door;
        this.roof = roof;
    }

    public House openWindow() {
        window = "Opened window";
        return this;
    }

    public House closeWindow() {
        window = "Closed window";
        return this;
    }

    public House lockDoor() {
        door = "Locked door";
        return this;
    }

    public House setColorRoof(String color) {
        roof = "Roof color: " + color;
        return this;
    }

    public void showAbout() {
        System.out.println(window);
        System.out.println(door);
        System.out.println(roof);
    }

    public String getWindow() {
        return window;
    }

    public String getDoor() {
        return door;
    }

    public String getRoof() {
        return roof;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
