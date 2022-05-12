package Exo10;

public class BanqueException extends Exception{

    /**
     * @param: serialVersionUID : long
     */
    //Attributes
    private static final long serialVersionUID = 1L;



    //Constructor
    public BanqueException() {
    }

    public BanqueException(String message) {
        super(message);
    }

    public BanqueException(String message, Throwable cause) {
        super(message, cause);
    }

    public BanqueException(Throwable cause) {
        super(cause);
    }

    public BanqueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
