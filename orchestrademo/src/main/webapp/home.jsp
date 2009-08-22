<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>

<f:loadBundle basename="com.globecast.web.hms.action.bundle.Resources"
	var="appBundle" />

<h:form id="menuForm">

	<h:outputText value="COUCOU" />
	<h:outputText value="#{sessionBean.userName}" />

	<t:commandLink action="#{myController.showList}" value="Show list" />
	<t:commandLink action="#{myController.addUser}" value="Add User" />

</h:form>