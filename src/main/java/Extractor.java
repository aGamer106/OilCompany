import java.util.UUID;

public abstract class Extractor {

    protected UUID serial;

    protected int capacity;

    protected int quantity;


    protected boolean canReportFaults;

    public Extractor(int capacity, int quantity, boolean canReportFaults) {
        this.serial = UUID.randomUUID();
        this.capacity = capacity;
        this.quantity = quantity;
        this.canReportFaults = canReportFaults;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isCanReportFaults() {
        return canReportFaults;
    }

    @Override
    public String toString() {
        return "Extractor{" +
                "serial=" + serial +
                ", capacity=" + capacity +
                ", quantity=" + quantity +
                ", canReportFaults=" + canReportFaults +
                '}';
    }
}
