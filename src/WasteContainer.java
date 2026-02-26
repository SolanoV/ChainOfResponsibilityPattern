public class WasteContainer {
    private String type;
    private int capacity; // in Liters
    private String location;

    public WasteContainer(String type, int capacity, String location) {
        this.type = type;
        this.capacity = capacity;
        this.location = location;
    }

    public String getType() { return type; }
    public int getCapacity() { return capacity; }
    public String getLocation() { return location; }

    @Override
    public String toString() {
        return "[" + type + " Container | " + capacity + "L at " + location + "]";
    }
}
