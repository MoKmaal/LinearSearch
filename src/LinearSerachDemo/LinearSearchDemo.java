/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSerachDemo;

import linearsearch.LinearSearch;

/**
 *
 * @author mohammed
 */
public class LinearSearchDemo {

    public static void main(String[] args) {
        int array[] = {1, 53, 45, 13, 36, 9, 25, 63, 4, 0};
        int value = 9;
        LinearSearch linearSearch = new LinearSearch(array, value);
        System.out.println(linearSearch.getSearchIndex());
        System.out.println("Number of tries= " + linearSearch.getNumberOfTries());
    }

}
