package error_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
                异常 ：（1） 编译期异常
                       （2） 运行期异常
                方法产生异常，JVM根据异常原因创建一个异常对象，包含原因、内容、位置
                方法没有try...catch{} ,JVM把异常对象抛给方法调用者main方法
                main（）方法 ,main 方法也没有 try...catch{} , 把异常对象抛给JVM处理
                JVM 把对象（内容、原因、位置） 打印到控制台
                JVM 会终止执行的Java程序   即中断处理
             */
public class demoException {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        //  编译期异常
        try {
            date = sdf.parse("199003-23");      // 格式不正确 错误
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Hi");
        }
        System.out.println(date);
        System.out.println("hello world");
        System.out.println("*******************************");
        //运行时期错误
        int []arr ={1,2,3};
        try{
            System.out.println(arr[3]);             //数组越界错误
        } catch (Exception e){
            System.out.println(e);
            System.out.println("数组越界");
        }

    }
}
