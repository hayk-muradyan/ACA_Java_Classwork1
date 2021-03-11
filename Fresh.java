public class Fresh {
    private double sum;
    private Ingredient ingredients[];

    public Fresh(Ingredient ings[]) {
        ingredients = new Ingredient[ings.length];
        for (int i = 0; i < ingredients.length; i++) {
            ingredients[i] = ings[i];
        }
        sum = Price();
        System.out.println(sum);
    }

    private double Price() {
        double sum = 0;
        for (int i = 0; i < ingredients.length; i++) {
            sum += ingredients[i].getPrice();
        }
        return sum * 30 / 100;
    }
}
