public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    private String periodo;
    private int initialHour;
    private int warning;
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
public ClockDisplay()
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        periodo = "AM";
        warning = 0;
        initialHour = 0;
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, String periodo)
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        setTime(hour, minute, periodo);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
            warning += 1;
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
public void setTime(int hour, int minute, String periodo)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        this.periodo = periodo;
        initialHour = hour;
        warning = 0;
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        if((initialHour + warning) == hours.getValue()){
                displayString = hours.getDisplayValue() + ":" + 
                                minutes.getDisplayValue() + " " + periodo;
        } else {
                if(periodo.equals("AM")){
                        displayString = hours.getDisplayValue() + ":" + 
                                        minutes.getDisplayValue() + " " + "PM";
                } else {
                        displayString = hours.getDisplayValue() + ":" + 
                                        minutes.getDisplayValue() + " " + "AM";
                }

        }
    }
}
