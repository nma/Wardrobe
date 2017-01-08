package io.github.nma.dao;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
public class DaoExceptions {
    public static class NoMatchFound extends Exception {

        public NoMatchFound(String format) {
            super(format);
        }
    }
}
