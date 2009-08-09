package fr.ippon.orchestrademo.bean;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * We will use this bean as a session instead of the HTTP Session, as it is a
 * managed bean, it is easier to retrieve via JSF.
 * 
 * As it is session scoped, we will store the minimum data here.
 * 
 * @author sfoubert
 * 
 */
public class SessionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(SessionBean.class);
	
	private String userName = "seb";

	public SessionBean() {

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
