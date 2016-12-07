package City;

import java.util.ArrayList;

class TShapeedIntersection extends Intersection{
    //parameters
    private ArrayList<Street>verticalStreets = new ArrayList<>();
    private ArrayList<Street> horizontalStreets = new ArrayList<>();

    public TShapeedIntersection(Integer x, Integer y, ArrayList<Street> verticalStreets, ArrayList<Street> horizontalStreets) {
        super(x, y);
        this.verticalStreets = verticalStreets;
        this.horizontalStreets = horizontalStreets;
    }

    @Override
    protected Integer calculateArea() {
        Integer length = 0;
        Integer width = 0;
        for(Street street:verticalStreets){
            length+=street.getLineNumber()*3;
        }
        for(Street street: horizontalStreets){
            length+=street.getLineNumber()*3;
        }
        return width*length;
    }
}
