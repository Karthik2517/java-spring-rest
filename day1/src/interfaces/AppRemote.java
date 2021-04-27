package interfaces;

public interface AppRemote {

	String version = "2.0.1";

	void on();

	public void off();

	public void changeChannel(int channel);
	
	default void update() {
		throw new IllegalStateException("not Yet implemented..");
	};

}
