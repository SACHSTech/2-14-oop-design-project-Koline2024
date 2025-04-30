public class Worker extends TeamMember{
    
     boolean salaryPaid = false;

    public Worker(String name, double salary){
        super(name, salary);
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

   public boolean hasBeenPaid(){
     return salaryPaid;
   }

   public void changePayStatus(){
     if(salaryPaid == false){
          salaryPaid = true;
     }else{
          salaryPaid = false;
     }
   }

   public double getSalary(){
     return salary;
   }

   public String toString(){
        return name + " Working On: "; 
   }
}
