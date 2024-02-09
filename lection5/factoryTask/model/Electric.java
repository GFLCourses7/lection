package model;

public class Electric implements Guitar {
    private boolean pluggedIn;

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    public void plugIn(){
        setPluggedIn(true);
        System.out.println("Electric guitar is plugged in now. Try to play now.");
    }

    public void plugOut(){
        setPluggedIn(false);
        System.out.println("Electric guitar is plugged out.");
    }
    @Override
    public void play() {
        if (!pluggedIn) {
            System.out.println("Electric guitar must be plugged into the comb.");
        } else {
            System.out.println("-------playing heavy metal notes-----------");
        }
    }
}
