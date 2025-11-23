package OOPS.SingletonExample;

public class SuperAdmin {
    private static volatile  SuperAdmin user;

    private SuperAdmin(){
        if(user != null)
            throw new IllegalStateException("Instance already present");
    }

    public SuperAdmin getInstant(){
           if (user == null) {
                synchronized (SuperAdmin.class) {
                    if (user == null) {
                        user = new SuperAdmin();
                    }
                }
           }
        
        return user;
    } 
}
