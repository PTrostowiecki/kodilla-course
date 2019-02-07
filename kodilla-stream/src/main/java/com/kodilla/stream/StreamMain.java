package com.kodilla.stream;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.person.People;


public class StreamMain {
    public static void main(String[] args) {
       /* ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
*/
       /* PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Exapmle number 1",(text) -> ("AAA " + text + " AAA"));
        poemBeautifier.beautify("Exapmle number 2",(text) -> ("******** " + text + "********"));
        poemBeautifier.beautify("Exapmle number 3",(text) -> (text.toUpperCase()));
        poemBeautifier.beautify("Exapmle number 4",(text) -> (text.toLowerCase()));
        poemBeautifier.beautify("Exapmle number 5",(text) -> (text = "E X A M P L E number 5"));
        poemBeautifier.beautify("Exapmle number 5",(text) -> (text + " "+ text));
        poemBeautifier.beautify("Exapmle number 5",(text) -> { int a = 0;
                                                                    while( a < 3) {
                                                                        text +="///"+ text ;
                                                                        a++;
                                                                    }
                                                                   return text;
       });*/
/*
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println("\n");

        People.getList().stream()
                .filter(s -> s.length()%2 == 0)
                .forEach(s -> {System.out.println(s + " "+ s.length());});
        System.out.println("\n");
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
        System.out.println("\n");


        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println("\n");


        BookDirectory theBookDirectory2 = new BookDirectory();
        theBookDirectory2.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(s -> {
                    System.out.println("\nTitle : " + s.getTitle().toUpperCase());
                    System.out.println("Author : " + s.getAuthor());
                    System.out.println("Year Of Publication : " + s.getYearOfPublication());
                });








    }
}