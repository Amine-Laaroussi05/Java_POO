package SimpleTest_MaptoList_Class;

import java.util.*;

public class ArrayTest {
    private Map<Integer, String> arrayMap = new Hashtable<>();


    public List<String> getArrayMap() {
        List<String> arrayList = new ArrayList<>(this.arrayMap.values());
        return arrayList;
    }

    public void setArrayMap(List<String> arrayList) {
        Collections.reverse(arrayList);
        for (int index = 0; index < arrayList.size(); index++) {
            this.arrayMap.put(index, arrayList.get(index));
        }
    }


    public void afficher() {
        System.out.println(this.getArrayMap());
    }
}
