/**
 * 
 */
package com.microfocus.idm.app;

import com.microfocus.idm.tracer.Tracer;

/**
 * @author krajiv
 *
 */
public class App 
{
	private Tracer m_trace = null;
	
	public App() 
	{
		m_trace = new Tracer("Demo App");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		App app = new App();
		
		app.execute();
	}
	
	public void execute()
	{
		m_trace.traceInfo("Demo Application starting ...");
		
		m_trace.traceDebug("Hmmm... some debugging messages ... huhhhh");
		
		m_trace.traceError("Ohh ! Got to go now...");
	}

}
