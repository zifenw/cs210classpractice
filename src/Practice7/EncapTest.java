package Practice7;

public class EncapTest {
	private String name;
	private int age;
	private String player;
	
	EncapTest(String setName, int setAge, String setPlayer){
		this.name = setName; //setName(setName);
		this.age = setAge;
		this.player = setPlayer;
	}
	/*public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPlayer(String player) {
		this.player = player;
	}*/
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPlayer() {
		return player;
	}
}
