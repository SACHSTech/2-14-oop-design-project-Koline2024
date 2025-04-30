import java.util.ArrayList;

public class Project {

    protected ArrayList<Task> taskList = new ArrayList<>();
    protected ArrayList<TeamMember> teamList = new ArrayList<>();

    public Project(ArrayList<Task> taskList, ArrayList<TeamMember> teamList) {
       this.taskList = taskList;
       this.teamList = teamList;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void clearTasks() {
        taskList.clear();
    }

    public void removeTask(Task toBeRemoved) {
        for (Task task : taskList) {
            if (task.getName().equals(toBeRemoved.getName())) {
                taskList.remove(task);
            }
        }
    }

    public ArrayList<Task> getAllTasks() {
        return taskList;
    }

    public ArrayList<Task> getTasksByName(String search) {
        ArrayList<Task> toBeReturned = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getName().equals(search)) {
                toBeReturned.add(task);
            }
        }
        return toBeReturned;
    }

    public ArrayList<Task> getTasksByStatus(String search) {
        ArrayList<Task> toBeReturned = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getStatus().equals(search)) {
                toBeReturned.add(task);
            }
        }
        return toBeReturned;
    }

    public ArrayList<Task> getTasksByWorker(Worker worker){
        ArrayList<Task> toBeReturned = new ArrayList<>();
        for(Task task : taskList){
            for(Worker worker2 : task.getAllWorkers()){
                if(worker2.equals(worker)){
                    toBeReturned.add(task);
                }
            }
        }
        return toBeReturned;
    }

    public void addTeamMember(TeamMember member) {
        teamList.add(member);
    }

    public void removeMember(TeamMember toBeRemoved) {
        for (TeamMember member : teamList) {
            if (member.getName().equals(toBeRemoved.getName())) {
                teamList.remove(member);
            }
        }
    }

    public ArrayList<Worker> getPayees() {
        ArrayList<Worker> payees = new ArrayList<>();
        for (TeamMember member : teamList) {
            if (member.getRole().equals("Worker")) {
                payees.add((Worker)member);
            }
        }
        return payees;
    }

}
