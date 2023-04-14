public  class Main {
    public static void main(String[] args) {
        int[][] outputMatrix = new int[][]{ {0, 1, 2},
                {1, 2, 0}, {2, 0, 1},
                {1, 0, 2},  {2, 1, 0}};
        int currentState = 0;
        int input1 = 1;
        int input2 = 0;
        int output = outputMatrix[currentState][2*input1 + input2];
        System.out.println("Output: " + output);
        // переход в новое состояние
        if (input1 == 0 && input2 == 0) {
            currentState = 0;
        } else if (input1 == 0 && input2 == 1) {
            currentState = 1;
        } else if (input1 == 1 && input2 == 0) {
            currentState = 2;
        } else if (input1 == 1 && input2 == 1) {
            currentState = 3;
        }
        output = outputMatrix[currentState][2*input1 + input2];
        System.out.println("Output: " + output);

    }
}