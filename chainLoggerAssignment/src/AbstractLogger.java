public abstract class AbstractLogger {
    protected int level;
    public static int REPAIR_INFO =1;
    public static int CAR_REPAIR_FINE =2;
    public static int CAR_REPAIR_WARNING =3;
    public static int CAR_REPAIR_SEVERE =4;
    protected AbstractLogger nextLogger;
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }
    abstract protected void write(String message);
}
