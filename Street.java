package City;

class Street {
    //parameters
    private Intersection firstIntersection;
    private Intersection secondIntersection;
    private Integer lineNumber;
    //methods

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Intersection getSecondIntersection() {
        return secondIntersection;
    }

    public void setSecondIntersection(Intersection secondIntersection) {
        this.secondIntersection = secondIntersection;
    }

    public Intersection getFirstIntersection() {
        return firstIntersection;
    }

    public void setFirstIntersection(Intersection firstIntersection) {
        this.firstIntersection = firstIntersection;
    }
}
