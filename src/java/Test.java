import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test
{
    static ArrayList <String> yourAnswers = new ArrayList<String>();           //массив, в котором хранятся ответы пользователя
    static ArrayList <Question> questions = new ArrayList<Question>();                //массив, в котором хранятся тестовые вопросы
    static int result = 0;



    static class Question           //Класс, описывающий вопросы
    {
        String questionBody;
        String answerA;
        String answerB;
        String answerC;
        String answerD;
        String correctAnswer;
    }

    public static void questionsList()          //заполнение вопросов
    {
        Question question1 = new Question();    //1 вопрос
        question1.questionBody = "1)2+2=?";
        question1.answerA = "a)1";
        question1.answerB = "b)2";
        question1.answerC = "c)3";
        question1.answerD = "d)4";
        question1.correctAnswer = "d";
        questions.add(question1);              //Добавляю 1-ый вопрос в массив с вопросами


        Question question2 = new Question();    //2 вопрос
        question2.questionBody = "2)2+2=?";
        question2.answerA = "a)1";
        question2.answerB = "b)2";
        question2.answerC = "c)3";
        question2.answerD = "d)4";
        question2.correctAnswer = "d";
        questions.add(question2);              //Добавляю 2-ый вопрос в массив с вопросами

        Question question3 = new Question();    //3 вопрос
        question3.questionBody = "3)2+2=?";
        question3.answerA = "a)1";
        question3.answerB = "b)2";
        question3.answerC = "c)3";
        question3.answerD = "d)4";
        question3.correctAnswer = "d";
        questions.add(question3);              //Добавляю 3-ый вопрос в массив с вопросами

        Question question4 = new Question();    //4 вопрос
        question4.questionBody = "4)2+2=?";
        question4.answerA = "a)1";
        question4.answerB = "b)2";
        question4.answerC = "c)3";
        question4.answerD = "d)4";
        question4.correctAnswer = "d";
        questions.add(question4);              //Добавляю 4-ый вопрос в массив с вопросами


    }

    static void start() throws IOException     //Запускает тест
    {
        questionsList();    //запускает метод, в котором хранятся вопросы
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0;i<questions.size();i++){                                      //Цикл, в ходе которого выводятся вопрос и ответы
            System.out.println(questions.get(i).questionBody);
            System.out.println(questions.get(i).answerA);
            System.out.println(questions.get(i).answerB);
            System.out.println(questions.get(i).answerC);
            System.out.println(questions.get(i).answerD);
            System.out.println("Введите ваш вариант ответа: ");
            yourAnswers.add(userInput.readLine());                          //Ответ пользователя добавляется в массив с ответами

        }
    }

    public static void result()             //Метод, который выводит результат теста
    {
        for (int i = 0; i < yourAnswers.size(); i++)                //Цикл, считывающий количество правильных ответов
        {
            //TODO: make it case insensitive
            if(yourAnswers.get(i).equals(questions.get(i).correctAnswer))
                result+=1*100/questions.size();
        }
        System.out.println("Ваше процентное соотношение правильных ответов = "+result+"%");
    }
    public static void main(String args[]) throws IOException
    {


        start();
        result();

    }
}
