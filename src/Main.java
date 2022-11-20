public class Main {
    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String separator = " ";
        String fullName = lastName + separator + firstName + separator + middleName;
        System.out.println("ФОИ сотрудника - " + fullName);

        // Задание 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

        // Задание 3
        fullName = "Иванов Семён Семёнович";
        String repName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сторудника - " + repName);
    }
}