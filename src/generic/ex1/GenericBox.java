package generic.ex1;

// 제네릭 타입 (Generic Type)
// - 제네릭 클래스, 제네릭 인터페이스를 뜻함
public class GenericBox<T> {
// T : 타입 매개변수, 실제 타입으로 대체됨
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
