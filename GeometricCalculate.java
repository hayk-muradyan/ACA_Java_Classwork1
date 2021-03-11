public class GeometricCalculate {
    private Shape shape;
    public GeometricCalculate(Shape sh){
        shape = sh;
    }
    public double calculate(Shape shape){
        return shape.S();
    }
    public double calculate(Shape shape,boolean p) {
        if (p)
            return shape.P();
        return 0;
    }
}
