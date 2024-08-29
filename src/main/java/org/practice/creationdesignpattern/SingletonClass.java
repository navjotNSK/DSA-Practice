package org.practice.creationdesignpattern;

public class SingletonClass {

    private static SingletonClass object;

    private static Boolean initialized = false;

    private SingletonClass() {
    }

    public static synchronized SingletonClass getInstance(){
        if(initialized){
            return object;
        }
        object = new SingletonClass();
        initialized = true;
        return object;
    }


    public static SingletonClass getInstance_2(){
        if(object == null){
            synchronized (SingletonClass.class){
                if(object == null){

                    object = new SingletonClass();
                    initialized = true;
                    return object;
                }
            }

        }
        return object;
    }

    public static SingletonClass getInstance_3(){
        if(initialized){
            return object;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        object = new SingletonClass();
        initialized = true;
        return object;
    }

    public static SingletonClass getInstance_4(){
        if (!initialized) {
            // Add a sleep here to increase the chance of thread preemption
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            object = new SingletonClass();
            initialized = true;
        }
        return object;
    }


    public static void main(String[] args){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                SingletonClass instance = SingletonClass.getInstance_2();
                System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
            }
        };

        Thread t1 = new Thread(task, "Thread1");
        Thread t2 = new Thread(task, "Thread2");

        t1.start();
        t2.start();






    }




}
