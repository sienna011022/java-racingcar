package racingcar_2step.operation;

public class Minus extends AbstractOperation implements Operation {

    public final static String SIGN = "-";

    public Minus(String left, String right) {
        super(left, right);
    }

    @Override
    public String operate() {
        return String.valueOf(left - right);
    }

    @Override
    public String getSign() {
        return SIGN;
    }

    @Override
    public boolean isSign(String sign) {
        return SIGN.equals(sign);
    }


}
