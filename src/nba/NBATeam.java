package nba;


public class NBATeam {
    private String name;
    private City city;
    private Conference conference;
    private int numberOfTitles;
    private boolean inPlayOffs;

    public NBATeam(String name, City city, int numberOfTitles, boolean inPlayOffs) {
        this.name = name;
        this.city = city;
        if (city.equals(City.BOSTON) || city.equals(City.BROOKLYN) || city.equals(City.PHILADELPHIA) ||
                city.equals(City.NYC) || city.equals(City.CHICAGO)) {
            this.conference = Conference.EASTERN;
        }
        else this.conference = Conference.WESTERN;
        
        this.numberOfTitles = numberOfTitles;
        this.inPlayOffs = inPlayOffs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public int getNumberOfTitles() {
        return numberOfTitles;
    }

    public void setNumberOfTitles(int numberOfTitles) {
        this.numberOfTitles = numberOfTitles;
    }

    public boolean isInPlayOffs() {
        return inPlayOffs;
    }

    public void setInPlayOffs(boolean inPlayOffs) {
        this.inPlayOffs = inPlayOffs;
    }
    
}
