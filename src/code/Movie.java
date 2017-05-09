package code;

import java.util.logging.Logger;

/**
 *
 * @author DominikSchmitt
 */
public class Movie {

    /**
     *
     */
    public static final int CHILDRENS = 2;

    /**
     *
     */
    public static final int REGULAR = 0;

    /**
     *
     */
    public static final int NEW_RELEASE = 1;
    private final String title;
    private int priceCode;

    /**
     *
     * @param newtitle
     * @param newpriceCode
     */
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }

    /**
     *
     * @return
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     *
     * @param arg
     */
    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    /**
     *
     * @return
     */
    public String getTitle (){
        return title;
    };
    private static final Logger LOG = Logger.getLogger(Movie.class.getName());
}