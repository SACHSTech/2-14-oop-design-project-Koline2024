public abstract class TeamMember {
    
    protected String name;
    protected String workHours;

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

    
}
