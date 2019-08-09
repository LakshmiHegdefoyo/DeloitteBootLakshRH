<jsp:include page="header.jsp"/>
  <h3 class="center-align"> Add Employee</h3>
	
  <div class="container" style="border:2px;padding:5%">
    <form class="col s12" action="employee" method="post">
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Enter your name" name="empName" type="text" class="validate">
          <label for="first_name">Name</label>
        </div>
       </div>
     
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Enter date of Birth (DD/MM/YYYY)" name="dob" type="date" class="validate">
          <label for="password">DOB</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Enter Basic Salary" name="sal" type="number" class="validate">
          <label for="email">Salary</label>
        </div>
      </div>
      <input class="waves-effect waves-light btn" type="submit"></input>
    </form>
  </div>

<jsp:include page="footer.jsp"/>