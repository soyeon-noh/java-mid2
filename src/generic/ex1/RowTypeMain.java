package generic.ex1;

// row type (원시 타입)
// - 제네릭이 없던 시절 코드랑 호환이 필요하기 때문에 생겨남
public class RowTypeMain {
    public static void main(String[] args) {
        // 제네릭 타입을 지정하지 않는 경우 row type(= 원시타입) 으로 지정됨
        // 원시 타입을 사용하면 내부의 타입 매개변수가 Object로 사용된다.
        GenericBox integerBox = new GenericBox();
//        GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

    }
}
