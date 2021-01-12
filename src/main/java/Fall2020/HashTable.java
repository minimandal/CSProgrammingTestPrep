package Fall2020;

/**
 * (4 pts) A Hash Table stores a finite set of values of a given type in an array. It
 * uses a hash function that takes a value of the given type as an argument and
 * computes from it a position in the array. The problem is that multiple values
 * may have the same hash value, but only one can be stored at a given position.
 * One solution is linear probing. When trying to insert a value x, if another
 * value is already in the position computed by the hash function (say position p),
 * then x is placed at position p+1, unless that location is already full, in which
 * case position p+2 is checked. This process continues until an empty position is
 * found (and if the end of the table is reached, it goes back to position 0).
 * When trying to determine if a value x is already in the Hash Table (the find
 * operation), you must also use linear probing if a value not equal to x is found in
 * the position computed by the hash function.
 * The following simple HashTable class stores a set of non-negative integers. The
 * hash function is given, and the capacity can be anything less than or equal to
 * 10000 (the capacity represents the maximum number of elements the table can
 * contain). For simplicity, you may assume the hash table is never full.
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
}
