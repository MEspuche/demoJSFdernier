package pJSF1CDI.jsf.exos;


import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named
@ApplicationScoped
public class MbInjected implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MbInjected(){
		System.out.println("Injected bean created");
	}
		
	public void show() {
		System.out.println("show injected");
	}

	public String getInjectedData() {
			return "Hello injected";
	}
}
