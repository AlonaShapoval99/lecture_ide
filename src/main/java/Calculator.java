public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int sum (){
        return x + y;
    }
    public int div () {
        if(y==0){
            throw new RuntimeException("Y must not be 0");
        }
        return x / y;
    }
    public int subtract(){
        return x - y;
    }
    public int divide(){
        return x / y;
    }

}
