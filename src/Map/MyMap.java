package Map;

import java.util.ArrayList;

public class MyMap {
    private ArrayList[] Map;
    private ArrayList <Object> Keys;
    private ArrayList <Object> Values;
    private int size;
    public MyMap(){
        Map = new ArrayList[2];
        Map[0] = Keys;
        Map[1] = Values;
        Keys = new ArrayList<>();
        Values = new ArrayList<>();
        size = 0;
    }

    public void put(Object key, Object value){
        if(Keys.contains(key)){
         int index = Keys.indexOf(key);
         Values.set(index,value);
        }else {
            Keys.add(size, key);
            Values.add(size, value);
            size++;
        }
    }
    public Object get(Object key){
        if(Keys.contains(key)) {
            int index = Keys.indexOf(key);
            return Values.get(index);
        }
        return null;
    }
    public Object remove(Object key){
        if(Keys.contains(key)){
            int index = Keys.indexOf(key);
            Object temp = Values.get(index);
            Keys.remove(index);
            Values.remove(index);
            size--;
            return temp;
        }
        return null;
    }
}
