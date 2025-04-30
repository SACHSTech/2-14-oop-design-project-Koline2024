import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

        Worker Adam = new Worker("Adam", "3");
        Worker Bob = new Worker("Bob", "6");
        Worker Cindy = new Worker("Cindy", "4");
        Manager Daniel = new Manager("Daniel", "3");

        Task makeCalls = new Task("Make Calls", "3");
        Task fixTheOfficeCoffeeMachine = new Task("Fix the office coffee machine", "1");
        Task removeTheCorpsesFromTheFreezer = new Task("Remove the corpses from the freezer", "5");
        Task fixTheSpaghettiCode = new Task("Fix the spaghetti code", "400");

        ArrayList<Task> veryStrangeTaskList = new ArrayList<>();
        veryStrangeTaskList.add(makeCalls);
        veryStrangeTaskList.add(fixTheOfficeCoffeeMachine);
        veryStrangeTaskList.add(removeTheCorpsesFromTheFreezer);
        veryStrangeTaskList.add(fixTheSpaghettiCode);

        ArrayList<TeamMember> wageSlaves = new ArrayList<>();
        wageSlaves.add(Adam);
        wageSlaves.add(Bob);
        wageSlaves.add(Cindy);
        wageSlaves.add(Daniel);

        Project officeTasks = new Project(veryStrangeTaskList, wageSlaves);

        Daniel.assignTask(Cindy, fixTheSpaghettiCode);
        Daniel.assignTask(Bob, removeTheCorpsesFromTheFreezer);
        Daniel.assignTask(Adam, makeCalls);
        Daniel.assignTask(Adam, fixTheOfficeCoffeeMachine);
        Adam.updateTaskStatus("Stuck", makeCalls);
        //Daniel.checkProgress(officeTasks);
        //Daniel.getTasksToDo(officeTasks);


        //System.out.println(removeTheCorpsesFromTheFreezer);

    }
}
