package week03_2;

public interface OrdMethods{
    /**
     * clear all data
     */
    void clear();

    /**
     *
     * @return first element
     */
    double getFirst();

    /**
     *
     * @return last element
     */
    double getLast();

    /**
     *
     * @param searchKey elemnt search for
     * @return -1 if no such element, 0 if found
     */
    int find(double searchKey);

    /**
     *
     * @param value element to insert
     */
    void insert(double value);

    /**
     *
     * @param value value to delete
     * @return true if succeed false otherwise
     */
    boolean delete(double value);

    /**
     *
     * @return min key
     */
    double findMin();

    /**
     *
     * @return max key
     */
    double findMax();

    /**
     *
     * @param k key to find his next key if exist
     * @return the stored item with the smallest key larger than k
     */
    double findNext(double k);

    /**
     *
     * @param k key to find his previous key if exist
     * @return the stored item with the largest key smaller than k
     */
    double findPrev(double k);

    /**
     * display data in console
     */
    void display();
}
