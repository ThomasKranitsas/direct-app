<%--
  - Author: TCSASSEMBLER
  - Version: 1.0
  - Copyright (C) 2012 TopCoder Inc., All Rights Reserved.
  -
  - Description: This page provides the 6th step of analytics project creation.
  -
  - Version 1.0 (Release Assembly - TopCoder Cockpit Start New Analytics Projects Flow)
--%>

<%@ include file="/WEB-INF/includes/taglibs.jsp" %>
<div id="newAnalyticsProjectStep6" class="hide analytics newProjectStep analyticsSteps">

    <!-- step title -->
    <div class="stepTitle">
        <h3><span>6</span>Who can access your Project?</h3>
        <a href='<s:url action="dashboardActive" namespace="/"/>' class="button4">Back to Dashboard</a>
    </div>
    <!-- End .stepTitle -->

    <%@ include file="/WEB-INF/includes/project/newProject/assign-user-access.jsp" %>
</div>