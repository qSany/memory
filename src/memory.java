public class memory {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
        System.out.println("-----------------");
        Integer value2 = 33;
        changeValue(value2);
        System.out.println(value2);
        System.out.println("-----------------");
        Integer[] array = new Integer[]{3, 4};
        changeValue(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------");
        changeArrayValue(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------");
        Person p = new Person("Lypis" , "Trubetskoy");
        p.changePerson(p);
        System.out.println(p);
        System.out.println("-----------------");
        p.changePerson2(p);
        System.out.println(p);
        System.out.println("-----------------");
    }

    private static void changeValue(int value) {
        value = 22;
    }

    private static void changeValue(Integer value) {
        value = 22;
    }

    private static void changeValue(Integer[] arr) {
        arr = new Integer[]{1, 2};
    }

    private static void changeArrayValue(Integer[] arr) {
        arr[0] = 99;
    }
}

