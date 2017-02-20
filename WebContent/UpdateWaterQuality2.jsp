<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.WaterQuality,java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"
    prefix="fn" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<% WaterQuality waterQuality = (WaterQuality) request.getAttribute("waterQuality"); %>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Watershed UGA Data Management Portal</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="stylesheet.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
  <div id="navbar">
  <div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
    <div class="container-fluid">
        <div class="navbar-header"><a class="navbar-brand" href="#">Watershed UGA Data Management</a>
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-menubuilder"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse navbar-menubuilder">
            <ul class="nav navbar-nav navbar-left">
                <li><a href="/">Home</a>
                </li>
                 <li> <a href="AddMonitorPoint.jsp">Add Monitoring Point Information</a>
                </li>
                <li><a href="viewData">View Data</a>
                </li>
                <li><a href="https://watershed.uga.edu/">Watershed UGA</a>
                </li>
                <li><a href="/about-us">Login</a>
                </li>
            </ul>
        </div>
    </div>
 </div>
 </div>
 <div class="header-image">
	<p><img src="trailcreek.jpg" width="100%" height="auto"></p>
 </div>
</div>

    <div class="container">

      <div id="heading" class="page">
        <h1> Update Water Quality Data </h1>
        <p>Faculty, staff and students have been collecting data on UGA's streams.Please use the below form to enter data to the database
         </p><br>
      </div>
      
     <div class ="form">

<form   name=updateForm action=updateData method=post>


<c:forEach items="${WATERQUALITIES}" var="waterQuality" varStatus="loop">
<label> Sampled Date :</label>
<input type = text name =SiteCondition value="${waterQuality.getSiteCondition()}"/>
<br/>
 </c:forEach></tbody>
<c:if test="${fn:length(waterQuality) == 0}">
   <p>Did not Find test string<p>
</c:if>				

<input type=text name=SampleDate   value="${waterQuality.getSampleDate()}"  readonly /><br>

<label> Sample Date :</label>
<input type=text name = SampleDate value="${SampleDate}"/>
<input type=text name = SampleDate value="${waterQuality.getSampleDate()}"/>
<br/>

<label> Sampled By :</label>
<input type = text name = SampledBy "${waterQuality.getSampleDate()}"/>
<br/>

<label> Site Condition :</label>
<input type = text name =SiteCondition value=""/>
<br/>

<label> PH :</label>
<input type = text name =PH value=""/>
<br/>

<label> Conductivity :</label>
<input type = text name =Conductivity value=""/>
<br/>

<label> Dissolved Oxygen :</label>
<input type = text name =DissolvedOxygen value=""/>
<br/>

<label> Temperature:</label>
<input type = text name =Temperature value=""/>
<br/>

<label> TURBIDITY :</label>
<input type = text name =Turbidity value=""/>
<br/>

<label> STAGE :</label>
<input type = text name =Stage value=""/>
<br/>

<label> FECAL COLIFORM :</label>
<input type = text name =FecalColiform value=""/>
<br/>

<label> ECOLI :</label>
<input type = text name =Ecoli value=""/>
<br/>

<label> HARDNESS :</label>
<input type = text name =Hardness value=""/>
<br/>

<label> TOTAL-P :</label>
<input type = text name =TotalP value=""/>
<br/>

<label> TOTAL-N:</label>
<input type = text name =Totaln value=""/>
<br/>

<label> TSS :</label>
<input type = text name =Tss value=""/>
<br/>

<label> ARSENIC :</label>
<input type = text name =Arsenic value=""/>
<br/>

<label> COPPER :</label>
<input type = text name =Copper value=""/>
<br/>

<label> Lead :</label>
<input type = text name =Lead value=""/>
<br/>

<label> Zinc :</label>
<input type = text name =Zinc value=""/>
<br/>


<label> Site Name :</label>
<input type = text name =Sitename value=""/>
<br/>

<label> Site Point :</label>
<input type = text name= Sitepoint value=""/>

<br/>
<input type =submit name =submit value="Add Data"/>
</form>

    </div><!-- /.container -->
    
   <div id="veiw">
				<input class ="button" type="button" value="View Data">
				<input class ="button" type="button" value="Watershed UGA HomePage">
				</div>
				<div id="login">
				<br><input class ="button" type="button" value="Login"><br>
				</div>
			
	</div><!-- /end .section.body -->
	
	<div class="footer">
		<p>Watershed UGA 2017 <br><img src="georgia.png" alt="" width="70px" height="auto" /> </p>
		
	</div>	


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    <!--Included to ensure the mobile drop down menu works properly -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script> 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  </body>
</html>
</head>
