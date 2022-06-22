public interface BagInterface<MyType> {

    // start

    // Gets the current number of entries in this bag
    // @return The integer number of entries currently in the bag
    public int getCurrentSize();

    // Checks if the bag is empty
    // @return True if the bag is empty
    // @return False if the bag is not empty
    public boolean isEmpty();

    // Adds a new entry to the bag
    // @param newEntry The object to be added as a new entry.
    // @return True if the addition is successful
    // @return False if not
    public boolean add(MyType newEntry);

    // Removes on unspecified entry from this bag, if possible
    // @return Either the removed entry if successful
    // @return Null if unsuccessful
    public MyType remove();

    // Removes one occurrence of a given entry from this bag if possible
    // @param anEntry The entry to be removed
    // @return True if the remove was successful
    // @return False if not successful
    public boolean remove(MyType anEntry);

    // Removes all entries from the bag
    public void clear();

    // Counts the number of times a given entry appears in the bag
    // @param anEntry The entry to be counted
    // @return The frequency of anEntry within the bag
    public int getFrequencyOf(MyType anEntry);

    // Checks if bag contains a given entry
    // @param anEntry The entry checked for
    // @return True if the bag contains the entry
    // @return False if not
    public boolean contains(MyType anEntry);

    // Retrieves all entries that are in the bag
    // @return A newly created array full of the entries within the bag
    // If the bag is empty, an empty array will be returned
    public MyType[] toArray();

    // end





}
