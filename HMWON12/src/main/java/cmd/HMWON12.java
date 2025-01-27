/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Eissa
 */
package cmd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HMWON12 {

    private static final File usersFile = new File("C:/Users/Eissa/IdeaProjects/textfile/1.txt");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Введите команду:");
            String cmd = sc.nextLine();

            if ("exit".equals(cmd)) {
                flag = false;
                System.out.println("Завершение работы...");
            } else if ("help".equals(cmd)) {
                System.out.println("Доступные команды: create, findAll, find, update, delete, exit");
            } else if ("create".equals(cmd)) {
                createUser(sc);
            } else if ("findAll".equals(cmd)) {
                findAllUsers();
            } else if ("find".equals(cmd)) {
                findUserByName(sc);
            } else if ("update".equals(cmd)) {
                updateUserById(sc);
            } else if ("delete".equals(cmd)) {
                deleteUserById(sc);
            } else {
                System.out.println("Не распознал команду. Воспользуйтесь help");
            }
        }
    }

    private static void createUser(Scanner sc) {
        System.out.println("Создаём нового пользователя");
        String name = "";
        while (name.isBlank()) {
            System.out.println("Введите имя:");
            name = sc.nextLine();
        }

        int age = 0;
        while (age <= 0) {
            System.out.println("Введите корректный возраст:");
            String ageInput = sc.nextLine();
            try {
                age = Integer.parseInt(ageInput);
            } catch (NumberFormatException e) {
                age = 0;
            }
        }

        try {
            List<User> users = loadUsersFromFile();
            int id = users.isEmpty() ? 1 : users.get(users.size() - 1).getId() + 1;

            FileWriter fw = new FileWriter(usersFile, true);
            fw.write(id + "~" + name + "~" + age + "\n");
            fw.flush();
            fw.close();
            System.out.println("Пользователь успешно создан с id: " + id);
        } catch (IOException e) {
            System.out.println("Произошла ошибка во время записи: " + e.getMessage());
        }
    }

    private static void findAllUsers() {
        try {
            List<User> users = loadUsersFromFile();
            System.out.println("Список пользователей:");
            for (User user : users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка при чтении: " + e.getMessage());
        }
    }

    private static void findUserByName(Scanner sc) {
        System.out.println("Введите имя для поиска:");
        String name = sc.nextLine();

        try {
            List<User> users = loadUsersFromFile();
            System.out.println("Результаты поиска:");
            boolean found = false;

            for (User user : users) {
                if (user.getName().equalsIgnoreCase(name)) {
                    System.out.println(user);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Пользователь не найден.");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка при чтении: " + e.getMessage());
        }
    }

    private static void updateUserById(Scanner sc) {
        System.out.println("Введите id пользователя для обновления:");
        int id = Integer.parseInt(sc.nextLine());

        try {
            List<User> users = loadUsersFromFile();
            boolean found = false;

            for (User user : users) {
                if (user.getId() == id) {
                    System.out.println("Найден пользователь: " + user);
                    System.out.println("Введите новое имя:");
                    String newName = sc.nextLine();
                    System.out.println("Введите новый возраст:");
                    int newAge = Integer.parseInt(sc.nextLine());

                    user.setName(newName);
                    user.setAge(newAge);
                    found = true;
                    break;
                }
            }

            if (found) {
                saveUsersToFile(users);
                System.out.println("Пользователь успешно обновлён.");
            } else {
                System.out.println("Пользователь с таким id не найден.");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    private static void deleteUserById(Scanner sc) {
        System.out.println("Введите id пользователя для удаления:");
        int id = Integer.parseInt(sc.nextLine());

        try {
            List<User> users = loadUsersFromFile();
            boolean found = false;

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId() == id) {
                    users.remove(i);
                    found = true;
                    break;
                }
            }

            if (found) {
                saveUsersToFile(users);
                System.out.println("Пользователь успешно удалён.");
            } else {
                System.out.println("Пользователь с таким id не найден.");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    private static List<User> loadUsersFromFile() throws FileNotFoundException {
        List<User> users = new ArrayList<>();
        Scanner sc = new Scanner(usersFile);

        while (sc.hasNext()) {
            String[] userLines = sc.nextLine().split("~");
            int id = Integer.parseInt(userLines[0]);
            String name = userLines[1];
            int age = Integer.parseInt(userLines[2]);

            users.add(new User(id, name, age));
        }

        sc.close();
        return users;
    }

    private static void saveUsersToFile(List<User> users) throws IOException {
        FileWriter fw = new FileWriter(usersFile, false);

        for (User user : users) {
            fw.write(user.getId() + "~" + user.getName() + "~" + user.getAge() + "\n");
        }

        fw.flush();
        fw.close();
    }
}

