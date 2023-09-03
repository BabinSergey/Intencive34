package ru.aston.babin_sa.task1.exception;

public class ZeroTicketsException extends Exception{
    private int codeError;
    private String descriptionError;

    public ZeroTicketsException(int codeError, String descriptionError) {
        this.codeError = codeError;
        this.descriptionError = descriptionError;
    }

    public int getCodeError() {
        return codeError;
    }

    public String getDescriptionError() {
        return descriptionError;
    }


}
