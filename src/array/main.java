/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import arrays.arrays;

/**
 *
 * @author PC
 */
public class main {

    public static void main(String[] args) {
     arrays arr=new arrays();
     int []numbers={1,7,9,8,5};
     numbers[3]=15;
     arr.update(numbers, 3, 15);
     arr.delete(numbers, 4);
     int []numbers2=new int[5];
     arr.input(numbers2);
     arr.R_Traversal(numbers);
     arr.Traversal(numbers);
     
    }

}
