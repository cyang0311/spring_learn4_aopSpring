package pojo;

public class People {

    //单例模式
    private static People people;

    //限制外部不能实例
    private People(){};

    public static People getInstance(){

        if (people==null){
            synchronized (People.class){
                if (people==null){
                    people = new People();
                }
            }
        }
        return people;
    }
}
