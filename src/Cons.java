import java.util.Objects;

public class Cons implements ImmutableList {

    public final int head;
    public final ImmutableList tail;

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    }


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
        return 1 + tail.length();
    }

    @Override
    public int sum() {
        return head + tail.sum();
    }

    @Override
    public ImmutableList append(ImmutableList other) {
        return new Cons(head, tail.append(other));
    }

    @Override
    public boolean contains(int value) {
        return head == value || tail.contains(value);
    }

    @Override
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    }
}