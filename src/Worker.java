public class Worker extends TeamMember{
    
    public Worker(String name, String workHours){
        super(name, workHours);
        role = "Worker";
    }

   public void getTasksToDo(Project project){
          System.out.println("These are your tasks: ");
          for(Task toDo : project.getAllTasks()){
               for(Worker worker : toDo.getAllWorkers()){
                    if(worker.getName().equals(name)){
                         System.out.println(toDo);
                         break;
                    }
               }
          }
   }

   public void updateTaskStatus(String status, Task task){
        task.setStatus(status);
   }

   public String toString(){
        return name + " Working On: "; 
   }
}
