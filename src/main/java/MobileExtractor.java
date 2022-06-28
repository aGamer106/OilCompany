public class MobileExtractor extends ExtractorWithLocation implements Reporter{

    public MobileExtractor(int capacity, int quantity, String location) {
        super(capacity, quantity, true, location);
        setNewLocation(location);
    }

    public void setNewLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean reportFault() {
        return quantity/capacity > 25;
    }
}
