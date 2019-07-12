package pojo;

public class People2 {
    private static People2 people2 = new People2();
    private People2(){};
    private static People2 getInstance(){
        return people2;
    }
}
