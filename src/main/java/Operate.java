public interface Operate {
    // this method has only one method get result which is accepting a variable argument array or array of numbers.
    // ... is an web arg expression this means that the numbers will be an array of an arbitrary length(it means it can be 1 or 2 or 3 element array) but it's still going to be a fixed length array but the length is going to depend on how much argument you supply to this particular method
    Double getResult(Double... numbers);
}
