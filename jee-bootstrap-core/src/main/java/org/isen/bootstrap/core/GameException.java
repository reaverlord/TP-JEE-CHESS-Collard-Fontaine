package org.isen.bootstrap.core;

/**
 * Created by Romain on 16/01/2017.
 */
public class GameException extends RuntimeException {
    private final String message;

    public GameException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
