package entities;

import org.bukkit.entity.Player;

public class Player_plugin {
	
	private Player jugador;
	private int kills, Murder;
	private double elo, puntos_xp;
	
	public Player_plugin(Player jugador) {
		this.jugador=jugador;
	}
	
	public void addKills() {
		this.kills++;
	}
	
	public void addMurders()
	{
		this.Murder++;
	}
	
	public int getKills() {
		return this.kills;
	}
	
	public int getMurders()
	{
		return this.Murder;
	}
	
	public Player getJugador() {
		return this.jugador;
	}
}
