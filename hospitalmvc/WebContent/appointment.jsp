!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br>
<center><h1>Welcome to Appointment Page</h1>
<br><br>
<a href="./patient_home.html">Home</a> |
<a href="./patient_profile.jsp">Profile</a> |
<a href="./appointment.jsp">Appointment</a> |
<a href="appointment_status.jsp">Appointment status</a> |
<a href="./index.html">Logout</a>
</center>
<br><br>
<form action="./apply_appointment" method="post" align="center">
<input type="text" name="pname" placeholder="Enter patient name ">
<input type="number" name="phone" placeholder="Enter phone number">
<input type="email"  name="email" placeholder="Enter emial">
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<select name="blood_group">
<option value="A+">A+</option>
<option value="A-">A-</option>
<option value="B+">B+</option>
<option value="B-">B-</option>
<option value="AB+">AB+</option>
<option value="AB-">AB-</option>
<option value="O+">O+</option>
<option value="O-">O-</option>
</select>
<select name="specialist">
<option value="Dentist">Dentist</option>
<option value="Cardio">Cardio</option>
<option value="ENT">ENT</option>
</select>
<input type="date" name="date_of_appointment" placeholder="select date for appointment">
<input type="time" name="time_of_appointment" placeholder="select time for appointment">
<input type="submit" value="apply"> 
</form> 
</body>
</html>