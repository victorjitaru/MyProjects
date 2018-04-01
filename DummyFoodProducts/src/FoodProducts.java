public class FoodProducts {
    private String type;
    private double weight;
    private double cost;
    private int servings;
    private double calPerServ;

    public void setType(String type){
        if(!type.equals("")){
            this.type = type;
        }
    }
    public String getType(){
        return type;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void setCost(double cost){
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }
    public void setServings(int servings){
        this.servings = servings;
    }
    public int getServings(){
        return servings;
    }

    public void setCalPerServ(double calPerServ){
        this.calPerServ = calPerServ;
    }
    public double getCalPerServ(){
        return calPerServ;
    }

    public void display(){
        System.out.printf("We have %s with a weight of %7.2fg which costs $%5.2f.It can serve %d people and has %5.2f calories per serve.", type, weight, cost, servings, calPerServ);
    }

    public double costPerGrams(){
        return cost * 100 / 500;
    }

    public double costPerServe(){
        return cost / servings;
    }

    public double totalCal(){
        return calPerServ * servings;
    }
}
