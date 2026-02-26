public interface WasteCollector {
    void setNextCollector(WasteCollector nextCollector);
    void collectWaste(WasteContainer container);

}
