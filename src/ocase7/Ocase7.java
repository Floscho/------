/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocase7;

import java.util.ArrayList;

/**
 *
 * @author PaulsBook
 */
public class Ocase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(Test.getById(3));
//        Test.delete(3);
//        
//        // Update 
//        // Holt sich ein Objekt anhand der ID aus der DB
//        Test t = Test.getById(1);
//        // bearbeitet den Text des Objektes 
//        t.setText("Super Tach :(");
//        // schreibt das veränderte Objekt wieder in die DB
//        Test.update(t);

        // liest alle Kategorien aus 
        ArrayList<Category> c = Category.getAll();
        for (Category category : c) {
            System.out.println(category);
        }

        // liest alle Fragen aus der Datenbank aus 
        for (int i = 0; i < c.size(); i++) {
            ArrayList<Question> questions = Question.getQuestionsByCategory(c.get(i));
            for (Question question : questions) {
                System.out.println(question);
            }    
        }
        
        
        
        MySQLConnection.closeConnection();
        
          
    }
    
}
