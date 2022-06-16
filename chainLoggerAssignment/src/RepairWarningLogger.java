import java.util.logging.Logger;

public class RepairWarningLogger extends AbstractLogger{
    private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public RepairWarningLogger(int level){
        this.level = level;
    }
    protected void write(String message) {
        logger.warning("Car needs to be repaired");
    }
}
