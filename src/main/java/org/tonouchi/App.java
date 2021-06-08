package org.tonouchi;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Do nothing.
     */
    protected App() { }

    /**
     * Do add.
     * @param a num 1
     * @param b num 2
     * @return a + b
     */
    public int add(final int a, final int b) {
        return a + b;
    }

    /**
     * Do add 2.
     * @param a num 1
     * @param b num 2
     * @return a + b
     */
    public int add2(final int a, final int b) {
        return a + b;
    }

    /**
     * Do add conditionally.
     * @param a num1
     * @param b num2
     * @return a + b
     */
    public int add3(final int a, final int b) {
        if (a > b) {
            throw new IllegalArgumentException("ERROR!!!");
        }
        return a + b;
    }
}
