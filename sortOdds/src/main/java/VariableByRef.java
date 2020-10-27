public class VariableByRef<T> {
    private T value;

    public VariableByRef(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
