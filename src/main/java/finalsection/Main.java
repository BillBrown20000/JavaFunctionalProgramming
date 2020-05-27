package finalsection;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        hello("John", null, value -> {
            System.out.println("no last name provided for " + value);
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {

        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {

        } else {
            callback.accept(firstName);
        }
    }
}
//    }
//    function hello(firstName,lastName,callback){
//        Console.log(firstName);
//        if (lastName){
//            console.log(lastName)
//        }else {
//            callback();
//        }
//
//    }


