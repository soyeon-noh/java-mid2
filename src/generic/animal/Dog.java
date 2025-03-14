package generic.animal;

// Animal 을 상속 받음
// - 부모 클래스에 정의된 생성자가 있기 때문에
//   맞추어 super(name, size)를 호출한다
public class Dog extends Animal {

    public Dog(String name, int size) {
        super(name, size);
    }


    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
