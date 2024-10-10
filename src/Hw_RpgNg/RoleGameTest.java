package Hw_RpgNg;
public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		saber.setAttackSkill(new MortalStrike());
		saber.setDefendSkill(new Parry());
		saber.setMoveSkill(new Run());
		saber.attack();
		saber.move();
		
		archer.setAttackSkill(new MultiShot());
		archer.setDefendSkill(new Parry());
		archer.setMoveSkill(new Run());
		archer.attack();
		archer.move();
	}

}
