package test.skypro;

public class Main {

    public static void main(String[] args) {
        // задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // задание 2
        String upFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upFullName);

        // задание 3
        fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace('ё', 'е');
            String[] lNfNmN = fullName.split(" ");
            firstName = lNfNmN[1];
            middleName = lNfNmN[2];
            lastName = lNfNmN[0];
        }
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
