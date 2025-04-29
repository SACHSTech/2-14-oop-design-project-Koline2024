public abstract class TeamMember {
    
    protected String name;
    protected String workHours;
    protected String role;

    public TeamMember(String name, String workHours){
        this.name = name;
        this.workHours = workHours;
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
