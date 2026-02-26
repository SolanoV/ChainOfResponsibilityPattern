
public class WasteManagementSystem {
    public static void main(String[] args) {
        // Initialize the standalone Chain Manager
        WasteCollectorChain collectionSystem = new WasteCollectorChain();

        System.out.println("=== AUTOMATED WASTE MANAGEMENT SYSTEM ONLINE ===\n");

        // Create the waste containers
        WasteContainer bin1 = new WasteContainer("Organic", 50, "Central Park");
        WasteContainer bin2 = new WasteContainer("Hazardous", 20, "City Hospital");
        WasteContainer bin3 = new WasteContainer("Recyclable", 100, "Mall Plaza");
        WasteContainer bin4 = new WasteContainer("Electronic", 10, "Tech Start-up"); // Tests the unhandled case

        // Trigger the collection process
        collectionSystem.processWaste(bin1);
        collectionSystem.processWaste(bin2);
        collectionSystem.processWaste(bin3);
        collectionSystem.processWaste(bin4);

    }
}