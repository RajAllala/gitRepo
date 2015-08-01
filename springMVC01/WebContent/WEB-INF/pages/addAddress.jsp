<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>  
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>  


<div class="container">
<div class="well well-sm">

		<form:form method="post" action="/springMVC01/addAddress/${command.personID}" class="form-horizontal">

        <h2 class="form-signin-heading">Please add Address information for ${command.firstname} ${command.lastname}</h2>
          <div class="form-group">
      <form:label  class="control-label col-xs-2" path="address1">Address 1:</form:label>
       <div class="col-xs-10">
      <form:input type="firstName" class="form-control" path="address1" placeholder="Address 1" required="true"/>
      </div>
    </div>
        
          <div class="form-group">
      <form:label  class="control-label col-xs-2" path="address2">Address 2:</form:label>
       <div class="col-xs-10">
      <form:input type="lastName" class="form-control" path="address2" placeholder="Address 2" required="true"/>
      </div>
    </div>
        
           <div class="form-group">
      <form:label  class="control-label col-xs-2" path="city">City:</form:label>
       <div class="col-xs-10">
      <form:input type="phoneNumber" class="form-control" path="city" placeholder="city" required="true"/>
      </div>
    </div>
         <div class="form-group">
      <form:label  class="control-label col-xs-2" path="country">Country:</form:label>
       <div class="col-xs-10">
      <form:input type="id" class="form-control" path="country" placeholder="Country" required="true"/>
      </div>
    </div>
    
    <div class="form-group">
      <form:label  class="control-label col-xs-2" path="zipcode">zipcode:</form:label>
       <div class="col-xs-10">
      <form:input type="id" class="form-control" path="zipcode" placeholder="zipcode" required="true"/>
      </div>
    </div>
    
      <div class="form-group">
    <button type="submit" class="btn  btn-primary pull-right">Submit Information</button>
    </div>
    
      </form:form>
</div>



</div>