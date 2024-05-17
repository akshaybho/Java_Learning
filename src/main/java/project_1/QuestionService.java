package project_1;

import java.util.Scanner;

public class QuestionService {
    Questions[] question = new Questions[5];
    String[] select;
    public QuestionService()
    {
        question[0] = new Questions(1, "Which language is used for cypress", "Java", "Pythn", "Javascript", "Ruby", "Javascript");
        question[1] = new Questions(2,"Which language is object oriented", "Java", "Python", "Ruby", "Javascript", "Java");
        question[2] = new Questions(3, "Which datatype is largest", "byte","short","int","long","long");
        question[3] = new Questions(4,"Which city is the capital of India", "NewDelhi", "Mumbai", "Pune","Bengaluru","NewDelhi");
        question[4] = new Questions(5,"Which is tha capital of Maharashtra", "Solapur","Pune","Mumbai","Nagpur","Mumbai");
    }

    public void displayQuestion()
    {
        for(Questions q : question)
        {
            System.out.println(q);
        }
    }
    public void playQuiz()
    {
        int i = 0;
         select = new String[5];
        for(Questions q : question)
        {
            System.out.println("Question No:"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
             select[i] = sc.nextLine();
            i++;
        }

        System.out.println("Options you selected");


        for(String selection : select)
        {
            System.out.println(selection);
        }
        System.out.println();
        System.out.println();
    }

    public void getReport()
    {
        int marks = 0;
        for(int i=0; i< question.length; i++)
        {
            Questions que = question[i];
            String actualAns = que.getAnswer();
            String userAns = select[i];

            if(userAns.equals(actualAns))
            {
                marks++;
            }
        }
        System.out.println("Marks obtained = "+marks);
    }

    }


