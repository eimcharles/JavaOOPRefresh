package polymorphism.interfaces.implementationExample2.orderedInterface;

public interface Ordered {

    /**
     *      Defines a contract for
     *      objects that can be logically
     *      ordered or sequenced relative to other
     *      objects of the same class.
     */

    /**
     * Determines if this object logically comes before the specified object (object).
     *
     * @param object The object to compare against.
     * @return true if this object precedes O; false otherwise.
     */
    boolean precede(Object object);

    /**
     * Determines if this object logically comes after the specified object (object).
     *
     * @param object The object to compare against.
     * @return true if this object succeeds O; false otherwise.
     */
    boolean succeed(Object object);

}
