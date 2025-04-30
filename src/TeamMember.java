public abstract class TeamMember {
    
    protected String name;
    protected String workHours;
    protected String role;
    protected double salary;

    public TeamMember(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getWorkHours(){
        return workHours;
    }

    public String getRole(){
        return role;
    }

    public abstract void getTasksToDo(Project project);
}
