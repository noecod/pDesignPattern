package creational.abstractfactory;

public class Demo {

    public static void main(String[] args) {
        Demo runDemo = new Demo();
        runDemo.cookAmericanMeals();
        runDemo.cookItalianMeals();
    }

    private void cookAmericanMeals() {
        cookMeal1(new AmericanProductFactory());
        cookMeal2(new AmericanProductFactory());
    }

    private void cookItalianMeals() {
        cookMeal1(new ItalianProductFactory());
        cookMeal2(new ItalianProductFactory());
    }
    
    private void cookMeal1(AbstractProductFactory factory) {
        System.out.println();
        factory.createNapoli().cookIt();
        factory.createCoffee().brewIt();
    }
    
    private void cookMeal2(AbstractProductFactory factory) {
        System.out.println();
        factory.createQuattroStagioni().cookIt();
        factory.createCoffee().brewIt();
    }
}