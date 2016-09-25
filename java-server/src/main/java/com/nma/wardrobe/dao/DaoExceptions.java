package com.nma.wardrobe.dao;

/**
 * Created by nma on 25/09/16.
 */
public class DaoExceptions {
    public static class NoMatchFound extends Exception {

        public NoMatchFound(String format) {
            super(format);
        }
    }
}
