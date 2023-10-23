/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zls.daystillfriday;

import java.util.Scanner;

/**
 *
 * @author zshug
 */
public class App {
    
    enum Days {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        
        while(keepGoing){
            System.out.println("Please enter a day of the week:");
            String dayInput = sc.nextLine();
            String capitalDay = dayInput.toUpperCase();
            if(capitalDay.equals("MONDAY") ||
                    capitalDay.equals("TUESDAY") ||
                    capitalDay.equals("WEDNESDAY") ||
                    capitalDay.equals("THURSDAY") ||
                    capitalDay.equals("FRIDAY") ||
                    capitalDay.equals("SATURDAY") ||
                    capitalDay.equals("SUNDAY")){
                
                Days day = Days.valueOf(capitalDay);

                switch(day){
                    case MONDAY:
                        System.out.println("There are 4 days until Friday!");
                        keepGoing = false;
                        break;
                    case TUESDAY:
                        System.out.println("There are 3 days until Friday");
                        keepGoing = false;
                        break;
                    case WEDNESDAY:
                        System.out.println("There are 2 days until Friday");
                        keepGoing = false;
                        break;
                    case THURSDAY:
                        System.out.println("There is 1 day until Friday");
                        keepGoing = false;
                        break;
                    case FRIDAY:
                        System.out.println("It's Friday!!!!");
                        keepGoing = false;
                        break;
                    case SATURDAY:
                        System.out.println("It's the weekend! There are 6 days until Friday");
                        keepGoing = false;
                        break;
                    case SUNDAY:
                        System.out.println("It's the weekend! There are 5 days until Friday");
                        keepGoing = false;
                        break;
                    default:
                        System.out.println("Please enter a valid day of the week.");
                }      
            } else{
                keepGoing = true;
                System.out.println("*****Please enter a valid day of the week*****");
            }  
        }       
    }    
}
