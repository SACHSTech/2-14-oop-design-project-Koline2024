import java.util.ArrayList;

public class Worker extends TeamMember {

     boolean salaryPaid = false;
     ArrayList<Task> assignedTasks = new ArrayList<>();

     public Worker(String name, double salary) {
          super(name, salary);
          role = "Worker";
     }

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


     public void updateTaskStatusToStuck(Task task){
          task.setStatus("Stuck");
     }

     public void updateTaskStatusToComplete(Task task){
          task.setStatus("Complete");
     }

     public boolean hasBeenPaid() {
          return salaryPaid;
     }

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

     public void addTask(Task task){
          assignedTasks.add(task);
     }

     public String toString() {
          return name;
     }
}
