import static java.lang.Math.*;

/**
 * instance of Lucas number
 */
public class LucasNumber {
    /**
     * id of current sequence element
     */
    private int id;
    /**
     * value of the element
     */
    private int value;

    /**
     * default explicit constructor
     */
    public LucasNumber() {}

    /**
     *constructor with parameters
     * @param id id of Lucas number
     * @param sequence reference to a sequence of Lucas numbers
     */
    public LucasNumber(int id, LucasNumber [] sequence) {
        if(id<0 || sequence==null) {
            throw new IllegalArgumentException();
        }
        //specific values for first 2 elements of the sequence
        if(id==0)   value=2;
        else if (id==1) value=1;
        else{//Lucas number = sum of 2 previous ones
            value=sequence[id-1].value+sequence[id-2].value;
        }
        this.id=id;
    }

    /**getter
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * getter
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * checking personal task condition: w^2+1==any of first N Lucas numbers
     * @return true if there is such a number, else false
     */
    public boolean doesMeetCondition(){
        /**
         * squared value rounded down
         */
        int w=(int)floor(sqrt(value));

        if(value==1 || pow(w,2)+1==value)
            return true;
        else
            return false;
    }
}
