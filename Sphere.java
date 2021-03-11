public class Sphere extends Shape{
    public Sphere(double r){
        this.radius = r;
    }
    //Calculates Space of the sphere
    public double P(){
        return 4*Math.PI*Math.pow(radius,2);
    }
    //Calculates Volume of the sphere
    public double S(){
        return 4/3*Math.PI*Math.pow(radius,3);
    }
}
