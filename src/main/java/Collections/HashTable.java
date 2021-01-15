package Collections;

import util.Print;

/**
 * Implement the three public functions:
 * • a 1-argument constructor that creates an empty HashTable, given a capacity.
 * All values in the table should be set to -1 to indicate that they are empty.
 * • insert(x) to put integer x in the table. Use the hash function and linear
 * probing to find its proper position. Do not add an element that is already in
 * the HashTable.
 * • find(x) to return true if x has been inserted into the table, false otherwise.
 * Use the hash function and linear probing to determine the result.
 */
public class HashTable {
    private int array[];
    private int capacity;

    private int hash (int key) {
        return key % capacity;
    }

    /**
     * a 1-argument constructor that creates an empty HashTable, given a capacity.
     *  * All values in the table should be set to -1 to indicate that they are empty.
     * @param c
     */
    public HashTable (int c) {
        array = new int[c];
        capacity = c;
        for(int i = 0; i < capacity; i++) {
            array[i] = -1;
        }
    }

    public void insert (int x) {
        int temp = hash(x);
        int i = temp;
        do {
            if(array[i] == -1) {
                array[i] = x;
                return;
            }
            i = (i + 1) % capacity;
        } while(i != temp);
    }

    public static void main(String[] args) {
        Collections.HashTable table = new Collections.HashTable(10);
        table.insert(3);
        table.insert(4);
        table.insert(5);
        table.insert(6);
        table.insert(6);
        table.insert(6);
        table.insert(6);
        table.insert(0);
        Print.printArray(table.array, 0);
    }
    public boolean find(int x) {

        int tempHash = hash(x);
        while(array[tempHash] != -1) {
            if(array[tempHash] == x) {
                return true;
            }
            tempHash = (tempHash + 1) % capacity;
        }
        return false;
    }
};