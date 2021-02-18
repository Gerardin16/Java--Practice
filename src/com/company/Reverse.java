package com.company;

public class Reverse {
    private Integer number,reverse;
//    Getter-output variable
    public Integer getReverse() {
        return reverse;
    }

    // Setter---input variables
    public Integer setNumber(int newNumber) {
        this.number = newNumber;
        return number;
    }
    public void ReverseInt() {

        StringBuilder reverseString = new StringBuilder(number.toString());
        if (number < 0) {
            reverseString.deleteCharAt(0);
        }
        String result = String.valueOf(reverseString.reverse());
        reverseString.deleteCharAt(0);
        reverse= Integer.valueOf(result);

    }




}
