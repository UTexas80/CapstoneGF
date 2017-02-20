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

<table>
<thead>
      <%--<tr>
<th>      </th>
<th>Sample Date</th>
<th>Sampled By</th>
<th>Site Condition</th>
<th>PH</th>
<th>Conductivity</th>
<th>Dissolved Oxygen</th>
<th>Temperature</th>
<th>Turbidity</th>
<th>Stage</th>
<th>Fecal Coliform</th>
<th>Ecoli</th>
<th>Hardness</th>
<th>TotalP</th>
<th>TotalN</th>
<th>Tss</th>
<th>Arsenic</th>
<th>Copper</th>
<th>Lead</th>
<th>Zinc</th>
<th>TETRACHLOROETHENE</th>
<th>TRICHLOROETHANEa </th>
<th>DICHLOROETHANE</th>
<th>DICHLOROETHENEa</th>
<th>DICHLOROBENZENE</th>
<th>DICHLOROETHANEa</th>
<th>DICHLOROPROPANE</th>
<th>DIMETHYLBENZENEa</th>
<th>DICHLOROBENZENEb</th>
<th>DICHLOROBENZENEc</th>
<th>ACROLEIN</th>
<th>ACRYLONITRILE</th>
<th>BENZENE</th>
<th>BROMODICHLOROMETHANE</th>
<th>BROMOFORM</th>
<th>BROMOMETHANE</th>
<th>CARBONTETRACHLORIDE</th>
<th>CHLOROBENZENE</th>
<th>CHLOROETHANEa</th>
<th>CHLOROFORM</th>
<th>CHLOROMETHANE</th>
<th>CISDICHLOROPROPENE</th>
<th>DIBROMOCHLOROMETHANE</th>
<th>ETHYLBENZENE</th>
<th>METHYLENECHLORIDE</th>
<th>TETRACHLOROETHENEPCE</th>
<th>TOLUENE</th>
<th>TRANSDICHLOROETHENEa</th>
<th>TRANSDICHLOROPROPENEb</th>
<th>TRICHLOROETHENETCE</th>
<th>TRICHLOROFLUOROMETHANEFREON</th>
<th>VINYLCHLORIDE</th>
<th>XYLENESMP</th>

<th>Site Name</th>
<th>Site Point</th> --%>
</thead>
<tbody> <c:forEach items="${WATERQUALITIES}" var="waterQuality" >

	<label>Sample Date: </label>
	<input type = text name = SampleDate value="${waterQuality.getSampleDate()}"/><br>
	
	<label>Sampled By: </label>
	<input type = text name = SampledBy  value="${waterQuality.getSampledBy()}"/><br>
	
	<label>Site Condition: </label>
	<input type = text name =SiteCondition  value="${waterQuality.getSiteCondition()}"/><br>
	
	<label>PH: </label>
	<input type = text name =PH value="${waterQuality.getPH()}"/><br>
	
	<label>Conductivity: </label>
	<input type = text name =Conductivity value="${waterQuality.getConductivity()}"/><br>
	
	<label>Dissolved Oxygen: </label>
	<input type = text name =DissolvedOxygen value="${waterQuality.getDissolvedOxygen()}"/><br>
	
	<label>Temperature: </label>
	<input type = text name =Temperature value="${waterQuality.getTemperature()}"/><br>
	
	<label>Turbidity: </label>
	<input type = text name =Turbidity value="${waterQuality.getTurbidity()}"/><br>
	
	<label>Stage: </label> 		
	<input type = text name =Stage value="${waterQuality.getStage()}"/><br>
	
	<label>Fecal Coliform: </label>
	<input type = text name =FecalColiform value="${waterQuality.getFecalColiform()}"/><br>
	
	<label>Ecoli: </label> 	
	<input type = text name =Ecoli value="${waterQuality.getEcoli()}"/><br>
	
	<label>Hardness: </label>
	<input type = text name =Hardness value="${waterQuality.getHardness()}"/><br>
	
	<label>Total P: </label>
	<input type = text name =TotalP value="${waterQuality.getTotalP()}"/><br>
	
	<label>Total ln: </label>
	<input type = text name =Totaln value="${waterQuality.getTotaln()}"/><br>
	
	<label>Tss: </label>
	<input type = text name =Tss value="${waterQuality.getTss()}"/><br>
	
	<label>Arsenic: </label>
	<input type = text name =Arsenic value="${waterQuality.getArsenic()}"/><br>
	
	<label>Copper: </label>
	<input type = text name =Copper value="${waterQuality.getCopper()}"/><br>
	
	<label>Lead: </label>
 	<input type = text name =Lead value="${waterQuality.getLead()}"/><br>

	<label>Lead: </label>	 
  	<input type = text name =Zinc value="${waterQuality.getZinc()}"/><br>
  	
	<label>Tetrachloroethene: </label>  	
  	<input type = text name =TETRACHLOROETHENE value="${waterQuality.getTETRACHLOROETHENE()}"/><br>
  	
  	<label>TRICHLOROETHANE: </label> 
  	<input type = text name =TRICHLOROETHANE value="${waterQuality.getTRICHLOROETHANE()}"/><br> 
  	
  	<label>TRICHLOROETHANEa: </label>   	  
   	<input type = text name =TRICHLOROETHANEa value="${waterQuality.getTRICHLOROETHANEa()}"/><br>
   	
  	<label>DICHLOROETHANE: </label>   	
   	<input type = text name =DICHLOROETHANE value="${waterQuality.getDICHLOROETHANE()}"/><br>
   	
  	<label>DICHLOROETHENEa: </label>   	   	
   	<input type = text name =DICHLOROETHENEa value="${waterQuality.getDICHLOROETHENEa()}"/><br>  
   	
  	<label>DICHLOROBENZENE: </label>     	 	 
   	<input type = text name =DICHLOROBENZENE value="${waterQuality.getDICHLOROBENZENE()}"/><br>  
   	
  	<label>DICHLOROETHANEa: </label>      	
   	<input type = text name =DICHLOROETHANEa value="${waterQuality.getDICHLOROETHANEa()}"/><br>
   	
  	<label>DICHLOROPROPANE: </label>   	   
    <input type = text name =DICHLOROPROPANE value="${waterQuality.getDICHLOROPROPANE()}"/><br>   
    
   	<label>DIMETHYLBENZENEa: </label>   	   
    <input type = text name =DIMETHYLBENZENEa value="${waterQuality.getDIMETHYLBENZENEa()}"/><br> 
    
    <label>DICHLOROBENZENEb: </label>  
    <input type = text name =DICHLOROBENZENEb value="${waterQuality.getDICHLOROBENZENEb()}"/><br>  
    
    <label>DICHLOROBENZENEc: </label>     
    <input type = text name =DICHLOROBENZENEc value="${waterQuality.getDICHLOROBENZENEc()}"/><br>   
    
    
    <label>CHLOROETHYLVINYLETHER: </label>       
    <input type = text name =CHLOROETHYLVINYLETHER value="${waterQuality.getCHLOROETHYLVINYLETHER()}"/><br>   

    <label>ACROLEIN: </label>       
    <input type = text name =ACROLEIN value="${waterQuality.getACROLEIN()}"/><br> 
      
    <label>ACRYLONITRILE: </label>           
	<input type = text name =ACRYLONITRILE value="${waterQuality.getACRYLONITRILE()}"/><br>
	
    <label>BENZENE: </label>  	     
    <input type = text name =BENZENE value="${waterQuality.getBENZENE()}"/><br>   
    
    <label>BROMODICHLOROMETHANE: </label>      
    <input type = text name =BROMODICHLOROMETHANE value="${waterQuality.getBROMODICHLOROMETHANE()}"/><br>   
    
    <label>BROMOFORM: </label>        
    <input type = text name =BROMOFORM value="${waterQuality.getBROMOFORM()}"/><br>  
    
    <label>BROMOMETHANE: </label>       
    <input type = text name =BROMOMETHANE value="${waterQuality.getBROMOMETHANE()}"/><br>  
    <input type = text name =CARBONTETRACHLORIDE value="${waterQuality.getCARBONTETRACHLORIDE()}"/><br>  
    <input type = text name =CHLOROBENZENE value="${waterQuality.getCHLOROBENZENE()}"/><br>  
    <input type = text name =CHLOROETHANEa value="${waterQuality.getCHLOROETHANEa()}"/><br>   
    <input type = text name =CHLOROFORM value="${waterQuality.getCHLOROFORM()}"/><br>    
    <input type = text name =CHLOROMETHANE value="${waterQuality.getCHLOROMETHANE()}"/><br>  
    <input type = text name =CISDICHLOROPROPENE value="${waterQuality.getCISDICHLOROPROPENE()}"/><br>      
    <input type = text name =DIBROMOCHLOROMETHANE value="${waterQuality.getDIBROMOCHLOROMETHANE()}"/><br>  
    <input type = text name =ETHYLBENZENE value="${waterQuality.getETHYLBENZENE()}"/><br> 
    <input type = text name =METHYLENECHLORIDE value="${waterQuality.getMETHYLENECHLORIDE()}"/><br> 
    <input type = text name =TETRACHLOROETHENEPCE value="${waterQuality.getTETRACHLOROETHENEPCE()}"/><br> 
    <input type = text name =TOLUENE value="${waterQuality.getTOLUENE()}"/><br>  
    <input type = text name =TRANSDICHLOROETHENEa value="${waterQuality.getTRANSDICHLOROETHENEa()}"/><br>   
    <input type = text name =TRANSDICHLOROPROPENEb value="${waterQuality.getTRANSDICHLOROPROPENEb()}"/><br>   
    <input type = text name =TRICHLOROETHENETCE value="${waterQuality.getTRICHLOROETHENETCE()}"/><br>   



 
    <input type = text name =Sitename value="${waterQuality.getSitename()}"/><br>   
    <input type = text name =Sitepoint value="${waterQuality.getSitepoint()}"/><br>   
    

	
 </c:forEach>
</table> 

<c:if test="${fn:length(WATERQUALITIES) != 0}">
   <p>Found test string<p>
</c:if>				


<label> Sample Date :</label>


	<input type="text" id="SampleDate" name="SampleDate" value="<c:out value="${waterQuality.SampleDate}"/>">
	<input type=text name = SampleDate value=SampleDate>
	<input type=text name = SampleDate value=<c:out value="${waterQuality.getSampleDate()}" />>
<br/>

<label> Sampled By :</label>
    <input type="text" name="SampledBy"
    value="<c:out value="${SampledBy}"/>" />

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
