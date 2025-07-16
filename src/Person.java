import java.time.OffsetDateTime;

public class Person {


     private final String name;

     private int age;

     private int lastYearAgeInc = OffsetDateTime.now().getYear();


     public Person(String name){
         this.name = name;
         this.age = 1;
     }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void incAge(){
         if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
         this.age += 1;
         this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }


    /* public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

     */

    //Ex1
    //private static String test;

    //public static String getTest() {
      //  return test;
    //}

    //public static void setTest(String testParam) {
      //  test = testParam;
    //}


}
