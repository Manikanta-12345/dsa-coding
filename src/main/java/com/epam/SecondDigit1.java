package com.epam;

public class SecondDigit1 {

    public static void main(String[] args) {
        int[] input = new int[]{6123,412,123,6541,234};

        for(int num:input){
            if(num>=10){
                int originalNumber = num;
                while(num!=0){
                    int reminder = num%10;
                    if(reminder==1 && num>=10 && num<=99){
                        System.out.println(originalNumber);
                    }
                    num = num/10;
                }

            }
        }
    }
}
