package City;

import java.util.ArrayList;

class PerpendicularIntersection extends Intersection{
    //parameters
    private ArrayList<Street>firstStreets = new ArrayList<>();
    private ArrayList<Street>secondStreets = new ArrayList<>();
    private ArrayList<Street>thirdStreets = new ArrayList<>();
    //methods

    public PerpendicularIntersection(Integer x, Integer y, ArrayList<Street> firstStreets, ArrayList<Street> secondStreets, ArrayList<Street> thirdStreets) {
        super(x, y);
        this.firstStreets = firstStreets;
        this.secondStreets = secondStreets;
        this.thirdStreets = thirdStreets;
    }

    @Override
    protected Integer calculateArea() {
        Integer width = 0;
        Integer length = 0;
        for(Street street :firstStreets){
            width+= street.getLineNumber()*3;
        }
        for(Street street: secondStreets){
            length+= street.getLineNumber()*3;
        }
        if(!width.equals(length))
            return width*length;
        length = 0;
        for(Street street: thirdStreets){
            length+=street.getLineNumber()*3;
        }
        return length*width;
    }
}
