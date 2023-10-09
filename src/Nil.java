public class Nil implements ImmutableList {

    public Nil() {}

    // ... Other methods ...

    @Override
    public int length() {
        return 0;  // Nil has length 0.
    }

    @Override
    public int sum() {
        return 0;  // Nil has a sum of 0.
    }

    @Override
    public ImmutableList append(ImmutableList other) {
        return other;  // Appending any list to Nil gives the other list.
    }

    @Override
    public boolean contains(int value) {
        return false;  // Nil doesn't contain any value.
    }

    @Override
    public String toString() {
        return "Nil";  // Representing Nil as a string.
    }
}
