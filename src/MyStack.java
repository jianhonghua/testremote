import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack<T> {

    LinkedList<T> values = new LinkedList<T>();

    public void push(T t){
        values.addLast(t);
    }

    public T pull(){
        return values.removeLast();
    }

    public T peek(){
        return values.getLast();
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(2);

        stack.push(5);

        System.out.println(stack);

        ArrayList<Hero> heroes = new ArrayList<Hero>();
        ArrayList<ADHero> adHeroes = new ArrayList<ADHero>();

//        ArrayList<? super Hero> hh = new ArrayList<Object>();
//
//        hh.add(new ADHero());
//
//        hh.add(new Hero());

        //heroes = adHeroes;

        //adHeroes = heroes;
    }
}
