class Data {
    public int value;
}

public class PassByValueMain {
    static void changePrimitive(int x) {
        x = 100;
    }

    static void changeObject(Data d) {
        d.value = 100;
    }

    public static void main(String[] args) {
        int num = 10;
        changePrimitive(num);
        System.out.println("Primitive value : " + num);

        Data obj = new Data();
        obj.value = 10;
        changeObject(obj);
        System.out.println("Object value : " + obj.value);
    }
}
