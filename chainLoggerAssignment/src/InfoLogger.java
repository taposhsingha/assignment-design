import java.util.logging.Logger;


public class InfoLogger extends AbstractLogger{
    private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public InfoLogger(int level){
        this.level = level;
    }
    protected void write(String message) {
        logger.info("This is car info");
    }
}
