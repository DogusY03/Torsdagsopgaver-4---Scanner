public class Main {
    public static void main(String[] args) {
Team team1 = new Team("Navi",1,"Simple");
team1.setRank(1);

Team team2 = new Team("Faze",2,"Kariggan");
team2.setRank(2);

Team team3 = new Team("Astralis",3,"Device");
team3.setRank(3);

Team team4 = new Team("Hyllg",4,"Dogus");
team4.setRank(4);

        System.out.println(team1.toString());
        System.out.println(team2.toString());
        System.out.println(team3.toString());
        System.out.println(team4.toString());
    }
}