/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  twinskingdom.events;

/**
 * This interface defines the common methods for handling a game event source.
 */
public interface GameEventSource {

    /**
     * Adds a listener for game events generated by the source.
     * @param listener The listener interested in this source events
     */
    public void addGameEventListener(GameEventListener listener);

    /**
     * Removes a listener, so it will not be notified anymore.
     * @param listener Listener to be removed
     */
    public void removeGameEventListener(GameEventListener listener);

    /**
     * Launches the given event and notifies all the subscribed listeners.
     * @param evt Event to be launched
     */
    void launchGameEvent(GameEvent evt);

}
