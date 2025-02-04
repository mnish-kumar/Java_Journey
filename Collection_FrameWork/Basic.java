package Collection_FrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Basic {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        // get
        int element = list.get(0);
        System.out.println(element);
        // add element between
        list.add(1,3);
        System.out.println(list);
        // set
        list.set(0,5);
        System.out.println(list);
        // remove
        list.remove(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        // indexOf
        list.indexOf(0);
        System.out.println(list);
        // size
        list.size();
        System.out.println(list);
    }
}
