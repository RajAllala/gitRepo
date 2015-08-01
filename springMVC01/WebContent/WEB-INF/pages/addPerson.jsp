<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %> 

<div class="container">
<div class="well well-sm">

		<form:form method="post" action="/springMVC01/addPerson" class="form-horizontal">

        <h2 class="form-signin-heading">Please add Person information</h2>
          <div class="form-group">
      <form:label  class="control-label col-xs-2" path="firstName">First Name:</form:label>
       <div class="col-xs-10">
      <form:input type="firstName" class="form-control" path="firstName" placeholder="First Name" required="true"/>
      </div>
    </div>
        
          <div class="form-group">
      <form:label  class="control-label col-xs-2" path="lastName">Last Name:</form:label>
       <div class="col-xs-10">
      <form:input type="lastName" class="form-control" path="lastName" placeholder="Last Name" required="true"/>
      </div>
    </div>
        
           <div class="form-group">
      <form:label  class="control-label col-xs-2" path="phoneNumber">Phone Number:</form:label>
       <div class="col-xs-10">
      <form:input type="phoneNumber" class="form-control" path="phoneNumber" placeholder="Phone Number" required="true"/>
      </div>
    </div>
         <div class="form-group">
      <form:label  class="control-label col-xs-2" path="email">Email Address:</form:label>
       <div class="col-xs-10">
      <form:input type="id" class="form-control" path="email" placeholder="Email Address" required="true"/>
      </div>
    </div>
      <div class="form-group">
    <button type="submit" class="btn  btn-primary pull-right">Submit Information</button>
    </div>
    
      </form:form>
</div>



</div>

