
public class Manager extends TeamMember {

    public Manager(String name, double salary) {
        super(name, salary);
        role = "Manager";
    }

    public void getTasksToDo(Project project) {
        System.out.println("These tasks are stuck: ");
        for (Task task : project.getTasksByStatus("Stuck")) {
            System.out.println(task);
        }
        System.out.println("You must pay these people: ");
        for (Worker person : project.getPayees()) {
            if (person.hasBeenPaid() == false) {
                System.out.println(person);
            }
        }
    }

    public void assignTask(Worker worker, Task task) {
        task.addWorker(worker);
        worker.addTask(task);
    }

    public void checkProgress(Project project) {
        for (Task task : project.getAllTasks()) {
            System.out.println(task);
        }
    }

    public void checkSalaryPayments(Project project) {
        for (Worker person : project.getPayees()) {
            System.out.println(
                    person.getName() + " (Salary " + person.getSalary() + ") Has been paid: " + person.hasBeenPaid());
        }
    }

    public void paySalary(Worker worker) {
        worker.changePayStatus();
    }
}
