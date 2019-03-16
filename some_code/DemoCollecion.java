package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
/*
        public boolean add(E e);   把给定的对象添加到当前集合中
        public boolean remove(E e);  把给定的对象从当前集合中删除
        public boolean contains(E e); 判断当前集合中是否包含给定的对象
        public int size();  返回集合中的元素的个数
        public Object[] toArray(); 把集合中的元素，存储到数组中
 */

public class DemoCollecion {
    public static void main(String[] args) {
       // Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();     //无序
        System.out.println(coll);
        /*
            public boolean add(E e);   把给定的对象添加到当前集合中
         */
        boolean b1 = coll.add("xiao hong");
        System.out.println("b1:"+b1);
        coll.add("xiao ming ");
        coll.add("xiao qiang");
        coll.add("xiao bai");
        System.out.println(coll);
        /*
            public boolean remove(E e);  把给定的对象从当前集合中删除
         */
        coll.remove("xiao bai");
        System.out.println("删除："+coll);
        /*
            public boolean contains(E e); 判断当前集合中是否包含给定的对象
         */
         boolean b2 = coll.contains("xiao qiang");
        System.out.println("b2:"+b2);
        /*
            public boolean isEmpty();  判断当前集合是否为空
         */
        boolean b3 = coll.isEmpty();
        System.out.println("b3:"+b3);
        /*
            public int size();  返回集合中的元素的个数
         */
        int size = coll.size();
        System.out.println("size="+size);
        /*
            public Object[] toArray(); 把集合中的元素，存储到数组中
         */
        Object[] array = coll.toArray();
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }



    }
}
