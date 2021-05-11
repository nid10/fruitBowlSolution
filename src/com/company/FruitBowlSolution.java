package com.company;

import java.util.ArrayList;

public class FruitBowlSolution {
    public static void main(String[] args) {

        String[] mixFruitArray = {"apple", "orange", "apple", "orange", "banana"};
        Bowl mixFruit = new Bowl(mixFruitArray);

        String[] orangeArray ={"orange","orange","orange","orange"};
        Bowl orange = new Bowl(orangeArray);

        String[] appleArray ={"apple","apple","apple","apple"};
        Bowl apple = new Bowl(appleArray);

        String[] bananaArray ={"banana","banana"};
        Bowl banana = new Bowl(bananaArray);

        mixFruit.display();
        ArrayList<String> removedFruitList = mixFruit.removeFruit("orange");
        mixFruit.display();
        orange.display();
        orange.addFruit(removedFruitList);
        orange.display();






    }
}
