import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class 3+5+MainApp {

    public static void main(String[] args){
        final String inputExp = ReadInput.read();
        // here readInput class calls read method and  read method return input line which is come back to input expression

        Queue<String> operations;
        Queue<String> numbers;
        // we divide input expression to numbers and operators  by split

        String[] numbersArr = inputExp.split("[-+*/]");
        String[] operArr = inputExp.split("[0-9]+");

        //converting array into list and after that we are going to convert normal list into linked list and after that we are going to store this linked list into a queue named numbers.

        numbers = new LinkedList<>(Arrays.asList(numbersArr));
        operations = new LinkedList<>(Arrays.asList(operArr));

        // poll method of queue is used when u want to fetch the first element of queue
        // in this we fetch the 1 no from the queue and store in res variable
        Double res = Double.parseDouble(Objects.requireNonNull(numbers.poll()));

        while(!numbers.isEmpty()){
            String opr = operations.poll();

            Operate operate;
            switch (Objects.requireNonNull(opr)) {
                case "+" ->
                    // operate ka jo reference type hoga uspe hamm get reult method call karenge
                        operate = new Add();
                case "-" -> operate = new Subtract();
                case "*" -> operate = new Multiply();
                case "/" -> operate = new Divide();
                default -> {
                    continue;
                }
            }
// num will hold the 2 no in number queue
            Double num = Double.parseDouble(Objects.requireNonNull(numbers.poll()));
// int this operate will call get result on two variable res and num and the ans will store in res
            res = operate.getResult(res, num);
        }

        System.out.println(res);
    }
}
