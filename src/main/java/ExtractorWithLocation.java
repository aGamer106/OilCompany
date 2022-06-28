public abstract class ExtractorWithLocation extends Extractor{

    protected String location;

    public ExtractorWithLocation(int capacity, int quantity, boolean canReportFaults, String location) {
        super(capacity, quantity, canReportFaults);
        this.location = location;
    }

    @Override
    public String toString() {
        return "ExtractorWithLocation{" +
                "location='" + location + '\'' +
                '}';
    }
}
