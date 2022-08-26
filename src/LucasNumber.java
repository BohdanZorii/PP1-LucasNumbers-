import static java.lang.Math.pow;

public class LucasNumber {
    private int id;//id of current sequence element
    private int value;//value of the element

    public LucasNumber() {}//default explicit constructor

    public LucasNumber(int id, LucasNumber [] sequence) {//constructor with parameters
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

    //getters
    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    //checking personal task condition: w^2+1==any of first N Lucas numbers
    public boolean doesMeetCondition(){
        int w=0;
        while ((pow(w,2)+1)<=value){
            if((pow(w,2)+1)==value){
                return true;
            }
            w++;
        }
        return false;
    }
}
