import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test
{
    public static void main(String args[]) throws IOException
    {

        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        double k = 0;

        System.out.println("1)2+2=?");
        System.out.println("a)2");
        System.out.println("b)3");
        System.out.println("c)4");
        System.out.println("d)5");
        System.out.println("Введите вариант ответа");

        if (a1.readLine().equals("c")){
            k++;
        }

        System.out.println("1)2+3=?");
        System.out.println("a)2");
        System.out.println("b)3");
        System.out.println("c)4");
        System.out.println("d)5");
        System.out.println("Введите вариант ответа");

        if (a1.readLine().equals("d")){
            k++;
        }

        System.out.println("1)2+1=?");
        System.out.println("a)2");
        System.out.println("b)3");
        System.out.println("c)4");
        System.out.println("d)5");
        System.out.println("Введите вариант ответа");

        if (a1.readLine().equals("b")){
            k++;
        }

        System.out.println("1)2+0=?");
        System.out.println("a)2");
        System.out.println("b)3");
        System.out.println("c)4");
        System.out.println("d)5");
        System.out.println("Введите вариант ответа");

        if (a1.readLine().equals("a")){
            k++;
        }


        k=k/4*100;
        System.out.println("Ваше процентное соотношение баллов = "+k+"%");


    }

}
