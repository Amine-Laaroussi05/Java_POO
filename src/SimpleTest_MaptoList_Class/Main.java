package SimpleTest_MaptoList_Class;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayTest testList = new ArrayTest();
        int numero = scanner.nextInt();
        String message = scanner.next();
        List<String> addElement = new ArrayList<>();
        addElement.add(message);
        testList.setArrayMap(addElement);
        testList.afficher();
        message = scanner.next();
        addElement.add(message);
        System.out.print("[");
        for(int index=0; index< addElement.size(); index++){
            System.out.print("," + addElement.get(index));
        }
        System.out.println("]");
        testList.setArrayMap(addElement);
        testList.afficher();
        addElement = testList.getArrayMap();
        System.out.println(addElement);


    }
}
