import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String expression = br.readLine();
    Stack<Character> operandStack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i<expression.length(); i++){
      int priority = getPriority(expression.charAt(i));
      switch (expression.charAt(i)){
        case '+':
        case '-':
        case '*':
        case  '/':
          while(!operandStack.isEmpty() && getPriority(operandStack.peek()) >= priority){
            sb.append(operandStack.pop());
          }
          operandStack.push(expression.charAt(i));
          break;
        case '(':
          operandStack.push('(');
          break;
        case  ')':
          while(!operandStack.isEmpty() && operandStack.peek() != '('){
            sb.append(operandStack.pop());
          }
          operandStack.pop();
          break;
        default:
          sb.append(expression.charAt(i));
      }
    }
    while (!operandStack.isEmpty()){
      sb.append(operandStack.pop());
    }
    System.out.println(sb.toString());
  }

  private static int getPriority(char operand) {
    switch (operand){
      case '*':
      case '/':
        return 2;
      case '-':
      case '+':
        return 1;
    }
    return 0;
  }

}
