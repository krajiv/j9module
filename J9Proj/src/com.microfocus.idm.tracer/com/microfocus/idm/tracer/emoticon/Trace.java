/**
 * 
 */
package com.microfocus.idm.tracer.emoticon;

/**
 * @author krajiv
 *
 */
public class Trace {
	private String m_name = null;

	public Trace(String name) {
		m_name = name;
	}

	/**
	 * Print a trace message
	 * 
	 * @param message
	 *            the message to print
	 * @param type
	 *            the message type
	 */
	public void doTrace(String message, TraceType type) {
		StringBuilder sb = new StringBuilder(m_name);
		sb.append(" | ");
		switch (type) {
		case INFOR:
			sb.append(" :-) ");
			break;
		case DEBUG:
			sb.append(" :-\\ ");
			break;
		case ERROR:
			sb.append(" :-( ");
			break;
		default:
			break;
		}
		sb.append(" | ").append(type.toString()).append(" : ").append(message);
		System.out.println(sb.toString());
	}
}
