package exception;

public class LimitException extends RuntimeException {
    private final int attempts;

    public LimitException(final String message, final int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }
}
