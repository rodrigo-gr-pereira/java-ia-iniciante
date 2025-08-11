package exercicios.javaBasico.collections.domain;

public record User(String name, int age) {

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
