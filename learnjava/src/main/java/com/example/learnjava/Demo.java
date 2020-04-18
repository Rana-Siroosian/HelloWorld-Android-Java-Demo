package com.example.learnjava;

public class Demo {

    public static void main(String[] args) {

        Player rana = new Player();
        System.out.println(rana.getHandleName());
        rana.setNameAndLevel("Parisa", 10);
        System.out.println(rana.getHandleName());
        System.out.println(rana.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        rana.setWeapon(myAxe);
//        System.out.println(rana.getWeapon().getName());
        Weapon ranasWeapon = rana.getWeapon();
        System.out.println(ranasWeapon.getName().toUpperCase());
//        Player sam = new Player("Sam");
//        System.out.println(sam.getHandleName());
//        sam.setLives(5);
//        System.out.println("leve: " + sam.getLevel());
//        System.out.println("lives: "+ sam.getLives());
//
//        Player mike = new Player("mike",9);
//        System.out.println(mike.getHandleName() + " level is " + mike.getLevel());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        rana.pickUpLoot(redPotion);
        rana.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR,80));
        rana.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING,40));
        rana.pickUpLoot(new Loot("invisibility Potion", LootType.POTION,35));
        rana.showInventory();


    }
}
