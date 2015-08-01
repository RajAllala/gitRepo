<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 

<div class="container">
<div id="signupbox" style="margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
      <div class="panel panel-info">
      <div class="panel-heading">
      <div class="panel-title">Registration</div>
        <div style="float:right; font-size: 85%; position: relative; top:-10px"><a href="<c:url value="/signin"/>">Sign In</a></div>
        	</div>  
        	
             <div class="panel-body" >
            	 <form id="signupform" class="form-horizontal" role="form">
                      
           <div class="form-group">
               <label for="email" class="col-md-3 control-label">Email</label>
                <div class="col-md-9">
                 <input type="email" class="form-control" name="email" placeholder="Email Address">
                  </div>
           </div>
                                    
            <div class="form-group">
                <label for="firstname" class="col-md-3 control-label">First Name</label>
                      <div class="col-md-9">
                      <input type="text" class="form-control" name="firstname" placeholder="First Name">
                      </div>
             </div>

              <div class="form-group">
                  <label for="lastname" class="col-md-3 control-label">Last Name</label>
                         <div class="col-md-9">
                             <input type="text" class="form-control" name="lastname" placeholder="Last Name">
                          </div>
                 </div>

               <div class="form-group">
                    <label for="password" class="col-md-3 control-label">Password</label>
                         <div class="col-md-9">
                            <input type="password" class="form-control" name="passwd" placeholder="Password">
                          </div>
               </div>
               
               <div class="form-group">
                    <label for="phonenumber" class="col-md-3 control-label">Phone Number</label>
                         <div class="col-md-9">
                            <input type="tel" class="form-control" name="passwd" placeholder="Phonenumber">
                          </div>
               </div>
               <div class="form-group">
                    <label for="Address1" class="col-md-3 control-label">Address 1</label>
                         <div class="col-md-9">
                            <input type="text" class="form-control" name="Address 1" placeholder="Address 1">
                          </div>
               </div>
               
               <div class="form-group">
                    <label for="Address 2" class="col-md-3 control-label">Address 2</label>
                         <div class="col-md-9">
                            <input type="text" class="form-control" name="Address 2" placeholder="Address 2">
                          </div>
               </div>
               
               <div class="form-group">
                    <label for="City" class="col-md-3 control-label">City</label>
                         <div class="col-md-9">
                            <input type="text" class="form-control" name="city" placeholder="City">
                          </div>
               </div>
               
                <div class="form-group">
                    <label for="State" class="col-md-3 control-label">State</label>
                         <div class="col-md-9">
                            <input type="text" class="form-control" name="state" placeholder="State">
                          </div>
               </div>
               
               <div class="form-group">
                    <label for="Zip" class="col-md-3 control-label">Zip</label>
                         <div class="col-md-9">
                            <input type="tel" class="form-control" name="zip" placeholder="Zipcode">
                          </div>
               </div>
               
                <div class="form-group">
                    <label for="Country" class="col-md-3 control-label">Country</label>
                         <div class="col-md-9">
                            <input type="text" class="form-control" name="country" placeholder="Country">
                          </div>
               </div>
                                    

	    <div class="form-group">
                  <div class="col-md-offset-3 col-md-9">
                     <button id="btn-signup" type="button" class="btn btn-info"><i class="icon-hand-right"></i> &nbsp Sign Up</button>
                   <span style="margin-left:8px;"></span>  
                   </div>
             </div>
              </form>                                  
              </div>
      
           </div>
       </div>
</div>