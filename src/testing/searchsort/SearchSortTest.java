
/** required package class namespace */
package testing.searchsort;

/** required imports */
import collections.LinkedList;
import testing.advancedclasses.Athlete;
import tools.Randomizer;
import tools.Searcher;
import tools.Sorter;


/**
 * SearchSortTest.java - tests the concepts learned in this unit
 *
 * @author Mr. Wachs 
 * @since 6-Feb-2019 
 */
public class SearchSortTest 
{

    /**
     * Default constructor for the class, sets class properties
     */
    public SearchSortTest() {
        // create seearching and sorting class objects
        Searcher searcher = new Searcher();
        Sorter   sorter   = new Sorter();
        // create list/array size
        final int SIZE = 6;
        // store seraching locations
        int location = -1;
        // create all arrays
        Boolean[]             array1 = new Boolean[SIZE];
        Integer[]             array2 = new Integer[SIZE];
        Double[]              array3 = new Double[SIZE];
        Character[]           array4 = new Character[SIZE];
        String[]              array5 = new String[SIZE];
        Athlete[]             array6 = new Athlete[SIZE];
        /// create all lists
        LinkedList<Boolean>   list1  = new LinkedList<>();
        LinkedList<Integer>   list2  = new LinkedList<>();
        LinkedList<Double>    list3  = new LinkedList<>();
        LinkedList<Character> list4  = new LinkedList<>();
        LinkedList<String>    list5  = new LinkedList<>();
        LinkedList<Athlete>   list6  = new LinkedList<>();
        // create all items to search for
        Boolean               item1  = null;
        Integer               item2  = null;
        Double                item3  = null;
        Character             item4  = null;
        String                item5  = null;
        Athlete               item6  = null;
        // create array for all search items
        Object[] allItems  = {item1,item2,item3,item4,item5,item6};
        // create array for all arrays
        Object[][] allArrays = {array1,array2,array3,array4,array5,array6};
        /// create list for all lists, and add all lists
        LinkedList<LinkedList> allLists = new LinkedList<>();
        allLists.add(list1);
        allLists.add(list2);
        allLists.add(list3);
        allLists.add(list4);
        allLists.add(list5);
        allLists.add(list6);
        
        // scramble arrays, lists, and search items
        scramble(allArrays, allLists, allItems, SIZE);
        
        // linear search arrays/lists
        for (int i = 0; i < allArrays.length; i++) {
            location = searcher.linearSearch(allArrays[i], allItems[i]);
            results("Linear Search",allArrays[i],allItems[i],location);
        }
        for (int i = 0; i < allLists.size(); i++) {
            location = searcher.linearSearch(allLists.get(i), allItems[i]);
            results("Linear Search",allLists.get(i),allItems[i],location);            
        }
        
        // bubble sort arrays/lists
        for (int i = 0; i < allArrays.length; i++) {
            allArrays[i] = sorter.bubbleSort(allArrays[i]);
            results("Bubble Sort",allArrays[i]);
        }        
        for (int i = 0; i < allLists.size(); i++) {
            allLists.set(i, sorter.bubbleSort(allLists.get(i)));
            results("Bubble Sort",allLists.get(i));          
        } 
        
        // binary search arrays/lists
        for (int i = 0; i < allArrays.length; i++) {
            location = searcher.binarySearch(allArrays[i],allItems[i]);
            results("Binary Search",allArrays[i],allItems[i],location);
        }        
        for (int i = 0; i < allLists.size(); i++) {
            location = searcher.binarySearch(allLists.get(i),allItems[i]);
            results("Binary Search",allLists.get(i),allItems[i],location);         
        }
        
        // linear search arrays/lists
        scramble(allArrays, allLists, allItems, SIZE);
        
    }
    
    /**
     * Scrambles all lists/arrays and search items to random values
     * 
     * @param allArrays the array of all other arrays
     * @param allLists the list of all other lists
     * @param allItems the array of all search items
     * @param SIZE the size to make all the arrays/lists
     */
    private void scramble(Object[][] allArrays, 
            LinkedList<LinkedList> allLists, Object[] allItems, 
            final int SIZE) {
        allArrays[0] = Randomizer.generateBooleans(SIZE);
        allArrays[1] = Randomizer.generateIntegers(SIZE);
        allArrays[2] = Randomizer.generateDoubles(SIZE);
        allArrays[3] = Randomizer.generateCharacters(SIZE);
        allArrays[4] = Randomizer.generateStrings(SIZE);
        allArrays[5] = Randomizer.generateAthletes(SIZE);     
        allLists.set(0, Randomizer.generateBooleansList(SIZE));
        allLists.set(1, Randomizer.generateIntegersList(SIZE));
        allLists.set(2, Randomizer.generateDoublesList(SIZE));
        allLists.set(3, Randomizer.generateCharactersList(SIZE));
        allLists.set(4, Randomizer.generateStringsList(SIZE));
        allLists.set(5, Randomizer.generateAthleteList(SIZE));        
        allItems[0] = Randomizer.generate();
        allItems[1] = Randomizer.generate(-SIZE, SIZE);
        allItems[2] = Randomizer.generate((double)-SIZE, (double)SIZE);
        allItems[3] = Randomizer.generate('a','z');
        allItems[4] = Randomizer.generate(5);
        allItems[5] = Randomizer.generateAthlete();        
        for (int i = 0; i < allArrays.length; i++) {
            results("Created",allArrays[i]); 
        }
        for (int i = 0; i < allLists.size(); i++) {
            results("Created",allLists.get(i));          
        }        
    }

    /**
     * Display the results of a search on an array for a item and its location
     * 
     * @param <T> the generic array type
     * @param type the search performed
     * @param array the generic array of items
     * @param item the item being searched for
     * @param location the location found (or not found)
     */
    private<T> void results(String type, T[] array, 
            T item, int location) {   
        String text = start(type, "Array", array[0]);
        text += "Item: " + item + " location = " + location + " -> ";        
        text += contents(array);
        System.out.println(text);
    }

    /**
     * Display the results of a search on a list for a item and its location
     * 
     * @param <T> the generic list type
     * @param type the search performed
     * @param list the generic list of items
     * @param item the item being searched for
     * @param location the location found (or not found)
     */
    private void results(String type, LinkedList list, 
            Object item, int location) {
        String text = start(type, "List", list.get(0));        
        text += "Item: " + item + " location = " + location + " -> ";          
        text += contents(list);
        System.out.println(text);
    }
    
    /**
     * Display the results of a sort on an array
     * 
     * @param <T> the generic array type
     * @param type the sort performed
     * @param array the generic array of items 
     */
    private<T> void results(String type, T[] array) {
        String text = start(type, "Array", array[0]);
        text += contents(array);
        System.out.println(text);
    }
    
    /**
     * Display the results of a sort on an list
     * 
     * @param <T> the generic list type
     * @param type the sort performed
     * @param list the generic list of items 
     */
    private void results(String type, LinkedList list) {
        String text = start(type, "List", list.get(0));
        text += contents(list);
        System.out.println(text);
    }

    /**
     * The formatted start of an output line for results
     * 
     * @param type1 the action type
     * @param type2 the list/array type
     * @param object the generic data type used 
     * @return the formatted text
     */
    private String start(String type1, String type2, Object object) {
        String classType = object.getClass().getSimpleName(); 
        String delimit = "\t";
        if (classType.length() < 8) delimit += "\t";
        String text = type1 + "\t" + type2 + "\t" + classType + delimit;
        return text;
    }
    
    /**
     * Creates a formatted line for the array
     * 
     * @param <T> the generic data type
     * @param array the array of items
     * @return the formatted line
     */
    private<T> String contents(T[] array) {
        String text = "[";
        for (int i = 0; i < array.length-1; i++) {
            text += array[i] + ",";
        }
        text += array[array.length-1] + "]";
        return text;
    }
    
    /**
     * Creates a formatted line for the list
     * 
     * @param <T> the generic data type
     * @param list the list of items
     * @return the formatted line
     */
    private<T> String contents(LinkedList list) {
        String text = "[";
        for (int i = 0; i < list.size()-1; i++) {
            text += list.get(i) + ",";
        }
        text += list.get(list.size()-1) + "]";
        return text;
    }
    
}
