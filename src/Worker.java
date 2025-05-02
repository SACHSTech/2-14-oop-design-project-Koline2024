import java.util.ArrayList;

public class Worker extends TeamMember {

     private boolean salaryPaid = false;
     private ArrayList<Task> assignedTasks = new ArrayList<>();
     private int skillLevel;

     public Worker(String name, double salary, int skillLevel) {
          super(name, salary);
          this.skillLevel = skillLevel;
          role = "Worker";
     }

     /**
      * Returns a list of tasks that are assigned to the worker and are incomplete.
      * 
      * @param project
      * @return void
      * @author ChrisX
      */
     public void getTasksToDo(Project project) {
          System.out.println("These are your tasks: ");
          for (Task toDo : project.getAllTasks()) {
               for (Worker worker : toDo.getAllWorkers()) {
                    if (worker.getName().equals(name) && toDo.getStatus().equals("Incomplete")) {
                         System.out.println(toDo);
                         break;
                    }
               }
          }
     }

     public int getSkillLevel() {
          return skillLevel;
     }

     public void updateTaskStatusToStuck(Task task) {
          task.setStatus("Stuck");
     }

     public void updateTaskStatusToComplete(Task task) {
          task.setStatus("Complete");
     }

     public boolean hasBeenPaid() {
          return salaryPaid;
     }

     /**
      * Method changes pay status of worker.
      * @return void
      * @author ChrisX
      */
     public void changePayStatus() {
          if (salaryPaid == false) {
               salaryPaid = true;
          } else {
               salaryPaid = false;
          }
     }

     public double getSalary() {
          return salary;
     }

     public void addTask(Task task) {
          assignedTasks.add(task);
     }

     public String toString() {
          return name + " Skill Level: " + skillLevel + " Salary: " + salary;
     }
}
