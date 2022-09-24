package solid.singleResponsibility.wrong;

public class Calculator {
    int sum(int a, int b){
        return a+b;
    }

    int dif(int a, int b){
        return a-b;
    }

    //implement*
    //implement /
    String concatenateString (String a, String b){
        return a.concat(b);
//        should not be here...should not have a concat method
    }
}
