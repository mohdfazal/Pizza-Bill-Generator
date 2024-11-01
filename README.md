Pizza Bill Generator 🍕

A Java program for a pizza cafe, generating detailed bills for customers based on pizza choices and additional requests. 
The project supports two pizza types (Regular and Deluxe) with vegetarian and non-vegetarian options, each with customizable add-ons.

Features:

Pizza Types:

Regular Pizza: Veg and Non-Veg options with base prices.
Deluxe Pizza: Comes with extra cheese and toppings by default.

Add-ons:

Extra Cheese: Can be added to Regular Pizza upon request.
Extra Toppings: Customizable toppings for Regular Pizza.
Paper Bag: Option for takeaway, with an additional cost.
Bill Generation:

Calculates total cost with itemized breakdown.
Ensures no duplicate charges for repeated add-on requests.
Generates a structured bill format.
Classes
Pizza
Defines a customizable pizza object with:

addExtraCheese(): Adds cheese (single charge).
addExtraToppings(): Adds toppings (single charge).
addTakeaway(): Adds a takeaway option.
getBill(): Generates an itemized bill with base price, add-ons, and total.
DeluxePizza
Extends Pizza, automatically adding cheese and toppings to Deluxe pizzas during initialization.

Example Usage
java
public class Main {
    public static void main(String[] args) {
        DeluxePizza dp = new DeluxePizza(true);
        dp.addTakeaway();
        dp.addExtraCheese(); // No extra charge, as Deluxe includes cheese.
        System.out.println(dp.getBill());

        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        System.out.println(p.getBill());
    }
}
Sample Bill Output
yaml

Base Price Of The Pizza: 300
Extra Cheese Added: 80
Extra Toppings Added: 70
Paper bag Added: 20
Total Price: 470
Setup and Compilation
Clone the repository.
Compile the Java files using javac Main.java Pizza.java DeluxePizza.java.
Run java Main to see sample bill generation.
License
This project is licensed under the MIT License.
