package City;

import java.util.ArrayList;

class City {
    //singletone object
    private static City city;

    //parameters
    private ArrayList<Street>streets = new ArrayList<>();
    private ArrayList<Intersection>intersections = new ArrayList<>();

    // constructor
    private City(){}
    public static void initializer(){
        if(city==null)
            city = new City();
    }
    //methods
    public ArrayList<Street> getStreets() {
        return streets;
    }

    public void setStreets(ArrayList<Street> streets) {
        this.streets = streets;
    }

    public ArrayList<Intersection> getIntersections() {
        return intersections;
    }

    public void setIntersections(ArrayList<Intersection> intersections) {
        this.intersections = intersections;
    }
}
