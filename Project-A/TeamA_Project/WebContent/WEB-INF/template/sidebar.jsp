 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 

 <div id="wrapper">

        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        Hello!! Admin
                    </a>
                </li>
                <li>
                    <a href="<c:url value="/admin/dashboard"/>">Dashboard</a>
                </li>
                <li>
                    <a href="<c:url value="/admin/reports"/>">Reports</a>
                </li>
                <li>
                    <a href="<c:url value="/admin/alluser"/>">User Profiles</a>
                </li>
                <li>
                    <a href="<c:url value="/admin/adduser"/>">Add User</a>
                </li>
                <li>
                    <a href="<c:url value="/admin/admin_sendmails"/>">Send Mails</a>
                </li>
                <li>
                    <a href="<c:url value="/admin/review_docs"/>">Review Documents</a>
                </li>
                <li>
                    <a href="<c:url value="/admin/dashboard"/>">Services</a>
                </li>
                <li>
                    <a href="<c:url value="/admin/dashboard"/>">Contact</a>
                </li>
            </ul>
        </div>
        
        
        

<%--         <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                <div class="col-lg-2"></div>
                    <div class="col-lg-10">
                        <h1>Simple Sidebar</h1>
                        <p>This template has a responsive menu toggling system. The menu will appear collapsed on smaller screens, and will appear non-collapsed on larger screens. When toggled using the button below, the menu will appear/disappear. On small screens, the page content will be pushed off canvas.</p>
                        <p>Make sure to keep all page content within the <code>#page-content-wrapper</code>.</p>
                        <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper --> --%>

    </div>

    <!-- /#wrapper -->