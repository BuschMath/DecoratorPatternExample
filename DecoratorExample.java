public class DecoratorExample {

    public static void main(String[] args) {
        // Create a basic pizza
        Pizza pizza = new BasicPizza();

        // Add cheese and pepperoni toppings
        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);

        // Print the description and cost of the pizza
        System.out.println(pizza.getDescription() + " - $" + pizza.getCost());
    }
}
