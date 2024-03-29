package Map;

public class Main {
    public static void main(String[] args) {
        MyMap map = new MyMap();
        map.put(1,"hallow");
        map.put("jejemon", "Kath");
        map.put("Cutie Chaz", true);
        System.out.println(map.get(1));
        System.out.println(map.get("jejemon"));
        map.put("jejemon","Joyce");
        System.out.println(map.get("jejemon"));
        map.remove(1);
        System.out.println(map.get(1));
        System.out.println(map.get("Cutie Chaz"));
    }
}
