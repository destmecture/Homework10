public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        String firstName = "Ivan";
        String secondName = "Ivanov";
        String lastName = "Ivanovich";

        String fullName = secondName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — "+fullName);

        System.out.println("Task 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);

        System.out.println("Task 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");

        System.out.println("Данные ФИО сотрудника — "+fullName);


    }
}