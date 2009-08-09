<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:loadBundle basename="com.globecast.web.hms.action.bundle.Resources"
	var="appBundle" />

<div><h:form>

	<h:outputText value="COUCOU" />
	<h:outputText value="#{sessionBean.userName}" />

</h:form></div>