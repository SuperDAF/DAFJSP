package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Karta_Klub {
	
	private int idklub;
	private int idsport;
	private int idliga;
	private String kjmeno;
	private String adresar;
	private String dir;
	private int stav;
	private String www;
	
	public Karta_Klub(ResultSet rs)
	{
		try {
			setIdklub(rs.getInt("idklub"));
			setIdsport(rs.getInt("idsport"));
			setIdliga(rs.getInt("idliga"));
			setKjmeno(rs.getString("kjmeno"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public int getIdklub() {
		return idklub;
	}

	public void setIdklub(int idklub) {
		this.idklub = idklub;
	}

	public int getIdsport() {
		return idsport;
	}

	public void setIdsport(int idsport) {
		this.idsport = idsport;
	}

	public int getIdliga() {
		return idliga;
	}

	public void setIdliga(int idliga) {
		this.idliga = idliga;
	}

	public String getKjmeno() {
		return kjmeno;
	}

	public void setKjmeno(String kjmeno) {
		this.kjmeno = kjmeno;
	}

	public String getAdresar() {
		return adresar;
	}

	public void setAdresar(String adresar) {
		this.adresar = adresar;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public int getStav() {
		return stav;
	}

	public void setStav(int stav) {
		this.stav = stav;
	}

	public String getWww() {
		return www;
	}

	public void setWww(String www) {
		this.www = www;
	}
	
	
	
	

}
