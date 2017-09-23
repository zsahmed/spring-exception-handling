package com.zakahmed.exceptions;

/**
 * Created by zahmed on 9/23/17.
 */
public class GundamModelKitNotFoundException extends RuntimeException {

    public GundamModelKitNotFoundException(int id) {

        super("GundamModelKit with id: " + id + " was not found.");
    }
}
