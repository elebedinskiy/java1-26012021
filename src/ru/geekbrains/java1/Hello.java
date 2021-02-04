package ru.geekbrains.java1;

public class Hello {
    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Иванов Иван", "Инженер", "ivan@contoso.com", "+7-903-000-11-22", 30000, 35);
        employeesArray[1] = new Employee("Петров Петр", "Разработчик", "petr@contoso.com", "+7-903-555-33-77", 90000, 42);
        employeesArray[2] = new Employee("Сидоров Сидр", "Менеджер по продажам", "sidr@contoso.com", "+7-903-777-55-22", 40000, 25);
        employeesArray[3] = new Employee("Антонов Антон", "Бухгалтер", "anton@contoso.com", "+7-903-333-55-22", 60000, 45);
        employeesArray[4] = new Employee("Сергеев Сергей", "Директор", "boss@mail.ru", "+7-903-666-88-33", 300000, 55);

        for (int i = 0; i < employeesArray.length; i++){
            if (employeesArray[i].getAge() > 40){
                employeesArray[i].printInfo();
            }
        }

    }
}
