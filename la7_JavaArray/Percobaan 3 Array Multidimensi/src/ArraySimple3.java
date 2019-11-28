/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class ArraySimple3 {
    public static void main(String[] args){
        
// Element 512 x 128 dari integer array
    int[][] twoD = new int[512][128];
        
// karakter array 8 x 16 x24
    char[][][] threeD = new char[8][16][24];

//String array 4 baris x 2 kolom
    String[][] dogs = {{"Terry", "brown"}, {"Kristin", "white"},
        {"toby", "gray"}, {"fido", "black"}
    };
    System.out.println(dogs[0][0]);
    }
}
