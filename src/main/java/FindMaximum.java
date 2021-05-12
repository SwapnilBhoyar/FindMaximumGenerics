public class FindMaximum {
    public int findMaxNumber(Integer numberOne, Integer numberTwo, Integer numberThree) {
        Integer maxNumber = numberOne;
        if (numberTwo.compareTo(maxNumber) > 0) {
            maxNumber = numberTwo;
        }
        if (numberThree.compareTo(maxNumber) > 0) {
            maxNumber = numberThree;
        }
        return maxNumber;
    }

    public float findFloatMaxNumber(Float numberOne, Float numberTwo, Float numberThree) {
        Float maxNumber = numberOne;
        if (numberTwo.compareTo(maxNumber) > 0) {
            maxNumber = numberTwo;
        }
        if (numberThree.compareTo(maxNumber) > 0) {
            maxNumber = numberThree;
        }
        return maxNumber;
    }

    public String findStringMaxNumber(String stringOne, String stringTwo, String stringThree) {
        String maxNumber = stringOne;
        if (stringTwo.compareTo(maxNumber) > 0) {
            maxNumber = stringTwo;
        }
        if (stringThree.compareTo(maxNumber) < 0) {
            maxNumber = stringThree;
        }
        return maxNumber;
    }
}
