package com.braindevoiler.designpattern.structural.composite;

public class CompositeTest {
    /*
     * The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies.
     * Composite lets clients treat individual objects and composition of objects uniformly.
     *
     * Using a composite structure, we can apply the same operations over both composites and individual objects.
     */
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
