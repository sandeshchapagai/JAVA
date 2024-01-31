public class Calculator {
    int result;
    public Calculator(){
        this.result =0;
    }
    public Calculator add(int num1, int num2){
        this.result = result + num1+num2;
        return this;
    }

    public  Calculator sub(int num2,int num3){
        this.result =result - num2-num3;
        return this;
    }
    public int GetResult(){
       return  result;

    }

}
