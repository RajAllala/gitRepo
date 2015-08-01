<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>


<div class="container">    
<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">Uploaded Documents</div>
  <div class="panel-body">
  </div>
<ul class="nav nav-tabs">
  <li role="presentation" ${trainer}><a href="<c:url value="/trainer"/>">Students Info</a></li>
  <li role="presentation" ${trainer_sendmails}><a href="<c:url value="/trainer_sendmails"/>">Message</a></li>
  <li role="presentation" ${trainerreview_docs}><a href="<c:url value="/trainerreview_docs"/>">Documents Uploaded</a></li>
  <li role="presentation" ${Questions}><a href="<c:url value="/Questions"/>">Q&A</a></li>
  </ul>
</div>



    <div class="row">
        <div class="col-md-12">
            
                <form class="form-horizontal" method="post">
                    <fieldset>
                        <legend class="text-center header">Message</legend>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                            <div class="col-md-6">
                                <textarea class="form-control" id="message" name="message" placeholder="Enter your message here." rows="7"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-12 text-center">
                                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
