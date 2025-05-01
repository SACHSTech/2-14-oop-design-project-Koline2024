
public class Manager extends TeamMember {

    public Manager(String name, double salary) {
        super(name, salary);
        role = "Manager";
    }

    /**
     * Returns tasks that are stuck and employees that must be paid in a specific
     * project
     * 
     * @param Project
     * @return void
     * @author ChrisX
     */
    public void getTasksToDo(Project project) {
        System.out.println("These tasks are stuck: ");
        for (Task task : project.getTasksByStatus("Stuck")) {
            System.out.println(task);
        }
        System.out.println("You must pay these people: ");
        for (Worker person : project.getPayees()) {
            if (person.hasBeenPaid() == false) {
                System.out.println(person + " Salary: $" + person.getSalary());
            }
        }
    }

    /**
     * Assigns a worker to a task if they meet the skill level requirement.
     * 
     * @param worker
     * @param task
     * @return void
     * @author ChrisX
     */
    public void assignTask(Worker worker, Task task) {
        if (worker.getSkillLevel() >= task.getSkillLevel()) {
            task.addWorker(worker);
            worker.addTask(task);
            System.out.println(worker.getName() + " has been assigned to " + task.getName());
        } else {
            System.out.println(worker.getName() + " is not qualified to: " + task.getName());
        }

    }

    public void checkProgress(Project project) {
        for (Task task : project.getAllTasks()) {
            System.out.println(task);
        }
    }

    /**
     * Checks if an employee's salary has been paid in a specific project
     * 
     * @param project
     * @return void
     * @author ChrisX
     */
    public void checkSalaryPayments(Project project) {
        for (Worker person : project.getPayees()) {
            System.out.println(
                    person.getName() + " (Salary " + person.getSalary() + ") Has been paid: " + person.hasBeenPaid());
        }
    }

    /**
     * Changes pay status of worker. Actual payment... must be done in person.
     * 
     * @param worker
     * @return void
     * @author ChrisX
     */
    public void paySalary(Worker worker) {
        worker.changePayStatus();
    }

    public void fireWorker(Worker worker, Project project) {
        System.out.println("They have been fired. ");
        project.removeMember(worker);
    }
}
