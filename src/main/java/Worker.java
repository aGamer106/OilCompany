public class Worker {

    private String name;

    private WorkerPosition position;

    private int numberOfDays;

    public Worker(String name, WorkerPosition position, int numberOfDays) {
        this.name = name;
        this.position = position;
        this.numberOfDays = numberOfDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerPosition getPosition() {
        return position;
    }

    public void setPosition(WorkerPosition position) {
        this.position = position;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", numberOfDays=" + numberOfDays +
                '}';
    }
}
