package accenture;

public class BMI {
    public static void main(String args[]){
        BMI obj = new BMI();
        int result  = obj.calculateBMI(62, 1.52);
        System.out.println(result);
    }
    int calculateBMI(int weight, double height){
        double bmi = weight/(height*height);
        if(bmi<18){
            return 0;
        }
        else if(bmi>=18 && bmi<25){
            return 1;
        }
        else if(bmi>=25 && bmi<30){
            return 2;
        }
        else if(bmi>=30 && bmi<40){
            return 3;
        }
        else{
            return 4;
        }
    }
}
