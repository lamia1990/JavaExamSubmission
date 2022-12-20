package JavaExam;

public class SingletonClass {


    private static SingletonClass SingletonClass;
    private SingletonClass(){

    }
    //for exel file and xml i couldn't do them because i had a problem installing apach and Maven.
    public static SingletonClass getInstance(){
        if(null == SingletonClass){
           SingletonClass = new SingletonClass();
        }
        return SingletonClass;
    }

}
