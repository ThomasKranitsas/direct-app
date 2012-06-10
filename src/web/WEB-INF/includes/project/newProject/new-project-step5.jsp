<%--
  - Author: TCSASSEMBLER
  - Version: 1.0
  - Copyright (C) 2011 TopCoder Inc., All Rights Reserved.
  -
  - Description: This page provides the new create new project step 5.
  -
  - Version 1.0 (Release Assembly - TopCoder Cockpit Start A New Project Revamp R1 v1.0)
  -
  - Version 1.1 (Release Assembly - TopCoder Cockpit Start New Analytics Projects Flow) change notes:
  -              Updated to use the common assign-user-access.jsp file.
--%>
<%@ include file="/WEB-INF/includes/taglibs.jsp" %>
<div id="newProjectStep5" class="hide newProjectStep">
    <!-- step title -->
    <div class="stepTitle">
        <h3><span>5</span>Who can access your Project?</h3>
         <a href='<s:url action="dashboardActive" namespace="/"/>' class="button4">Back to Dashboard</a>
    </div>
    <!-- End .stepTitle -->

    <%@ include file="/WEB-INF/includes/project/newProject/assign-user-access.jsp" %>    
</div>
<!-- End #stepContainer -->