import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException{

        String input = "";
        String input2;
        String input3;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Worker Adam = new Worker("Adam", 3, 1);
        Worker Bob = new Worker("Bob", 6, 2);
        Worker Cindy = new Worker("Cindy", 7, 4);
        Worker Daniel = new Worker("Daniel", 5, 3);
        Worker Emmanuel = new Worker ("Emmanuel", 10, 11);
        Worker Fiona = new Worker("Fiona", 8, 5);
        Worker George = new Worker("George", 4, 8);
        Worker Hong = new Worker ("Hong", 25, 30);

        System.out.println("Enter your name: ");
        input = reader.readLine();
        Manager manager = new Manager(input, 10000);

        Task makeCalls = new Task("Make Calls", 3);
        Task fixTheOfficeCoffeeMachine = new Task("Fix the office coffee machine", 1);
        Task removeTheCorpsesFromTheFreezer = new Task("Remove the corpses from the freezer", 5);
        Task fixTheSpaghettiCode = new Task("Fix the spaghetti code", 25);
        Task letOutTheMouse = new Task("Let out the mouse", 2);
        Task cookSlop = new Task("Cook slop", 2);
        Task untangleTheHDMICables = new Task("Untangle the HDMI cables", 4);
        Task crawlUnderBossDesk = new Task("Crawl under the boss's desk", 5);
        Task manufactureLuck = new Task("Manufacture luck", 15);
        Task feedTheInternsSlop = new Task("Feed the interns slop", 2);
        Task chainTheInternsToTheWall = new Task("Chain the interns to the wall", 7);
        Task tellJesusToTakeTheWheel = new Task("Tell Jesus to take the wheel", 1);
        Task deportTheHRTeam = new Task("Deport the HR team", 8);
        Task bribeOSHA = new Task("Bribe OSHA", 10);
        Task cry = new Task("Cry", 0);

        ArrayList<Task> veryStrangeTaskList = new ArrayList<>();
        veryStrangeTaskList.add(makeCalls);
        veryStrangeTaskList.add(fixTheOfficeCoffeeMachine);
        veryStrangeTaskList.add(removeTheCorpsesFromTheFreezer);
        veryStrangeTaskList.add(fixTheSpaghettiCode);
        veryStrangeTaskList.add(letOutTheMouse);
        veryStrangeTaskList.add(cookSlop);
        veryStrangeTaskList.add(untangleTheHDMICables);
        veryStrangeTaskList.add(crawlUnderBossDesk);
        veryStrangeTaskList.add(manufactureLuck);
        veryStrangeTaskList.add(feedTheInternsSlop);
        veryStrangeTaskList.add(chainTheInternsToTheWall);
        veryStrangeTaskList.add(tellJesusToTakeTheWheel);
        veryStrangeTaskList.add(deportTheHRTeam);
        veryStrangeTaskList.add(bribeOSHA);
        veryStrangeTaskList.add(cry);
        


        ArrayList<TeamMember> wageSlaves = new ArrayList<>();
        wageSlaves.add(Adam);
        wageSlaves.add(Bob);
        wageSlaves.add(Cindy);
        wageSlaves.add(Daniel);
        wageSlaves.add(Emmanuel);
        wageSlaves.add(Fiona);
        wageSlaves.add(George);
        wageSlaves.add(Hong);
        wageSlaves.add(manager);

        Project officeTasks = new Project(veryStrangeTaskList, wageSlaves);

        System.out.println("Welcome, " + manager.getName());
        while(!input.equals("5")){
            System.out.println("1: Get daily tasks");
            System.out.println("2: Pay employees");
            System.out.println("3: Get task list");
            System.out.println("4: Assign tasks");
            System.out.println("5: Exit");
            input = reader.readLine();
            if(input.equals("1")){
                manager.getTasksToDo(officeTasks);
            }else if(input.equals("2")){
                System.out.println(officeTasks.getPayees());
                System.out.println("Pay who? ");
                input = reader.readLine();
                manager.paySalary(officeTasks.getWorkerByName(input));
            }else if(input.equals("3")){
                officeTasks.getAllTasks();
            }else if(input.equals("4")){
                System.out.println("Assign what task?");
                officeTasks.getAllTasks();
                input2 = reader.readLine();
                
            }

        }




    }
}
