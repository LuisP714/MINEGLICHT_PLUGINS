package entities;

import java.util.ArrayList;

public class Team_plugin {
	private ArrayList<Player_plugin> jugador;
	private String team_name;
	
	public Team_plugin(String team_name) {
		this.jugador=new ArrayList<Player_plugin>();
		this.team_name=team_name;
	}
	
	public boolean contentPlayer(String p) {
		for(int i=0;i<jugador.size();i++) {
			if(jugador.get(i).getJugador().getName().equals(p)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addPlayer(Player_plugin jugador) {
		if(!contentPlayer(jugador.getJugador().getName())) {
			this.jugador.add(jugador);
			return true;
		}else{
			return false;
		}
	}
	
	public boolean removePlayer(Player_plugin j) {
		for(int i=0;i<jugador.size();i++) {
			if(jugador.get(i).getJugador().getName().equals(j)) {
				this.jugador.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Player_plugin> getPlayers(){
		return jugador;
	}
	
	public int getCantidadPlayers() {
		return jugador.size();
	}
	
	public int getTeamKills() {
		int kills=0;
		for(Player_plugin p:jugador) {
			kills=kills+p.getKills();
		}
		return kills;
	}
}
