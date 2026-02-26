public class RecyclableCollector implements WasteCollector{
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if ("Recyclable".equalsIgnoreCase(container.getType())) {
            System.out.println("  !! Recyclable Collector Activating !!");
            System.out.println("     Processing " + container.getCapacity() + "L of recyclables from " + container.getLocation());
            System.out.println("     Action: Sent to sorting facility.");
        } else if (nextCollector != null) {
            System.out.println("  >> RecyclableCollector cannot handle " + container.getType() + ". Passing to next...");
            nextCollector.collectWaste(container);
        } else {
            System.out.println("  XX Error: No collector available for " + container.getType() + " waste.");
        }
    }
}
