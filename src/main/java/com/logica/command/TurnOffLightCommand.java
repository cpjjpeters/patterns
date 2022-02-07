package com.logica.command;
/** The Command for turning off the light */
public class TurnOffLightCommand implements Command{
    private Light theLight;
    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }
    public void execute(){
        theLight.turnOff();
    } }