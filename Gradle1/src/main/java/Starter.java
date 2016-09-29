import com.google.inject.Inject;

public class Starter {
	@Inject
	ITracker tr;
	
	public void run() {
		tr.issue("xxxx-yyy");
	}
}
