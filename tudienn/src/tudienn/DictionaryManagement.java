/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudienn;

import java.util.Scanner;
/**
 *
 * @author thinhnguyen
 */
public class DictionaryManagement extends Dictionary{
    private int size ;
    
    
    
    Scanner input = new Scanner(System.in);
    
    public void insertFromCommandline(){
        System.out.println("Nhap vao so luong tu! ");
        size = input.nextInt();
        String temp;
        for(int i=0; i<size; i++){
            temp = input.nextLine();
            dictionary[i].setWord_target(temp);
            temp = input.nextLine();
            dictionary[i].setWord_explain(temp);
        }
    }
    public static void main(String[] args) {
        DictionaryManagement a = new DictionaryManagement();
        a.insertFromCommandline();
        
    }
}
