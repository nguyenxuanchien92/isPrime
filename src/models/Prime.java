package models;

public class Prime {
    private double number;

    public Prime(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public boolean isPrime(Prime number) {
        int i = 2;
        boolean check = true;
        double val = number.getNumber();
        if (val > 2) {
            while (i <= Math.sqrt(val)) {
                if (val % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }else {
            check = false;
        }

        return check;
    }
}
