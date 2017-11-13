package fr.istic.m1.aco.miniediteur.v1;

/**
 * @(#) MonAppli.java
 */

public class MonAppli
{
	private MonIhmimpl monIHM;
	
	private MoteurEditionImp monMoteur;
	
	public void copy(){
		monIHM.setCommand(new Copier(monMoteur));
	}
	
	public void paste(){
		monIHM.setCommand(new Coller(monMoteur));
	}
	
	public void cut(){
		monIHM.setCommand(new Couper(monMoteur));
	}
	
	public void insText(){
		monIHM.setCommand(new insTxt(monMoteur));
	}
	
	public void delete(){
		monIHM.setCommand(new Effacer(monMoteur));
	}
}
