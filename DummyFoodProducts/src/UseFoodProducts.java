public class UseFoodProducts {
    public static void main(String[] args){
        FoodProducts prod1 = new FoodProducts();

        prod1.setType("peach");
        prod1.setWeight(500.00);
        prod1.setCost(1.83);
        prod1.setServings(4);
        prod1.setCalPerServ(70);

        System.out.printf("We sell %s of %6.2f g at a price of $ %4.2f. This product serves %d people and has a number of %4.2f calories per serve.", prod1.getType(), prod1.getWeight(), prod1.getCost(), prod1.getServings(), prod1.getCalPerServ());
    }
}
