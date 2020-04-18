package com.example.learnjava;
/**
 *
 * @author >>RanaSiroosian<<
 */
public class HelloWorld {
    public static void main(String[] args) {

        int lives = 0;
        boolean isGameOver = (lives<1);
        if(isGameOver){
            System.out.println("Game Over!");
        }
        else{
            System.out.println("You're still alive!");
        }
    }
}
