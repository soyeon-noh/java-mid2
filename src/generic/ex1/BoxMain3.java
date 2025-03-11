package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        // 생성 시점에 T의 타입이 결정됨
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
//        integerBox.set("100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환(' 캐스팅 필요 x)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능 (기본형x, 객체 참조형만)
        GenericBox<Double> doubleBox = new GenericBox<Double>();

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }
}
