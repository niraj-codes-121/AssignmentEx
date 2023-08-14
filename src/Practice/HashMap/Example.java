package Practice.HashMap;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<String, String> names= new HashMap<String, String>();
        names.put("ram", "hari");
        names.put("janak", "ami");
        //System.out.println(names);
        System.out.println(names.get("ram"));
    }
}
