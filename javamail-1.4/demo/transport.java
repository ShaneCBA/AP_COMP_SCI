/*
 * @(#)transport.java	1.13 06/04/17
 *
 * Copyright 1997-2006 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * 
 * - Redistribution in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * 
 * Neither the name of Sun Microsystems, Inc. or the names of contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 * 
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES,
 * INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN AND
 * ITS LICENSORS SHALL NOT BE LIABLE FOR ANY DAMAGES OR LIABILITIES
 * SUFFERED BY LICENSEE AS A RESULT OF  OR RELATING TO USE, MODIFICATION
 * OR DISTRIBUTION OF THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL
 * SUN OR ITS LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR
 * FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE
 * DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY,
 * ARISING OUT OF THE USE OF OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS
 * BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 * 
 * You acknowledge that Software is not designed, licensed or intended
 * for use in the design, construction, operation or maintenance of any
 * nuclear facility.
 */

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.event.*;
import javax.activation.*;

/**
 * transport is a simple program that creates a message, explicitly
 * retrieves a Transport from the session based on the type of the
 * address (it's InternetAddress, so SMTP will be used) and sends 
 * the message.
 *
 * usage: <code>java transport <i>"toaddr1[, toaddr2]*"  from smtphost 
 * true|false</i></code><br>
 * where <i>to</i> and <i>from</i> are the destination and
 * origin email addresses, respectively, and <i>smtphost</i>
 * is the hostname of the machine that has the smtp server
 * running. The <i>to</i> addresses can be either a single email
 * address or a comma-separated list of email addresses in
 * quotes, i.e. "joe@machine, jane, max@server.com"
 * The last parameter either turns on or turns off
 * debugging during sending.
 *
 * @author Max Spivak
 */
public class transport implements ConnectionListener, TransportListener {
    static String msgText = "This is a message body.\nHere's the second line.";
    static String msgText2 = "\nThis was sent by transport.java demo program.";

    public static void main(String[] args) {
	Properties props = new Properties();
	// parse the arguments
	InternetAddress[] addrs = null;
	InternetAddress from;
	boolean debug = false;
	if (args.length != 4) {
	    usage();
	    return;
	} else {
	    props.put("mail.smtp.host", args[2]);
	    if (args[3].equals("true")) {
		debug = true;
	    } else if (args[3].equals("false")) {
		debug = false;
	    } else {
		usage();
		return;
	    }

	    // parse the destination addresses
	    try {
		addrs = InternetAddress.parse(args[0], false);
		from = new InternetAddress(args[1]);
	    } catch (AddressException aex) {
		System.out.println("Invalid Address");
		aex.printStackTrace();
		return;
	    }
	}
	// create some properties and get a Session
	Session session = Session.getInstance(props, null);
	session.setDebug(debug);

	transport t = new transport();
	t.go(session, addrs, from);
    }

    public transport() {}

    public void go(Session session, InternetAddress[] toAddr,
				InternetAddress from) {
	Transport trans = null;

	try {
	    // create a message
	    Message msg = new MimeMessage(session);
	    msg.setFrom(from);
	    msg.setRecipients(Message.RecipientType.TO, toAddr);
	    msg.setSubject("JavaMail APIs transport.java Test");
	    msg.setSentDate(new Date());  // Date: header
	    msg.setContent(msgText+msgText2, "text/plain");
	    msg.saveChanges();

	    // get the smtp transport for the address
	    trans = session.getTransport(toAddr[0]);

	    // register ourselves as listener for ConnectionEvents 
	    // and TransportEvents
	    trans.addConnectionListener(this);
	    trans.addTransportListener(this);

	    // connect the transport
	    trans.connect();

	    // send the message
	    trans.sendMessage(msg, toAddr);

	    // give the EventQueue enough time to fire its events
	    try {Thread.sleep(5);}catch(InterruptedException e) {}

	} catch (MessagingException mex) {
	    // give the EventQueue enough time to fire its events
	    try {Thread.sleep(5);}catch(InterruptedException e) {}

	    mex.printStackTrace();
	    System.out.println();
	    Exception ex = mex;
	    do {
		if (ex instanceof SendFailedException) {
		    SendFailedException sfex = (SendFailedException)ex;
		    Address[] invalid = sfex.getInvalidAddresses();
		    if (invalid != null) {
			System.out.println("    ** Invalid Addresses");
			if (invalid != null) {
			    for (int i = 0; i < invalid.length; i++) 
				System.out.println("         " + invalid[i]);
			}
		    }
		    Address[] validUnsent = sfex.getValidUnsentAddresses();
		    if (validUnsent != null) {
			System.out.println("    ** ValidUnsent Addresses");
			if (validUnsent != null) {
			    for (int i = 0; i < validUnsent.length; i++) 
				System.out.println("         "+validUnsent[i]);
			}
		    }
		    Address[] validSent = sfex.getValidSentAddresses();
		    if (validSent != null) {
			System.out.println("    ** ValidSent Addresses");
			if (validSent != null) {
			    for (int i = 0; i < validSent.length; i++) 
				System.out.println("         "+validSent[i]);
			}
		    }
		}
		System.out.println();
		if (ex instanceof MessagingException)
		    ex = ((MessagingException)ex).getNextException();
		else
		    ex = null;
	    } while (ex != null);
	} finally {
	    try {
		// close the transport
		trans.close();
	    } catch (MessagingException mex) { /* ignore */ }
	}
    }

    // implement ConnectionListener interface
    public void opened(ConnectionEvent e) {
	System.out.println(">>> ConnectionListener.opened()");
    }
    public void disconnected(ConnectionEvent e) {}
    public void closed(ConnectionEvent e) {
	System.out.println(">>> ConnectionListener.closed()");
    }

    // implement TransportListener interface
    public void messageDelivered(TransportEvent e) {
	System.out.print(">>> TransportListener.messageDelivered().");
	System.out.println(" Valid Addresses:");
	Address[] valid = e.getValidSentAddresses();
	if (valid != null) {
	    for (int i = 0; i < valid.length; i++) 
		System.out.println("    " + valid[i]);
	}
    }
    public void messageNotDelivered(TransportEvent e) {
	System.out.print(">>> TransportListener.messageNotDelivered().");
	System.out.println(" Invalid Addresses:");
	Address[] invalid = e.getInvalidAddresses();
	if (invalid != null) {
	    for (int i = 0; i < invalid.length; i++) 
		System.out.println("    " + invalid[i]);
	}
    }
    public void messagePartiallyDelivered(TransportEvent e) {
	// SMTPTransport doesn't partially deliver msgs
    }

    private static void usage() {
	System.out.println("usage: java transport \"<to1>[, <to2>]*\" <from> <smtp> true|false\nexample: java transport \"joe@machine, jane\" senderaddr smtphost false");
    }
}
