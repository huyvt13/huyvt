/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

/**
 *
 * @author To Hoang Anh
 */
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

import java.util.StringTokenizer;

import validate.CheckInput;

public class Counter {

    private final Map<Character, Integer> charCounter = new HashMap<>(); //dinh dang hashmap dem ky tu,Map la mot tap du lieu duoc duoi dang key-value
    private final Map<String, Integer> wordCounter = new HashMap<>();// dinh dang hashmap dem tu

    /**
     * Enter the required string to count
     *
     * @return
     */
    public static String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = scanner.nextLine();
        //check string satisfy the requirements is number will be repeat until enter string
        while (CheckInput.isNumber(content)) {
            System.out.println("Enter your content: ");
            content = scanner.nextLine();
        }
        return content;
    }

    /**
     * this is function display results
     */
    public void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }

    /**
     *
     * @param content (String) this is function count quantity dublicate of
     * character and word
     */
    public void counter(String content) {
        for (char ch : content.toCharArray()) {//tach chuoi thanh tung mang ky tu(content)
            //if character is space will be next
            if (Character.isSpaceChar(ch)) {
                continue;
            }
            //if character has not appeared yet in map 
            if (!charCounter.containsKey(ch)) {
                //set this character have value = 1
                charCounter.put(ch, 1);
                //if character has appeared yet in map 
            } else {
                //get quantity of this character and increase one unit
                charCounter.put(ch, (charCounter.get(ch)) + 1);
            }
        }
        //Default will be split by character is space
        StringTokenizer tokenizer = new StringTokenizer(content,".,");//co the them ".," (String tokenzier : luu dinh dang giong nhu mang , kiem tra phan tu co mang hay ko)
        //check until not exist string next
        while (tokenizer.hasMoreTokens()) {
            //next token(String)
            String token = tokenizer.nextToken();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
    }
}
