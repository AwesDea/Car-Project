package City;

import java.util.ArrayList;

class RectangleIntersection extends Intersection{
    //parameters

    public RectangleIntersection(Integer x, Integer y, ArrayList<Street> upStreets, ArrayList<Street> downStreets, ArrayList<Street> leftStreets, ArrayList<Street> rightStreets) {
        super(x, y);
        this.upStreets = upStreets;
        this.downStreets = downStreets;
        this.leftStreets = leftStreets;
        this.rightStreets = rightStreets;
    }

    private ArrayList<Street>upStreets = new ArrayList<>();
    private ArrayList<Street>downStreets = new ArrayList<>();
    private ArrayList<Street>leftStreets = new ArrayList<>();
    private ArrayList<Street>rightStreets = new ArrayList<>();
    @Override
    protected Integer calculateArea() {
        Integer width = 0;
        Integer length = 0;
        Integer answer;
        for(Street street : upStreets){
            width += (street.getLineNumber()*3);
        }
        for(Street street : leftStreets){
            length += (street.getLineNumber()*3);
        }
        answer = width*length;
        return answer;
    }
}
