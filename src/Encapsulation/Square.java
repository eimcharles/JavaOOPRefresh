package Encapsulation;

public class Square {

    int length;

    /**
     *      We are bundling the object's state and
     *      behaviour into one single unit the withdrawMoney()
     *      method.
     * */

    int area (){
        return this.length * this.length;
    }
}
