class Outer {
    public void showOuter() {
        System.out.println("Outer class methods");
    }

    class Inner {
        public void showInner() {
            System.out.println("Inner class methods");
        }
    }
}

public class NestedMain {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showOuter();
        Outer.Inner inner = outer.new Inner();
        inner.showInner();
    }
}
