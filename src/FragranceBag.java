public class FragranceBag<MyType> implements BagInterface<MyType> {

    MyType[] myBag;
    int numberOfProducts;
    static final int DEFAULT_CAPACITY = 25;

    // Core Methods start

    // Task: Creates an empty bag having a given capacity.
    // @param capacity Indicates the size of the constructed array
    public FragranceBag(int capacity) {
        numberOfProducts = 0;

        // safe cast because new array contains null entries
        @SuppressWarnings("unchecked")
        MyType[] tempBag = (MyType[]) new Object[capacity];
        myBag = tempBag;
    } // end parameterized constructor

    // Task: Creates an empty bag whose capacity is 25.
    public FragranceBag() {
        this(DEFAULT_CAPACITY);
    } // end default constructor

    private boolean isFull() {
        return numberOfProducts == myBag.length;
    } // end isFull

    @Override
    public boolean isEmpty() {
        return false;
    } // end isEmpty

    // returns true if array not full && @param newEntry was added
    // else return false
    @Override
    public boolean add(MyType newEntry) {
        boolean result = true;
        if (isFull()) {
            result = false;
        }
        else { // assertion: result is true here
            myBag[numberOfProducts] = newEntry;
            numberOfProducts++;
        } // end if
        return result;
    } // end add

    @Override
    public MyType[] toArray() {
        @SuppressWarnings("unchecked")
        MyType[] result = (MyType[]) new Object[DEFAULT_CAPACITY]; // unchecked

        for (int i = 0; i < numberOfProducts; i++) {
            result[i] = myBag[i];
        } // end for

        return result;
    }

    // Core Methods end

    // Returns integer representing number of items in bag
    @Override
    public int getCurrentSize() {
        return numberOfProducts;
    } // end getCurrentSize

    // Removes then returns an item if array is not empty
    @Override
    public MyType remove() {
        MyType result = null;
        if (!isEmpty()) {
            result = myBag[numberOfProducts - 1];
            myBag[numberOfProducts - 1] = null;
            numberOfProducts++;
        } // end if
        return result;
    } // end remove

    @Override
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    }


    @Override
    public boolean remove(MyType anEntry) {
        boolean wasFound = false;
        int i = 0;
        while (!wasFound && (i < numberOfProducts)) {
            if (anEntry.equals(myBag[i])) {
                wasFound = true;
                myBag[i] = myBag[numberOfProducts - 1];
                myBag[numberOfProducts - 1] = null;
                numberOfProducts--;
            }
            else {
                i++;
            } // end if
        } // end while
        return wasFound;
    }

    @Override
    public int getFrequencyOf(MyType anEntry) {
        int counter = 0;
        for (int i = 0; i < numberOfProducts; i++) {
            if (anEntry.equals(myBag[i])) {
                counter++;
            } // end if
        } // end for
        return counter;
    } // end getFrequencyOf

    @Override
    public boolean contains(MyType anEntry) {
        for (int i = 0; i < numberOfProducts; i++) {
            if (anEntry.equals(myBag[i])) {
                return true;
            } // end if
        } // end for
        return false;
    }

//    book solution
//    @Override
//    public boolean contains(MyType anEntry) {
//        boolean wasFound = false;
//        int index = 0;
//        while (!wasFound && (index < numberOfProducts)) {
//            if (anEntry.equals(myBag[index])) {
//                wasFound = true;
//            }
//            else {
//                index++;
//            } // end if
//        } // end while
//        return wasFound;
//    } // end contains


}
