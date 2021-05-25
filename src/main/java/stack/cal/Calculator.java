package stack.cal;

/**
 * @Author: panyusheng
 * @Date: 2021/5/24
 * @Version 1.0
 * <p>
 * 计算器
 */
public class Calculator {
    public static void main(String[] args) {
        String expression = "10*10-5";
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack2 operatorStack = new ArrayStack2(10);
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;

        int index = 0;  // 用来辅助扫描
        char ch = ' ';
        String keepNum = ""; //用于拼接 多位数

        // 扫描表达式
        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);
            if (operatorStack.isOper(ch)) {
                if (!operatorStack.isEmpty()) {
                    // 符号栈不为空，要判断优先级，若当前的优先级<=栈中操作符，就需要从数栈中 pop 出两个数，符号栈pop出一个符号，再把结果push进数栈，再把当前操作符push进符号栈
                    if (operatorStack.priority(ch) <= operatorStack.priority(operatorStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operatorStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        numStack.push(res);
                        operatorStack.push(ch);
                    } else {
                        operatorStack.push(ch);
                    }
                } else {
                    operatorStack.push(ch);
                }
            } else {
                // 是数字
//                numStack.push(ch - 48);
                // 可能是多位数，看index后一位是否是数字
                keepNum += ch;
                if (index == expression.length() - 1) {    // 最后一个
                    numStack.push(Integer.parseInt(keepNum));
                } else {
                    if (operatorStack.isOper(expression.substring(index + 1, index + 2).charAt(0))) {
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }

            }
            index++;
            if (index >= expression.length()) {
                break;
            }
        }

        // 扫描完毕，数和符号都压栈了
        while (true) {
            if (operatorStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operatorStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);
        }
        int res2 = numStack.pop();
        System.out.println("结果：" + expression + " = " + res2);
    }
}
