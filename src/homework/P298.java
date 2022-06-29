package homework;

class Player {
	private PlayerLevel level;

	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
}

abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();

	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}

class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump �� �� ������.");
	}

	@Override
	public void turn() {
		System.out.println("Turn �� �� ������.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** �ʺ��� ���� �Դϴ�. *****");
	}

}

class AdvancedLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("Turn �� �� ������.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** �߱��� ���� �Դϴ�. *****");
	}
}

class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** ����� ���� �Դϴ�. *****");
	}
}

public class P298 {
	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
