public class UseImprovedFoodProducts {
    public static void main(String[] args){

        FoodProducts prod1 = new FoodProducts();

        prod1.setType("Apple");
        prod1.setWeight(452.16);
        prod1.setCost(215);
        prod1.setServings(4);
        prod1.setCalPerServ(68.00);

        prod1.display();
        //de apelat metodele !!!!!
        prod1.costPerGrams();



        FoodProducts prod2 = new FoodProducts();
        prod2.setType("Pear");
        prod2.setWeight(698);
        prod2.setCost(600);
        prod2.setServings(3);
        prod2.setCalPerServ(98);

        prod2.display();
    }
}
