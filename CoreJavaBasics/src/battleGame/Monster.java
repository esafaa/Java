package battleGame;

public class Monster {
private String name;


public Monster(String name) {
	this.setName(name);
}
public  String attack() {
	return "!^_&^$@+%$* I don't know how to attack!\r\n";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
