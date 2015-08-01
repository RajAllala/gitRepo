<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

     
    <div class="container">    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
               <div class="panel-heading">
                  <div class="panel-title">Sign In</div>
                  
        	   </div>     

                   <div style="padding-top:30px" class="panel-body" >
                    <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                     <form class="form-signin" method="post" action="j_spring_security_check">
                     
                        <div style="margin-bottom: 25px" class="input-group">
                          <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                          <input type="email" id="email" name="email" class="form-control"  placeholder="Enter Email" required="true"/>                                                                  
                        </div>
                                
                     <div style="margin-bottom: 25px" class="input-group">
                           <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                           <input type="password" class="form-control" name="password" id="password" placeholder="Password" required="true"/>
                      </div>
                                    
                                
                     <div class="input-group">
                         <div class="checkbox">
                             <label>
                               <input id="remember" type="checkbox" name="remember" value="1"> Remember me
                              </label>
                              
                         </div>
                         
                     </div>
<div style="float:left; font-size: 80%; position: relative; top:-10px"><a href="forgotpassword">Forgot password?</a></div>
                      <div style="margin-top:10px" class="form-group">
                        <div class="col-sm-12 controls">
                           <button type="submit" class="btn  btn-primary pull-right">SignIn</button>
                        </div>
                      </div>

                   </form>     
			</div>                     
          </div>  
      </div>        
</div>
    