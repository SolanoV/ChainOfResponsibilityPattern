public class HazardousCollector implements WasteCollector{
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if ("Hazardous".equalsIgnoreCase(container.getType())) {
            System.out.println("  !! Hazardous Collector Activating !!");
            System.out.println("     Processing " + container.getCapacity() + "L of hazardous material from " + container.getLocation());
            System.out.println("     Action: Incineration or specialized containment.");
        } else if (nextCollector != null) {
            System.out.println("  >> HazardousCollector cannot handle " + container.getType() + ". Passing to next...");
            nextCollector.collectWaste(container);
        } else {
            System.out.println("  XX Error: No collector available for " + container.getType() + " waste.");
        }
    }
}
