public class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
    public static void main(String[] args)
    {
        Sports s = new Sports();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
        Soccer s1 = new Soccer();
        System.out.println(s.getName());
        s1.getNumberOfTeamMembers();
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
