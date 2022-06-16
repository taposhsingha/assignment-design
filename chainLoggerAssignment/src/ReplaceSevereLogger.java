import java.util.logging.Logger;
public class ReplaceSevereLogger extends AbstractLogger{
    private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public ReplaceSevereLogger(int level){
        this.level = level;
    }
    protected void write(String message) {
        logger.severe("Needs to be replaced");
    }
}
