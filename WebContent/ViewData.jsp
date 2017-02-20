
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.WaterQuality,java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="store.css">
</head>

	<h1> ${sessionScope.name} View Data </h1>
	
	<br>
	
<br>
	
<table>
<thead>
<tr>
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
<th>Site Point</th>
</thead>
<tbody>  <c:forEach items="${WATERQUALITIES}" var="waterQuality" varStatus="loop">
    <tr>
      <%--
      <td><a href=delete?SampleDate=${waterQuality.getSampleDate()}>DELETE</a></td> 
      <td><a href="http://www.w3schools.com"><c:out value="${waterQuality.getSampleDate()}" /></a></td> 
      <td><button type="input" onclick=delete?SampleDate=${waterQuality.getSampleDate()}>Delete2</button></td>
      <td><a href=delete?SampleDate=${waterQuality.getSampleDate()}><button type="button">Delete!</button></a></td>
      <td><a href=delete?SampleDate=${waterQuality.getSampleDate()}><button type="button" onclick=delete?SampleDate=${waterQuality.getSampleDate()}>Delete</button></a></td>
	  <td><a href=delete?SampleDate=${waterQuality.getSampleDate()} onclick="return confirm(' you want to delete?');">Delete2</a></td>
	  --%>
	  <td><a href=updateGetData?SampleDate=${waterQuality.getSampleDate()}><button type="button" onclick=updateGetData?SampleDate=${waterQuality.getSampleDate()}>Update</button></a></td>
	  <td><a href=updateGetData?SampleDate=${waterQuality.getSampleDate()},{waterQuality.getSitePoint()}><button type="button" onclick=updateGetData?SampleDate=${waterQuality.getSampleDate()},{waterQuality.getSitePoint()} >Update2</button></a></td>
	  <td><a href=delete?SampleDate=${waterQuality.getSampleDate()}><button type="button" onclick="return confirm(' you want to delete?');">Delete</button></a></td>
    
      <td><c:out value="${waterQuality.getSampleDate()}" /></td> 
      <td><c:out value="${waterQuality.getSampledBy()}" /></td>
      <td><c:out value="${waterQuality.getSiteCondition()}" /></td>
      <td><c:out value="${waterQuality.getPH()}" /></td>
      <td><c:out value="${waterQuality.getConductivity()}" /></td>
      <td><c:out value="${waterQuality.getDissolvedOxygen()}" /></td>
      <td><c:out value="${waterQuality.getTemperature()}" /></td>
      <td><c:out value="${waterQuality.getTurbidity()}" /></td>
      <td><c:out value="${waterQuality.getStage()}" /></td>
      <td><c:out value="${waterQuality.getFecalColiform()}" /></td>
      <td><c:out value="${waterQuality.getEcoli()}" /></td>
      <td><c:out value="${waterQuality.getHardness()}" /></td>
      <td><c:out value="${waterQuality.getTotalP()}" /></td>
      <td><c:out value="${waterQuality.getTotaln()}" /></td>
      <td><c:out value="${waterQuality.getTss()}" /></td>
      <td><c:out value="${waterQuality.getArsenic()}" /></td>
      <td><c:out value="${waterQuality.getCopper()}" /></td>
      <td><c:out value="${waterQuality.getLead()}" /></td>
      <td><c:out value="${waterQuality.getZinc()}" /></td>
      <td><c:out value="${waterQuality.getTETRACHLOROETHENE()}" /></td>
	<td><c:out value="${waterQuality.getTRICHLOROETHANE()}" /></td>
	<td><c:out value="${waterQuality.getTRICHLOROETHANEa()}" /></td>
	<td><c:out value="${waterQuality.getDICHLOROETHANE()}" /></td>
	<td><c:out value="${waterQuality.getDICHLOROETHENEa()}" /></td>
	<td><c:out value="${waterQuality.getDICHLOROBENZENE()}" /></td>
	<td><c:out value="${waterQuality.getDICHLOROETHANEa()}" /></td>
	<td><c:out value="${waterQuality.getDICHLOROPROPANE()}" /></td>
	<td><c:out value="${waterQuality.getDIMETHYLBENZENEa()}" /></td>
	<td><c:out value="${waterQuality.getDICHLOROBENZENEb()}" /></td>
	<td><c:out value="${waterQuality.getDICHLOROBENZENEc()}" /></td>
	<td><c:out value="${waterQuality.getCHLOROETHYLVINYLETHER()}" /></td>
	<td><c:out value="${waterQuality.getACROLEIN()}" /></td>
	<td><c:out value="${waterQuality.getACRYLONITRILE()}" /></td>
	<td><c:out value="${waterQuality.getBENZENE()}" /></td>
	<td><c:out value="${waterQuality.getBROMODICHLOROMETHANE()}" /></td>
	<td><c:out value="${waterQuality.getBROMOFORM()}" /></td>
	<td><c:out value="${waterQuality.getBROMOMETHANE()}" /></td>
	<td><c:out value="${waterQuality.getCARBONTETRACHLORIDE()}" /></td>
	<td><c:out value="${waterQuality.getCHLOROBENZENE()}" /></td>
	<td><c:out value="${waterQuality.getCHLOROETHANEa()}" /></td>
	<td><c:out value="${waterQuality.getCHLOROFORM()}" /></td>
	<td><c:out value="${waterQuality.getCHLOROMETHANE()}" /></td>
	<td><c:out value="${waterQuality.getCISDICHLOROPROPENE()}" /></td>
	<td><c:out value="${waterQuality.getDIBROMOCHLOROMETHANE()}" /></td>
	<td><c:out value="${waterQuality.getETHYLBENZENE()}" /></td>
	<td><c:out value="${waterQuality.getMETHYLENECHLORIDE()}" /></td>
	<td><c:out value="${waterQuality.getTETRACHLOROETHENE()}" /></td>
	<td><c:out value="${waterQuality.getTOLUENE()}" /></td>
	<td><c:out value="${waterQuality.getTRANSDICHLOROETHENEa()}" /></td>
	<td><c:out value="${waterQuality.getTRANSDICHLOROPROPENEb()}" /></td>
	<td><c:out value="${waterQuality.getTRICHLOROETHENETCE()}" /></td>
	<td><c:out value="${waterQuality.getTRICHLOROFLUOROMETHANEFREON()}" /></td>
	<td><c:out value="${waterQuality.getVINYLCHLORIDE()}" /></td>
	<td><c:out value="${waterQuality.getXYLENES_MP()}" /></td>
	 <td><c:out value="${waterQuality.getSitename()}" /></td>
	 <td><c:out value="${waterQuality.getSitepoint()}" /></td>
    </tr>
  </c:forEach></tbody>
</table>



</body>
</html>
