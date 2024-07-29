public class Main {

    public static void ejercicio1 () {

        double x = (double) 5.89 + (double) 3.45;
        System.out.println(x);

    }

    public static void ejercicio2() {
        char c = 'A';
        int asciiValue = (int) c;
        System.out.println("El valor ASCII de " + c + " es " + asciiValue);

    }
    public static void ejercicio3 () {

        double d = 50.90;
        long l = (long)d;
        int i = (int)l;
        System.out.println(i);
    }
    public static void ejercicio4(){

        String numero = "15";
        int convertido = Integer.parseInt(numero);
        System.out.println("El numero es : " + convertido);

    }
    public static void ejercicio5() {


        byte x = (byte) -1;
        char y = (char) x;
        int z = (int) y;
        System.out.println(z);

    }
    public static void ejercicio6(){

        int number = 65;
        char character = (char) number;
        System.out.println("El carácter correspondiente a 65 es: " + character);

    }
    public static void ejercicio7() {
        long longValue = 123456789L;
        int intValue = (int)longValue;
        System.out.println("El valor int es: " + intValue);
    }
    public static void ejercicio8() {

        float numeroFloat = 15.67f;
        String numeroString = Float.toString(numeroFloat);
        System.out.println("El número como String es: " + numeroString);


    }
    public static void ejercicio9(){

        int numero = (int) Math.round(3.7);

        System.out.println("El número quedaría en: " + numero);
    }
    public static void ejercicio10() {

        byte b = 50;
        short shxrt = (short) b;
        System.out.println("El valor en short es: " + shxrt);

    }
    public static void asignación1() {

        int x = 10; x += 5;

        System.out.println("El resultado es : " + x);


    }
    public static void asignación2() {

        int y = 10;
        int x = 3;
        y *= (x + 5);


        System.out.println("El valor de y es: " + y);
    }
    public static void asignación3() {

        int a = 15; a %= 4;

        System.out.println("El valor de a es: " + a);
    }
    public static void asignación4() {
        int x = 5;
        int y = 3;
        x += y;

        System.out.println("Valor de x después de x += y: " + x);

    }
    public static void asignación5() {
        int x = 5;

        System.out.println("Valor inicial de x: " + x);

        x ^= 2;

        System.out.println("Valor de x después de x ^= 2: " + x);

    }
    public static void operadores1() {
       int x= 2;
       int y= 7;

        int finalX = 5;
        int finalY = ++x;

        System.out.println("Valor de x después de la operación es:" +finalX);
        System.out.println("Valor de x después de la operación es:" +finalY);

    }
    public static void operadores2() {

        int a = 5;
        System.out.println(a++);
        System.out.println(a);

    }
    public static void operadores3() {

        int count=20;
        System.out.println(count--);
    }
    public static void operadores4() {

        int i= 10;
        System.out.println("Valor después de i++ es: " +(i++));
        System.out.println("Valor después de ++i es: " +(++i));

    }
    public static void operadores5() {

        int x = 3;

        System.out.println("Valor después de la operación es: " +(x++));


    }
    public static void combinados1() {

        int i = 5;
        i += ++i + i++ + ++i;

        System.out.println("Valor después de la operación es: " +i);


    }
    public static void combinados2() {

        double numero = 12.1;
        int convertido = (int)numero;
        System.out.println("El numero en int es : " + ++convertido);


    }
    public static void combinados3() {

        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);



    }
    public static void combinados4() {

        int x = 10;
        double result = 0.0;

        // Usando casteo y un operador de asignación compuesta
        result += (double) x / 2.0;

        System.out.println("El valor después del casteo y la operación compuesta es: " + result);



    }
    public static void combinados5() {
        char c = 'X';
        c += 32;
        System.out.println(c);
    }

    public static void combinados6() {
        long z = 10;
        short y= (short)z;
        y *= 3;

        System.out.println("El valor después de la operación compuesta es: " + y);

    }
    public static void combinados7() {
        int x = 10;
        x += (x++) + (++x);
        System.out.println("El valor después de la operación es: " + x);
    }
    public static void combinados8() {

        float x = 10;
        byte y= (byte)x;

        y -=3;

        System.out.println("El valor después del casteo y el predecremento " + y);
    }
    public static void combinados9() {

        int i = 257;
        byte b = (byte)i;
        System.out.println(b);

    }  public static void combinados10() {
       double w= 2.0;
        int z = (int) w;
        z += (double) w / 2.0;

        System.out.println("El valor después del casteo y la operación compuesta es: " + ++z);
    }




}
