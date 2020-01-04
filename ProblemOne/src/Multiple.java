public class Multiple {
    private int sum;

    public int findAllMultiplesOfThreeOrFiveBelow(int num){
        for(int i = 0; i < num; i++){
            if(checkIfMultipleOfThreeOrFive(i)){
                sum += i;
            }
        }
        return sum;
    }

    private boolean checkIfMultipleOfThreeOrFive(int num){
        if(isMultipleOfFive(num)){
            return true;
        }
        return isMultipleOfThree(num);
    }

    private boolean isMultipleOfThree(int num){
        return num % 3 == 0;
    }

    private boolean isMultipleOfFive(int num){
        return num % 5 == 0;
    }
}
