package exercises;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Ex2 {
    public Ex2(int size){
        database = Ex1.GetRandomLL(size);
    }
    private LinkedList<Integer> database = new LinkedList<Integer>();
    /**
    помещает элемент в конец очереди
     **/
    public void enqueue(int element){
        database.add(element);
    }
    /**
     возвращает первый элемент из очереди и удаляет его
     **/
    public int dequeue(){
        return database.remove(0);
    }
    /**
     возвращает первый элемент из очереди, не удаляя
     **/
    public int first(){
        return database.get(0);
    }
    /**
     just for control
     **/
    public void print(){
        System.out.println(database);
    }
}
