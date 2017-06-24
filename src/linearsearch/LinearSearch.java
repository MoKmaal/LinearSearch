/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author mohammed
 */
public class LinearSearch {

    int triesNumber;
    int[] arrayNumbers;
    int searchValue;
    int index;

    public LinearSearch(int[] arrayNumbers, int searchValue) {
        this.triesNumber = triesNumber;
        this.arrayNumbers = arrayNumbers;
        this.searchValue = searchValue;
        index = -1;

    }

    public int getSearchIndex() {

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == searchValue) {
                System.out.println("Item Found");
                index = i;
                break;
            }
            triesNumber++;

        }
        if (index == -1) {
            System.err.println("Not found");
        }
        return index;
    }

    public int getNumberOfTries() {
        return triesNumber;
    }

}
