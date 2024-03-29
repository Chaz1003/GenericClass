package Arithmetic;

public class Arithmetic {

    Object num1, num2;
    public Arithmetic(Object num1, Object num2) {

        if(num1 instanceof Integer || num1 instanceof  Double || num1 instanceof Long
                || num1 instanceof Short || num1 instanceof Float){
            if(num2 instanceof Integer || num2 instanceof  Double || num2 instanceof Long
               || num2 instanceof Short || num2 instanceof Float) {
                this.num1 = num1;
                this.num2 = num2;
            }else{
                throw new ClassCastException("One of the input is not a number");
            }
        }else{
            throw new ClassCastException("One of the input is not a number");
        }
    }
    public double add(){
        double temp=0, temp2=0;

        if(num1 instanceof Number)
            temp = ((Number) num1).doubleValue();
        if(num2 instanceof Number)
            temp2 = ((Number) num2).doubleValue();

        return temp+temp2;
    }

    public double subtract(){
        double temp=0, temp2=0;

        if(num1 instanceof Number)
            temp = ((Number) num1).doubleValue();
        if(num2 instanceof Number)
            temp2 = ((Number) num2).doubleValue();

        return temp-temp2;
    }


    public double multiply(){
        double temp=0, temp2=0;

        if(num1 instanceof Number)
            temp = ((Number) num1).doubleValue();
        if(num2 instanceof Number)
            temp2 = ((Number) num2).doubleValue();

        return temp*temp2;
    }

    public double divide(){
        double temp=0, temp2=0;

        if(num1 instanceof Number)
            temp = ((Number) num1).doubleValue();
        if(num2 instanceof Number)
            temp2 = ((Number) num2).doubleValue();

        return temp/temp2;
    }
    public double getMin(){
        double temp=0, temp2=0;

        if(num1 instanceof Number)
            temp = ((Number) num1).doubleValue();
        if(num2 instanceof Number)
            temp2 = ((Number) num2).doubleValue();

        return Math.min(temp, temp2);
    }
    public double getMax(){
        double temp=0, temp2=0;

        if(num1 instanceof Number)
            temp = ((Number) num1).doubleValue();
        if(num2 instanceof Number)
            temp2 = ((Number) num2).doubleValue();

        return Math.max(temp, temp2);
    }
    public void execute(){
        System.out.printf("Numbers: (" + num1 + "," + num2 + ")\n\n" +
                "Adding:\t\t\t" + this.add() + "\nSubtracting:\t" + this.subtract() +
                "\nMultiplying:\t%.2f" + "\nDividing:\t\t%.2f" + "\nMinimum:\t\t" + this.getMin()
                + "\nMaximum:\t\t" + this.getMax() + "\n",this.multiply(),this.divide());
    }
}
