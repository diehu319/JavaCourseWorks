import java.util.*;
import java.util.function.Predicate;

public class P186 {

    public static <T> List<T> filter(List<T> values, Predicate<? super T> p){
        List<T> list = new ArrayList<>();
        values.forEach(items -> {if(p.test(items)) list.add(items);});
        return list;
    }

    public static void main(String[] args){
        List<String> list = Arrays.asList("hi","hello","cava","hola","zzzzzzzzzzzzzzzzzzzz","okkkkkkkkkkkkkk");
        System.out.println("List of string length greater than 10: " + filter(list, item -> item.length() > 10));
    }
}
