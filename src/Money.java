public class Money {
    private final long hryvnias;
    private final byte coint;

    public Money(long hryvnias, byte coint) {
        this.coint = coint;
        this.hryvnias = hryvnias;

    }

    public Money Add(Money other) {
        long newHrywna = this.hryvnias + other.hryvnias;
        int newCoint = this.coint + other.coint;
        if (newCoint >= 100) {
            newHrywna += newCoint / 100;
            newCoint %= 100;
        }
        return new Money(newHrywna, (byte) newCoint);
    }

    public Money subtract(Money other) {
        long newHrywnia = this.hryvnias - other.hryvnias;
        int newCoint = Math.abs(this.coint - other.coint);

        return new Money(newHrywnia, (byte) newCoint);
    }

    public Money divisionValue(long Divisor) {
        long newHrywnia = this.hryvnias / Divisor;
        int newCoint = (int) (((this.hryvnias % Divisor) * 100 + this.coint) / Divisor);

        return new Money(newHrywnia, (byte) newCoint);
    }

    public Money divide(Money other) {
        long thisCoin = this.hryvnias * 100 + this.coint;
        long otherCoin = other.hryvnias * 100 + other.coint;


        double resultCoin = (double) thisCoin / otherCoin;

        long resultHrywnia = (long) resultCoin;
        byte resultCentsByte = (byte) ((resultCoin - resultHrywnia) * 100);

        return new Money(resultHrywnia, resultCentsByte);
    }
    public int compareTo(Money other) {
        if (this.hryvnias < other.hryvnias) {
            return -1;
        } else if (this.hryvnias > other.hryvnias) {
            return 1;
        }

            /*0 if ‘a is equal to ‘b,
            a positive value ‘a’ is greater than ‘b’,
            a negative value ‘b’ is greater than ‘a’*/
        return Byte.compare(this.coint, other.coint);
    }

    @Override
    public String toString() {
        return String.format("%d,%02d грн.", hryvnias, coint);
    }
}