public class FragranceBag<MyType> implements BagInterface<MyType> {

    MyType[] myBag;
    int numberOfProducts;
    static final int DEFAULT_CAPACITY = 25;

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

    // Returns integer representing number of items in bag
    @Override
    public int getCurrentSize() {
        return 0;
    }

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
    public MyType remove() {
        return null;
    }

    @Override
    public boolean remove(Object anEntry) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public MyType[] toArray() {
        @SuppressWarnings("unchecked")
        MyType[] result = (MyType[]) new Object[DEFAULT_CAPACITY]; // unchecked

        for (int i = 0; i < numberOfProducts; i++) {
            result[i] = myBag[i];
        } // end for

        return result;
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        return 0;
    }

    @Override
    public boolean contains(Object anEntry) {
        return false;
    }
}
