package exercises;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Ex2 {
    public Ex2(int size){
        database = Ex1.GetRandomLL(size);
        listSize = size;
    }
    /**
     Сам список
     */
    private LinkedList<Integer> database = new LinkedList<Integer>();
    /**
     Размер списка, чтобы не пробегаться по нему каждый раз
     */
    private int listSize = 0;
    /**
    помещает элемент в конец очереди
     */
    public void enqueue(int element){
        database.add(element);
        listSize++;
    }
    /**
     возвращает первый элемент из очереди и удаляет его
     */
    public int dequeue(){
        if(listSize > 0) {
            listSize--;
            return database.remove(0);
        }
        else {
            throw new RuntimeException("Список пустой!");
        }
    }
    /**
     возвращает первый элемент из очереди, не удаляя
     */
    public int first(){
        return database.get(0);
    }
    /**
     just for control
     */
    public void print(){
        System.out.println(database);
    }
}
