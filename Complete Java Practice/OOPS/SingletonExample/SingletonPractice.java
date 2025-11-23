package OOPS.SingletonExample;

public class SingletonPractice {
    
private static SingletonPractice sp;

private SingletonPractice(){}

public static SingletonPractice getInstance(){
    if(sp == null)
        sp = new SingletonPractice();

    return sp;
}

    
}
