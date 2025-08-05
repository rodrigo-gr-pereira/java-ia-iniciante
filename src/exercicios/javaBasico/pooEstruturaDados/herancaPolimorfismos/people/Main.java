package exercicios.javaBasico.pooEstruturaDados.herancaPolimorfismos.people;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("John");
        manager.setLogin("joao");
        manager.setPassword("12345");


        System.out.println(manager.getName());
        System.out.println((manager.getLogin()));
        System.out.println(manager.getPassword());
    }
}
