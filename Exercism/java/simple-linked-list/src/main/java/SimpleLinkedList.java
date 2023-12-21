import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SimpleLinkedList<T> {

    private Node node;
    SimpleLinkedList() {
    }
    SimpleLinkedList(T[] values) {
        for (var value: values)
            push(value);
    }

    void push(T value) {
        node = new Node(value, node);
    }

    T pop() {
        if (node == null)
            throw new NoSuchElementException("List is already empty");

        var value = node.getValue();
        node = node.next();
        return value;
    }

    void reverse() {
        var values = new ArrayList<T>();
        while (node != null) {
            values.add(pop());
        }

        for (var value: values) {
            push(value);
        }
    }

    T[] asArray(Class<T> clazz) {
        if (node == null)
            return (T[]) Array.newInstance(clazz, 0);

        var array = (T[]) Array.newInstance(clazz, size());
        var index = 0;
        var current = node;
        array[index++] = current.getValue();
        while (current.hasNext()) {
            current = current.next();
            array[index++] = current.getValue();
        }

        return array;
    }
    int size() {
        if (node == null)
            return 0;
        var current = node;
        var counter = 1;
        while (current.hasNext()) {
            current = current.next();
            counter++;
        }
        return counter;
    }





    private class Node {

        private final T value;
        private final Node nextNode;

        public Node(T value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        public boolean hasNext() {
            return nextNode != null;
        }

        public Node next() {
            return nextNode;
        }

        public T getValue() {
            return value;
        }

    }

}