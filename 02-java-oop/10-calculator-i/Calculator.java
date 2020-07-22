// Objectives:
// Practice classes and objects.
// Implement a calculator in java.

// Tasks:
//Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.
// Have logic for adding and subtracting.


public class Calculator implements java.io.Serializable{

    private double x;
    private double y;
    private String operator;
    private double result;
    public void Calculator() {
    }

    public void setOperandOne(double x){
        this.x = x;
    }

    public void setOperandTwo(double y){
        this.y = y;
    }

    public void setOperation(String operator){
        this.operator = operator;
    }

    public void performOperation() {
        if (this.operator.equals("+")){
            this.result = x + y;
        } if (this.operator.equals("-")){
            this.result = x + y;
        }
    }

    public double getResults() {
        return this.result;
    }
}