package com.jumbo.storelocator.exception;

/**
 * Created by tobi.oladimeji on 09/12/2019
 */
public class Error {
    private String fieldName;
    private String message;

    public Error() {
    }

    public Error(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return "Error{fieldName='" + this.fieldName + '\'' + ", message='" + this.message + '\'' + '}';
    }
}
