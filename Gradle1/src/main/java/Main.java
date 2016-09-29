import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AbstractModule() {

			@Override
			protected void configure() {
				this.bind(ITracker.class).to(CTracker.class);
			}
			
		});
		Starter st = injector.getInstance(Starter.class);
		st.run();
	}

}
