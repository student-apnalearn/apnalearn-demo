package test;



class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
       
        while(true){
            System.out.println("I'm thread : "+Thread.currentThread().getName());  
            System.out.println("I'm thread :"+Thread.currentThread().getPriority());
        }
    }
}
public class Cwh_Thread_Priority  {
    public static void main(String[] args) {
    MyThr1 t1 = new MyThr1("Threa");
    MyThr1 t2 = new MyThr1("Ram Candr");
    t2.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
//    System.out.println("The id of the thread t is " + t1.getId());
//    System.out.println("The name of the thread t is " + t1.getName());
//    System.out.println("The id of the thread t is " + t2.getId());
//    System.out.println("The name of the thread t is " + t2.getName());

    }
}