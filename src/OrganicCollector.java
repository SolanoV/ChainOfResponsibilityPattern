public class OrganicCollector implements WasteCollector{
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if ("Organic".equalsIgnoreCase(container.getType())) {
            System.out.println("  !! Organic Collector Activating !!");
            System.out.println("     Processing " + container.getCapacity() + "L of organic matter from " + container.getLocation());
            System.out.println("     Action: Composting initiated.");
        } else if (nextCollector != null) {
            System.out.println("  >> OrganicCollector cannot handle " + container.getType() + ". Passing to next...");
            nextCollector.collectWaste(container);
        } else {
            System.out.println("  XX Error: No collector available for " + container.getType() + " waste.");
        }
    }
}
