import java.util.ArrayList;

class Profile {
    //parameters
    private String name;
    private Integer money = 0;
    private Integer popularity = 0;
    private ArrayList<Car>cars = new ArrayList<>();
    private ArrayList<Races>races = new ArrayList<>();
    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Races> getRaces() {
        return races;
    }

    public void setRaces(ArrayList<Races> races) {
        this.races = races;
    }
}
