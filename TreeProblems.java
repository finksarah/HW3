/*
 * *** Sarah Fink - Section 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */

    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

        // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
        //
        Set<Integer> temp1 = new TreeSet<>(setA); // temp for setA
        Set<Integer> temp2 = new TreeSet<>(setB); // temp for setB

        temp1.retainAll(setB); // temp1 has all the common elements in setA and setB


        temp2.addAll(setA); // temp2 has all the elements in both setA and setB


        temp2.removeAll(temp1); // temp2 now has all the elements that are not the same in setA and setB

        return temp2;
    }


    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {

        Iterator<Integer> iterator = treeMap.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (key % 2 == 0) { // check if the key is even
                iterator.remove(); // remove the even key
            }
        }
        return;
    }


    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

        Iterator<Integer> iterator = tree1.keySet().iterator();
        Iterator<Integer> iterator2 = tree2.keySet().iterator();

        while (iterator.hasNext()) {
            while (iterator2.hasNext()) {
                Integer key = iterator.next();
                Integer keyNext = iterator2.next();
                if (key != keyNext) { // check if the current key is not equal to the next
                    return false; // return false because the trees aren't equal
                }
            }
        }
        return true; // returns true because all the elements were equal therefore it made it out of the loop
    }

} // end treeProblems class
