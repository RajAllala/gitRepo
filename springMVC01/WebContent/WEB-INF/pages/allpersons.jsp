<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    

<div class="jumbotron">
<div class="container">
<h3>${title}</h3>

<span class="pull-right"><a href="<c:url value="/addPerson"/>" class="btn btn-primary" role="button">Add Person</a></span>


</div>
</div>


<div class="container">
<div class="row">
<c:forEach var="person" items="${persons}">

  <div class="col-sm-6 col-md-6">
  <div class="panel panel-default">
  <div class="panel-heading">
    <h3>${person.firstName} ${person.lastName }</h3>
    <h4>Phone Number: ${person.phoneNumber} </h4>
    <h4>Email: ${person.email} </h4>
    </div>
     <div class="panel-body">
    <h3>Person Qualifications</h3>
    <!-- Table -->
  <table class="table">
    <thead>
          <tr>
            <th>Degree Name</th>
            <th>University</th>
            <th>Major</th>
            <th>Year</th>
          </tr>
        </thead>
         <tbody>
  <c:forEach var="degree" items="${person.degrees}">      
          <tr>
            <td>${degree.degreeName}</td>
            <td>${degree.university}</td>
            <td>${degree.major}</td>
            <td>${degree.yearPassedOut}</td>
          </tr>
          </c:forEach> 
          </tbody>
  </table>
    <h3>Person Addresses</h3>
    <!-- Table -->
  <table class="table">
  <thead>
          <tr>
            <th>Address 1</th>
            <th>Address 2</th>
            <th>City</th>
            <th>Country</th>
            <th>Zipcode</th>
          </tr>
        </thead>
         <tbody>
         <c:forEach var="address" items="${person.addresse}">
          <tr>
            <td>${address.address1}</td>
            <td>${address.address2}</td>
            <td>${address.city}</td>
            <td>${address.country}</td>
            <td>${address.zipcode}</td>
          </tr>
          </c:forEach>
          </tbody>
  </table>
    <div class="caption">
    <p><a href="<c:url value="/addDegree"/>/${person.firstName}/${person.lastName}/${person.id}" class="btn btn-primary" role="button">Add Degree</a> <a href="<c:url value="/addAddress"/>/${person.firstName}/${person.lastName}/${person.id}" class="btn btn-success" role="button">Add Address</a></p>
    </div>
  </div>
  </div>
  </div>
  </c:forEach>
  
</div>
