import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
//phuong thuc ensureCapa giup tang kich thuoc cua mang
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
//phuong thuc add - them phan tu vao danh sach
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
// get - tra ve vi tri thu i trong danh sach
    public E get(int i) {
        if (i >= size || i < 0) {
            System.out.println("index : " + i);
        }
        return (E) elements[i];
    }
}
