package Hw_RpgNg;
public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private AttackSkill attackMethod;
	private DefendSkill defendMethod;
	private MoveSkill moveMethod;
	
	public void setAttackSkill(AttackSkill attackMethod) {
		this.attackMethod = attackMethod;
	}
	
	public void setDefendSkill(DefendSkill defendMethod) {
		this.defendMethod = defendMethod;
	}
	
	public void setMoveSkill(MoveSkill moveMethod) {
		this.moveMethod = moveMethod;
	}
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	protected void attack() {
		attackMethod.attack();
	}
	
	protected void move() {
		moveMethod.move();
	}
	
	protected void defend() {
		defendMethod.defend();
	}
}
