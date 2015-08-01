<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %> 

<div class="container">
<div class="well well-sm">

		<form:form method="post" action="/springMVC01/addDegree/${command.personId}" class="form-horizontal">

        <h2 class="form-signin-heading">Please add Degree information for ${command.firstName} ${command.lastName}</h2>
          <div class="form-group">
      <form:label  class="control-label col-xs-2" path="degreeName">Degree Name:</form:label>
       <div class="col-xs-10">
      <form:input type="degreeName" class="form-control" path="degreeName" placeholder="Degree Name" required="true"/>
      </div>
    </div>
        
          <div class="form-group">
      <form:label  class="control-label col-xs-2" path="university">University:</form:label>
       <div class="col-xs-10">
      <form:input type="university" class="form-control" path="university" placeholder="University" required="true"/>
      </div>
    </div>
        
        <div class="form-group">
      <form:label  class="control-label col-xs-2" path="yearPassedOut">Year Passed:</form:label>
       <div class="col-xs-10">
      <form:input type="yearPassedOut" class="form-control" path="yearPassedOut" placeholder="Year Passed" required="true"/>
      </div>
    </div>
    
         <div class="form-group">
      <form:label  class="control-label col-xs-2" path="major">Major:</form:label>
       <div class="col-xs-10">
      <form:input type="major" class="form-control" path="major" placeholder="Major" required="true"/>
      </div>
    </div>
    
    <div class="form-group">
      <form:label  class="control-label col-xs-2" path="minor">Minor:</form:label>
       <div class="col-xs-10">
      <form:input type="minor" class="form-control" path="minor" placeholder="minor" required="true"/>
      </div>
    </div>
    
      <div class="form-group">
    <button type="submit" class="btn  btn-primary pull-right">Submit Information</button>
    </div>
    
      </form:form>
</div>





</div>
