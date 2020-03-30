package Players.Thief;

import java.awt.image.BufferedImage;

import Players.Player;

public class Thief extends Player {
	private String skill;
	
	public Thief(BufferedImage img, String name) {
		super(80, 60, 50, 200, name, img);
		this.skill = "hiding";
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		String about = 
				"<html>"
				+ "<body style=\"font-family:'Courier';\">"
				+ "<h2 style=\"align:'center'; color: yellow;\">\"SNEAK PAST AND STAB IT? NO PROBLEM!\"</h2>"
				+ "<p>"
				+ "Luck with minor amount of dexterity, and power are the highlights of<br />"
				+ "being a thief.<br />"
				+ "<br /><br /><br />"
				+ "</p>"
				
				+ "<ul>"
					+ "<li>hp: " + getHp() + "</li>"
					+ "<li>strength: " + getStrength() + "</li>"
					+ "<li>mana: " + getMana() + "</li>"
					+ "<li>speed: " + getSpeed() + "</li>"
					+ "<li>skill: " + this.skill + "</li>"
					+ "<li>xp: " + getXp() + "</li>"
					+ "<li>level: " + getLevel() + "</li>"
				+ "</ul>"
				+ "</body>"
				+ "</html>";
		return about;
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		
	}
}
