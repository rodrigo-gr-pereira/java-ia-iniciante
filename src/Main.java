
public class Main {


    public static void main(String[] args) {
          //  new String();
            var male = new Person("Rodrigo");
          // Ex1 Person.setTest("Test 123");
           // male.setAge(35);
            //Ex2 male.setName("Rodrigo");
           //Ex2 male.setAge(38);

            var female = new Person("Maria");
            //Ex2 female.setName("Maria");
            //female.setAge(39);

            System.out.println("Male name:" + male.getName() + " and age: "+ male.getAge());
            System.out.println("Female name:" + female.getName() + " and age: "+ female.getAge());


    }
}
