package model.exceptions;

public class WithdrawException extends Exception {
    private static final long serialVersionUID = 0l;

    public WithdrawException(String message) {
        super("Withdraw exception: " + message);
    }
}
