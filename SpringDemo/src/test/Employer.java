package test;

public class Employer {
	private Human human;
	public Employer(Human human){
		this.human = human;
	}
	public void wantDo(){
		human.doWork();
	}
}
