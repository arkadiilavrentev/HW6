public class Main {
    public static void main(String[] args) {
        {
            // Задача 1;
            System.out.println("Задача 1");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + ' ' + firstName + ' ' + middleName;
            System.out.println("ФИО сотрудника - " + fullName);
            System.out.println("");
        }
        {
            // Задача 2;
            System.out.println("Задача 2");
            String fullName = "Ivanov Ivan Ivanovich";
            fullName = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
            System.out.println("");
        }
        {
            // Задача 3;
            System.out.println("Задача 3");
            String fullName = "Ivanov Ivan Ivanovich";
            fullName = fullName.replaceAll(" ", "; ");
            System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName);
            System.out.println("");
        }
        {
            // Задача 4;
            System.out.println("Задача 4");
            String fullName = "Иванов Семён Семёнович";
            fullName = fullName.replace('ё', 'е');
            System.out.println("Данные ФИО сотрудника - " + fullName);
            System.out.println("");
        }
        {
            // Задача 5;
            System.out.println("Задача 5");
            String fullName = "Ivanov Ivan Ivanovich";
            int beginIndex = 0;
            int endIndex = fullName.indexOf(' ');
            String lastname = fullName.substring(beginIndex, endIndex);
            beginIndex = endIndex + 1;
            endIndex = fullName.lastIndexOf(' ');
            String firstname = fullName.substring(beginIndex, endIndex);
            beginIndex = endIndex + 1;
            String middlename = fullName.substring(beginIndex);
            System.out.println("Имя сотрудника - " + firstname);
            System.out.println("Фамилия сотрудника - " + lastname);
            System.out.println("Отчество сотрудника - " + middlename);
            System.out.println("");
        }
        {
            // Задача 6;
            System.out.println("Задача 6");
            String fullName = "Ivanov Ivan Ivanovich";
            char[] str = fullName.toCharArray();
            int firstLetter = 0;
            int secondLetter = fullName.indexOf(' ') + 1;
            int thirdLetter = fullName.lastIndexOf(' ') + 1;
            str[firstLetter] = Character.toUpperCase(str[firstLetter]);
            str[secondLetter] = Character.toUpperCase(str[secondLetter]);
            str[thirdLetter] = Character.toUpperCase(str[thirdLetter]);
            System.out.print("Верное написание Ф. И. О. cотрудника с заглавных букв — ");
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.println("");
            System.out.println("");
        }
        {
            // Задача 7;
            System.out.println("Задача 7");
            String first = "135";
            String second = "246";
            StringBuilder one = new StringBuilder(first);
            StringBuilder two = new StringBuilder(second);
            String res = one.substring(0, 1) + two.substring(0, 1) + one.substring(1,2) + two.substring(1,2) + one.substring(2) + two.substring(2);
            System.out.println("Данные строки - " + res);
            System.out.println("");
        }
        {
            // Задача 8;
            System.out.println("Задача 8");
            String str = "aabccddefgghiijjkk";
            char[] arr = str.toCharArray();
            boolean[] znach = new boolean[arr.length];
            for (int i = 0; i < str.length(); i++) {
                if (!znach[i]){
                    for (int j = i + 1; j < str.length() ; j++){
                        if (arr[j] == arr[i]){
                            znach[i] = true;
                            znach[j] = true;
                        }
                    }
                    if (znach[i]) {
                        System.out.print(arr[i]);
                    }
                }
            }
            System.out.println("");
        }
    }
}