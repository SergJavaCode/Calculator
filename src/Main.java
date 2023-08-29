public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        try {
            int c = calc.devide.apply(a, b); // выкидывается unchecked ошиба "деление на ноль" (java.lang.ArithmeticException: / by zero)
            calc.println.accept(c);
        } catch (ArithmeticException exception) {
            System.out.println("ОШИБКА. Деление на 0.");
        }




    }
}