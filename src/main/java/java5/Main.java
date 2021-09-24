package java5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Popov Alexandr", "TeamLead", "popov89@mailbox.com", "87074123658", 100000, 32);
        employees[1] = new Employee("Ivanov Ivan", "Analyst", "ivivan@mailbox.com", "87770258963", 50000, 47);
        employees[2] = new Employee("Likhachev Andrey", "Engineer", "liandrey@mailbox.com", "87052103678", 45000, 22);
        employees[3] = new Employee("Perekrestov Denis", "Developer", "denis00@mailbox.com", "87477894561", 80000, 29);
        employees[4] = new Employee("Budon Olga", "Engineer", "olgaolga@mailbox.com", "87019424296", 75000, 42);

        System.out.println("Сотрудники старше 40 лет: ");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
