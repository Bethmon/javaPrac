package ru.mirea.lab7;

public class MathFunc implements MathCalculable {
    @Override
    public long power(int x, int y) {
        long ans = 1;
        for (int i = 0; i<y; i++){
            ans *= x;
        }
        return ans;
    }

    @Override
    public float abs(float re, float im) {
        return (float) Math.sqrt(re*re + im*im);
    }

    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println(mc1.power(2, 5));
        System.out.println(mc1.abs(5.2f, 2.7f));
    }
}
