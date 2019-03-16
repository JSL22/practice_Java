package collection;

import java.util.LinkedList;

 /*
        public E getFirst();        //获取
        public E getLast();

        public E addFirst(E e);               //添加
        public E addLast(E e);
        public E push(E e);

        public E removeFirst(E e);           移出
        public E removeLast(E e);
        public E pop(E e);
  */

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        showUp1();
        showUp2();


    }
    public static void showUp1(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("1");
        linked.add("2");
        linked.add("3");

        // public E getFirst();         返回列表第一个元素
        //public E getLast();           返回列表最后一个元素
        if(!linked.isEmpty()){                                  // 判断一下列表是否为空
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println("first:"+first+"  last:"+last);
        }

        System.out.println("*******************************");
        // public E addFirst(E e);    将元素插入列表开头（堆入列表堆栈）
        //public E addLast(E e);
        linked.addFirst("jsl");      //等价于  linked.push();
        linked.addLast("lfq");
        System.out.println(linked);
    }
    public static void showUp2(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("@");
        linked.add("#");
        linked.add("$");
        System.out.println("**************************");
        if (!linked.isEmpty()){
            // public E removeFirst(E e);               移出并返回第一个元素
            // public E removeLast(E e);                移出并返回最后一个元素

            String rm1 = linked.removeFirst();         //等价于  linked.pop();
            String rm2 = linked.removeLast();

            System.out.println("rm1= "+rm1+"; rm2 ="+rm2);
            System.out.println(linked);
        }


    }

}
