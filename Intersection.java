package City;

abstract class Intersection {
    protected Integer Area = calculateArea() ;
    protected Integer x = 0 ;
    protected Integer y = 0 ;

    public Intersection(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    protected abstract Integer calculateArea();


}
