public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals

    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode

    @Override
    public int length() {
        return 0;


    }

    @Override
    public int sum() {
        return 0;


    }

    @Override
    public ImmutableList append(ImmutableList other) {
        return other;


    }

    @Override
    public boolean contains(int value) {
        return false;

    }
} // Nil
