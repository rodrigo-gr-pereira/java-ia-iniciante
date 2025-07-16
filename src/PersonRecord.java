public record PersonRecord(String name, int age) {
 //   public static String name;
    public PersonRecord{

    }

    public PersonRecord(final String name){
        this(name, 1);
    }

    public String getInfo(){
        return  "Name: " + name + ", Age: " +  age;
    }

}
