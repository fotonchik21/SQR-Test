package ru.netology.sqr;

public class SQRService {

    public int calcSquares(int a, int b) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            if (a <= (i * i) && b >= (i * i)) {
                result++;
            }
        }
        return result;
    }
}
