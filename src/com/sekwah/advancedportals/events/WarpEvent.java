package com.sekwah.advancedportals.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Cancellable;

import com.sekwah.advancedportals.portalcontrolls.Portal;
 
public final class WarpEvent extends Event implements Cancellable {
	
	/**
	 * Use listeners so you can add new triggers easier and also other plugins can listen for the event
	 *  and add their own triggers
	 */
	
	
    private static final HandlerList handlers = new HandlerList();
    
    private boolean cancelled = false;
	private Player player;
	private String portalName;

	private boolean hasWarped = false;
 
    public WarpEvent(Player player, String portalName) {
    	this.player = player;
    	this.portalName = portalName;
    }
    
    
    /**
     * Returns if the event has been cancelled
     * 
     * @return cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }
 
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }
    
    /**
     * If the 
     * 
     * @param warped
     */
    public void setHasWarped(boolean warped){
    	this.hasWarped = warped;
    }
    
    /**
     * This will return true if another plugin has warped the player(and set this to true)
     * 
     * @return hasWarped
     */
    public boolean getHasWarped(){
    	return hasWarped;
    }
    
    public Player getPlayer(){
    	return player;
    }
    
 
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
}