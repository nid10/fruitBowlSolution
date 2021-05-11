package com.company;

import java.util.ArrayList;

public class Bowl {

    ArrayList<String> fruitList = new ArrayList<>();
    public Bowl(String[] fruitArray){
        for(String fruit : fruitArray) {
            fruitList.add(fruit);
        }
    }
    public void display(){
        System.out.println(fruitList);
    }
    public ArrayList<String> removeFruit(String fruitName){
        ArrayList<String> removedFruitNameList = new ArrayList<>();
        while(fruitList.remove(fruitName)){
            removedFruitNameList.add(fruitName);
        }
        return removedFruitNameList;
    }
    public void addFruit(ArrayList<String> removedFruitList){
        for (String fruit : removedFruitList){
            fruitList.add(fruit);
        }
    }
}
