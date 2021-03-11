public class Circle extends Shape{
    public Circle(double r){
        this.radius = r;
    }
    //Calculates Perimeter of the circle
    public double P(){
        return 2*Math.PI*radius;
    }
    //Calculates Space of the circle
    public double S(){
        return Math.PI*Math.pow(radius,2);
    }

}
