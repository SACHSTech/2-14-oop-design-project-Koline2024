import java.util.ArrayList;

public class Task {

    private String name;
    private String status;
    private int skillNeeded;
    private ArrayList<Worker> assignedWorkers = new ArrayList<>();

    public Task(String name, int skillNeeded) {
        this.name = name;
        this.skillNeeded = skillNeeded;
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

    public int getSkillLevel() {
        return skillNeeded;
    }

    public ArrayList<Worker> getAllWorkers() {
        return assignedWorkers;
    }

    public void addWorker(Worker worker) {
        assignedWorkers.add(worker);
    }

    public String toString() {
        return name + " (" + status + ") Skill Level: " + skillNeeded + " - Assigned To: " + getAllWorkers();
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