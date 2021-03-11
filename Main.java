public class Main {
    public static void main(String[] args){
        ////////////////////////////////////////
        //Triangle
        int sides[] = new int[3];
        sides[0] = 1;
        sides[1] = 2;
        sides[2] = 3;
        Triangle triangle = new Triangle(sides);
        System.out.println(triangle.IsValid());
        ////////////////////////////////////////
        //Fresh Ingredients
        Ingredient arr[] = new Ingredient[4];
        arr[0] = new Ingredient("a",1);
        arr[1] = new Ingredient("b",2);
        arr[2] = new Ingredient("c",3);
        arr[3] = new Ingredient("d",4);
        Fresh fresh = new Fresh(arr);
        ////////////////////////////////////////
        //Point
        Point p = new Point(2,2);
        System.out.println(p.distance());
        System.out.println(p.distance(new Point(5,6)));
        ////////////////////////////////////////
        //GeometricCalculate
        Shape crc = new Circle(5);
        Shape sph = new Circle(3);
        GeometricCalculate GCC = new GeometricCalculate(crc);
        GeometricCalculate GCS = new GeometricCalculate(sph);

        System.out.println(GCC.calculate(crc));
        System.out.println(GCC.calculate(crc,true));
        System.out.println(GCS.calculate(sph));
        System.out.println(GCS.calculate(sph,true));
    }
}
