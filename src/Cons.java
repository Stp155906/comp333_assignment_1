import java.util.Objects;

public class Cons implements ImmutableList {

    public final int head;
    public final ImmutableList tail;

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    }

    // ... Other methods ...
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cons cons = (Cons) obj;
        return head == cons.head && tail.equals(cons.tail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, tail);
    }

    @Override
    public int length() {
        return 1 + tail.length();  // Length is 1 (current node) + length of the tail.
    }

    @Override
    public int sum() {
        return head + tail.sum();  // Sum is value of the current node + sum of the tail.
    }

    @Override
    public ImmutableList append(ImmutableList other) {
        return new Cons(head, tail.append(other));  // Append other list to the tail and create a new Cons.
    }

    @Override
    public boolean contains(int value) {
        return head == value || tail.contains(value);  // Current value matches OR tail contains the value.
    }

    @Override
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";  // Representing Cons as a string.
    }
}
