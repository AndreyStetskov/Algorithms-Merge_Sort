import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        У вас есть список из n элементов, которые представляют собой оценки студентов по математике.
//        Вам нужно отсортировать этот список в порядке убывания оценок с использованием алгоритма сортировки Merge sort.
//        Для решения этой задачи напишите функцию, которая принимает на вход список оценок и возвращает новый список, отсортированный в порядке убывания.
//        { 3, 8, 1, 9, 4, 2, 7, 6, 5 };

       int[] grade = { 3, 8, 1, 9, 4, 2, 7, 6, 5 };
       GradeSort.sort(grade);


//       Дан массив объектов типа Person, который содержит поля name (тип String) и age (тип int).
//       Необходимо отсортировать этот массив по возрасту в порядке убывания, используя алгоритм Merge sort.

        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };

        PersonSort.sort(people);
    }
}