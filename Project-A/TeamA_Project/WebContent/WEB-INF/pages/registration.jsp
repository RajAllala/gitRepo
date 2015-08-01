<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="container">
<div id="signupbox" style="margin-top:50px" class="mainbox col-md-8 col-md-offset-3 col-sm-6 col-sm-offset-2">
      <div class="panel panel-info">
      <div class="panel-heading">
      <div class="panel-title">Registration</div>
	</div>  
        	
       <form:form method="post" action="registration" class="form-horizontal">


        <h2 class="form-signin-heading">Please Provide Your Details</h2>
          <div class="form-group">
             <div class="panel-body" >
          <div class="form-group">
      

          <div class="form-group">  
      <form:label  class="control-label col-xs-3" path="first_name">First name</form:label>
       <div class="col-xs-7">

      <form:input type="firstname" class="form-control" path="first_name" placeholder="firstname" required="true"/>
	  <div class="col-xs-2">
	   </div>
      </div>
   
       
           <form:label  class="control-label col-xs-3" path="last_name">LastName</form:label>
       <div class="col-xs-7">
      <form:input type="lastname" class="form-control" path="last_name" placeholder="Last Name" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>
   
    
           <form:label  class="control-label col-xs-3" path="email_id">Email</form:label>
       <div class="col-xs-7">
      <form:input type="email" class="form-control" path="email_id"  readonly="readonly"/>
	    <div class="col-xs-2">
	   </div>
      </div>
    
    
           <form:label  class="control-label col-xs-3" path="password">password</form:label>
       <div class="col-xs-7">
      <form:input type="password" class="form-control" path="password" placeholder="Pass word" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>

    
     <form:label for="dtp_input2" path="dob" class="col-xs-3 control-label">Date Of Birth</form:label>
     <div class="col-xs-0">
     </div>
          <div class="input-group date form_date col-xs-7" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
           
            <form:input class="form-control" path="dob" size="16" type="text" value="" />
            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            
       </div>


	<form:label  class="control-label col-xs-3" path="address">Address</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" path="address" placeholder="Address" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>
                
           <form:label  class="control-label col-xs-3" path="university">University</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" path="university" placeholder="University" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>

   <form:label  class="control-label col-xs-3" path="degree">Degree</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" path="degree" placeholder="degree" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>


 <form:label class="control-label col-xs-3"  path="tech_type">Technology Type</form:label>
  
   <div class="col-xs-7">
   <form:select name="tech_type" path="tech_type">
   
   <form:option value="NONE" label="--- Select ---"/>
   <form:option value="Java" label="Java"/>
   <form:option value=".Net" label=".Net"/>
   <form:option value="SQL" label="SQL"/>
   <form:option value="Unix" label="Unix"/>
   </form:select>
   </div>
	<div class="col-xs-12">
	 </div>
	 
	    <form:label  class="control-label col-xs-3" path="city">City</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" path="city" placeholder="City" required="true"/>
        
        <div class="col-xs-2">
	   </div>
      </div>
    
    
    <form:label  class="control-label col-xs-3" path="state">State</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" path="state" placeholder="State" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>
    
    
     <form:label  class="control-label col-xs-3" path="country">Country</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" path="country" placeholder="country" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>
      
      <form:label  class="control-label col-xs-3" path="zip">ZipCode</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" path="zip" placeholder="zipcode" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>
      
    
    <form:label  class="control-label col-xs-3" path="phone_number">phone_number</form:label>
       <div class="col-xs-7">
      <form:input type="text" class="form-control" path="phone_number" placeholder="phone_number" required="true"/>
	    <div class="col-xs-2">
	   </div>
      </div>
      
 <form:label  class="col-xs-3 control-label"  name="visa_status" path="visa_status">Visa Status</form:label>
 <div class="col-xs-7">
    <form:select name="visa_status" path="visa_status">
    
   <form:option value="NONE" label="--- Select ---"/>
   <form:option value="F1" label="F1"/>
   <form:option value="H1B" label="H1B"/>
   <form:option value="OPT" label="OPT"/>

   </form:select>
   </div>	 
	<div class="col-xs-2">
	   </div>
	   
 </div>
     </div>
	</div>
 <div class="col-xs-7">
	    <div class="form-group" >
	<br>   
    <button type="submit" class="btn  btn-primary pull-right">Submit Information</button>
    </div>
    </div>
                                              
    </div>  </form:form>
   </div>
            
             </div>
             </div>
                   


 
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-datetimepicker.js"/>"></script>
       
<script type="text/javascript">
       
       $('.form_date').datetimepicker({
           language:  'fr',
           weekStart: 1,
           todayBtn:  1,
   		autoclose: 1,
   		todayHighlight: 1,
   		startView: 2,
   		minView: 2,
   		forceParse: 0
       });
       
</script>