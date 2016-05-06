/**
 * 
 */
package com.microfocus.idm.tracer;

import com.microfocus.idm.tracer.emoticon.Trace;
import com.microfocus.idm.tracer.emoticon.TraceType;

/**
 * @author krajiv
 *
 */
public class Tracer {
	private Trace m_trace = null;

	public Tracer(String name) {
		m_trace = new Trace(name);
	}

	/**
	 * Trace info messages
	 * 
	 * @param message
	 *            message
	 */
	public void traceInfo(String message) {
		m_trace.doTrace(message, TraceType.INFOR);
	}

	/**
	 * Trace debug message
	 * 
	 * @param message
	 *            message
	 */
	public void traceDebug(String message) {
		m_trace.doTrace(message, TraceType.DEBUG);
	}

	/**
	 * Trace error message
	 * 
	 * @param message
	 *            message
	 */
	public void traceError(String message) {
		m_trace.doTrace(message, TraceType.ERROR);
	}
	
	public static void main(String[] args) 
	{
		if (args.length < 1) {
			System.err.println("Usage : Specify at least one parameter...");
		}
		Tracer tracer = new Tracer("Tracer");
		for (int i=0; i<args.length; i++) {
			tracer.traceDebug(args[i]);
			tracer.traceInfo(args[i]);
			tracer.traceError(args[i]);
		}
	}
}
