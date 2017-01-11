package com.snowcattle.game.excutor.event;

/**
 * Created by jiangwenping on 17/1/11.
 */
public class UpdateEvent extends Event {
    public UpdateEvent(EventType eventType, EventParam... parms){
        setEventType(eventType);
        setParams(parms);
    }

    public void call() {
        EventParam[] eventParams = getParams();
        System.out.println(eventParams[0].getT() + "float"+ eventParams[1].getT());
    }
}
