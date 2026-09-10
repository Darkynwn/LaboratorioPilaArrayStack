public class ArrayStack implements StackInterface {

    int size;
    Object[] array;
    int top;

    public ArrayStack(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
        this.top = -1;
    }

    @Override
    public boolean push(Object object) {
        if (size == array.length) {
            return false;
        }
        top++;
        array[top] = object;
        size++;
        return true;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object poppedElement = array[top];
        array[top] = null;
        top--;
        size--;
        return poppedElement;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return array[top];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= top; i++) {
            array[i] = null;
        }
        top = -1;
        size = 0;
    }

    @Override
    public boolean search(Object object) {
        for (int i = 0; i <= top; i++) {
            if (array[i] != null && array[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(array[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}