package ch14_inheritance.ex01;

public class InheritanceMain {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.setName("이름1");
        parentClass.setAge(10);
        System.out.println("parentClass = " + parentClass);
        parentClass.hello();

        ChildClass childClass = new ChildClass();
        childClass.setName("자식이름1");
        childClass.setAge(100);
        System.out.println("childClass = " + childClass);
        childClass.hello();

        System.out.println("============");
        // 좌변: 부모타입의 객체, 우변: 자식클래스 tod성자
        ParentClass parentClass1 = new ChildClass();
        parentClass1.hello();;
        parentClass1 = new ParentClass();
        parentClass1.hello();;

        // 좌변: 자식타입의 객체, 우변: 부모클래스 생성자
//        ChildClass childClass1 = (ChildClass) new ParentClass();
        // 부모가 더 크기에 작은 자식에게 들어갈 수 없다. 하려면 형변환
    }
}
