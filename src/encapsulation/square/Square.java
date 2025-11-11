package encapsulation.square;

public class Square {

    int length;

    /**
     *      Encapsulation: bundling the object's state and
     *      behaviour into one single unit the area().
     * */

    int area (){
        return this.length * this.length;
    }
}
