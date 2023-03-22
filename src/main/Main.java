/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import process.Counter;
import static process.Counter.input;

/**
 *
 * @author To Hoang Anh
 */
public class Main {

    public static void main(String[] args) {
        //this is function to input
        String content = input();
        Counter counter = new Counter();
        //count dublicate
        counter.counter(content);
        //this is function display
        counter.display();
    }
}
