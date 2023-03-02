import java.util.List;

public class Team {
    private String teamname;
    private String name;
    public int rank;

    public Team(String teamname, int rank, String name){
        this.teamname = teamname;
        this.rank = 0;
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString(){
        return "Team: " + teamname +"" + " rank: " + rank + "" +" name: " + name;
    }

}
