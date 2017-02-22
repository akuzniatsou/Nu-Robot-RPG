package models;

import enums.*;

public class Leg extends Part{
	
	public Leg(){
		
	}
	
	public Leg(String name, Rarity rare, int weight){
		setName(name);
		setRarity(rare);
		setWeight(weight);
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Leg\n");
		sb.append(getName());
		sb.append("\n");
		sb.append("Rarity : ");
		sb.append(getRarity().toString().charAt(0));
		sb.append(getRarity().toString().substring(1, getRarity().toString().length()).toLowerCase());
		sb.append("\n");
		sb.append("Weight : ");
		sb.append(getWeight());
		sb.append(" tons");
		return sb.toString();
	}
}
