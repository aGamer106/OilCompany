import java.util.ArrayList;
import java.util.List;

public class OffshoreExtractor extends Extractor implements Reporter{

    private List<Worker> workers;

    public OffshoreExtractor(int capacity, int quantity) {
        super(capacity, quantity, true);
        this.workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }


    @Override
    public boolean reportFault() {
        boolean hasNotDoctor = workers.stream().noneMatch(v -> v.getPosition() == WorkerPosition.MEDIC);
        boolean hasBeenMoreThen14Days = workers.stream().anyMatch(v -> v.getNumberOfDays() > 14);
        return quantity/capacity > 70 || hasNotDoctor || hasBeenMoreThen14Days;
    }
}
