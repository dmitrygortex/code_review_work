public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        int step1 = add(2, 2);
        int step2 = times(step1,2);
        int step3 = dif(step2, 5);
        return div(step3, 3);
    }
}
