package repository;

import java.util.ArrayList;
import nba.City;
import nba.NBATeam;


public class TeamsRepository {
    private ArrayList<NBATeam> teams;

    public TeamsRepository() {
        teams = new ArrayList<>();
        try {
            teams.add(new NBATeam("San Antonio Spurs", City.SAN_ANTONIO, 5, false));
        teams.add(new NBATeam("Sacramento Kings", City.SACRAMENTO, 0, true));
        teams.add(new NBATeam("Chicago Bulls", City.CHICAGO, 6, false));
        teams.add(new NBATeam("NYC Knicks", City.NYC, 3, false));
        teams.add(new NBATeam("Philadelhia 76ers", City.PHILADELPHIA, 2, true));
        teams.add(new NBATeam("Brooklyn Nets", City.BROOKLYN, 0, false));
        teams.add(new NBATeam("LA Lakers", City.LA, 16, true));
        teams.add(new NBATeam("Boston Celticss", City.BOSTON, 17, false));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public ArrayList<NBATeam> getTeams() {
        return teams;
    }
    
    
}
