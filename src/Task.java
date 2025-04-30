import java.util.ArrayList;

public class Task {

    private String name;
    private String status;
    private String hoursNeeded;
    protected ArrayList<Worker> assignedWorkers = new ArrayList<>();

    public Task(String name, String hoursNeeded) {
        this.name = name;
        this.hoursNeeded = hoursNeeded;
        this.status = "Incomplete";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String input) {
        status = input;
    }

    public String getDeadLine() {
        return hoursNeeded;
    }

    public ArrayList<Worker> getAllWorkers() {
        return assignedWorkers;
    }

    public void addWorker(Worker worker) {
        assignedWorkers.add(worker);
    }

    public String toString() {
        return name + " (" + status + ") Hours Needed: " + hoursNeeded + " - Assigned To: " + getAllWorkers();
    }

    public boolean isNotYetStarted() {
        if (status.equals("Incomplete")) {
            return true;
        }
        return false;
    }

    public boolean isInProgress() {
        if (status.equals("Working")) {
            return true;
        }
        return false;
    }

    public boolean isComplete() {
        if (status.equals("Complete")) {
            return true;
        }
        return false;
    }

    public boolean isStuck() {
        if (status.equals("Stuck")) {
            return true;
        }
        return false;
    }

}