public class Triangle {
    private int sides[];
    public Triangle(int sides[]){
        if(sides.length == 3){
            this.sides = new int[3];
            for(int i = 0; i < 3; i++)
                this.sides[i] = sides[i];
        }
    }
    public boolean IsValid(){
        if(sides.length == 3){
            int p = sides[0]+sides[1]+sides[2];
            boolean isvalid = true;
            for(int i = 0 ;i < 3;i++) {
                if (p - sides[i] <= sides[i])
                    isvalid = false;
            }
            return isvalid;
        }
        return false;
    }
}
