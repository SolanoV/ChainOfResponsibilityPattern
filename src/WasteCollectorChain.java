public class WasteCollectorChain {
    private WasteCollector chainHead;

    public WasteCollectorChain() {
        buildChain();
    }

    // Encapsulate the chain creation logic
    private void buildChain() {
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        // Link the chain together
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        // Define the entry point
        this.chainHead = organic;
    }

    // Process waste through the chain
    public void processWaste(WasteContainer container) {
        System.out.println(">>> Alert: Full Container Detected: " + container);
        if (chainHead != null) {
            chainHead.collectWaste(container);
        } else {
            System.out.println("  XX Error: Waste collection chain is not initialized.");
        }
        System.out.println("--------------------------------------------------");
    }
}
