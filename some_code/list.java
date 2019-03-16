package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
        /*
            public void add(int index , E e);
            public void remove (int index);
            public void set(int index , E e);
            public void get(int index);

           注意 ： 索引时候注意 越界问题

         */

public class list {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("e");
        list.add("c");
        System.out.println(list);
        //public void add (int index , E e);        将元素添加到指定位置
        list.add(3,"jsl");
        System.out.println(list);
        //public void remove (int index);   移出指定位置的元素，并返回该元素
        String rm = list.remove(1);
        System.out.println("移除了 ："+rm);
        System.out.println(list);
        //public void set(int index , E e);  替换指定位置的元素，并返回该元素
        String set =list.set(1,"lfq");
        System.out.println("替换了："+set);
        System.out.println(list);

        //  遍历 method 1
        for (int i = 0; i <list.size() ; i++) {
            // public void get(int index);   返回指定位置元素
            String showUp = list.get(i);
            System.out.println(showUp);
        }
        System.out.println("**************************************");
        //  method 2          迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("***************************************");
        //  method 3         增强for
        for (String s : list){
            System.out.println(s);
        }

    }
}
