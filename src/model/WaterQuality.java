package model;

public class WaterQuality {

	private String SampleDate;
	private String SampledBy;
	private String SiteCondition;
	private String PH;
	private String Conductivity;
	private String DissolvedOxygen;
	private String Temperature;
	private String Turbidity;
	private String Stage;
	private String FecalColiform;
	private String Ecoli;
	private String Hardness;
	private String TotalP;
	private String Totaln;
	private String Tss;
	private String Arsenic;
	private String Copper;
	private String Lead;
	private String Zinc;
	private String TETRACHLOROETHENE;
	private String TRICHLOROETHANE;
	private String TRICHLOROETHANEa;
	private String DICHLOROETHANE;
	private String DICHLOROETHENEa;
	private String DICHLOROBENZENE;
	private String DICHLOROETHANEa;
	private String DICHLOROPROPANE;
	private String DIMETHYLBENZENEa;
	private String DICHLOROBENZENEb;
	private String DICHLOROBENZENEc;
	private String CHLOROETHYLVINYLETHER;
	private String ACROLEIN;
	private String ACRYLONITRILE;
	private String BENZENE;
	private String BROMODICHLOROMETHANE;
	private String BROMOFORM;
	private String BROMOMETHANE;
	private String CARBONTETRACHLORIDE;
	private String CHLOROBENZENE;
	private String CHLOROETHANEa;
	private String CHLOROFORM;
	private String CHLOROMETHANE;
	private String CISDICHLOROPROPENE;
	private String DIBROMOCHLOROMETHANE;
	private String ETHYLBENZENE;
	private String METHYLENECHLORIDE;
	private String TETRACHLOROETHENEPCE;
	private String TOLUENE;
	private String TRANSDICHLOROETHENEa;
	private String TRANSDICHLOROPROPENEb;
	private String TRICHLOROETHENETCE;
	private String TRICHLOROFLUOROMETHANEFREON;
	private String VINYLCHLORIDE;
	private String XYLENESMP;
	private String Sitename;
	private String Sitepoint;

	/**
	 * @param sampleDate
	 * @param sampledBy
	 * @param siteCondition
	 * @param pH
	 * @param conductivity
	 * @param dissolvedOxygen
	 * @param temperature
	 * @param turbidity
	 * @param stage
	 * @param fecalColiform
	 * @param ecoli
	 * @param hardness
	 * @param totalP
	 * @param totaln
	 * @param tss
	 * @param arsenic
	 * @param copper
	 * @param lead
	 * @param zinc
	 * @param tETRACHLOROETHENE
	 * @param tRICHLOROETHANE
	 * @param tRICHLOROETHANEa
	 * @param dICHLOROETHANE
	 * @param dICHLOROETHENEa
	 * @param dICHLOROBENZENE
	 * @param dICHLOROETHANEa
	 * @param dICHLOROPROPANE
	 * @param dIMETHYLBENZENEa
	 * @param dICHLOROBENZENEb
	 * @param dICHLOROBENZENEc
	 * @param cHLOROETHYLVINYLETHER
	 * @param aCROLEIN
	 * @param aCRYLONITRILE
	 * @param bENZENE
	 * @param bROMODICHLOROMETHANE
	 * @param bROMOFORM
	 * @param bROMOMETHANE
	 * @param cARBONTETRACHLORIDE
	 * @param cHLOROBENZENE
	 * @param cHLOROETHANEa
	 * @param cHLOROFORM
	 * @param cHLOROMETHANE
	 * @param cISDICHLOROPROPENE
	 * @param dIBROMOCHLOROMETHANE
	 * @param eTHYLBENZENE
	 * @param mETHYLENECHLORIDE
	 * @param tETRACHLOROETHENEPCE
	 * @param tOLUENE
	 * @param tRANSDICHLOROETHENEa
	 * @param tRANSDICHLOROPROPENEb
	 * @param tRICHLOROETHENETCE
	 * @param tRICHLOROFLUOROMETHANEFREON
	 * @param vINYLCHLORIDE
	 * @param xYLENESMP
	 * @param sitename
	 * @param sitepoint
	 */
	public WaterQuality(String sampleDate, String sampledBy, String siteCondition, String pH, String conductivity,
			String dissolvedOxygen, String temperature, String turbidity, String stage, String fecalColiform,
			String ecoli, String hardness, String totalP, String totaln, String tss, String arsenic, String copper,
			String lead, String zinc, String tETRACHLOROETHENE, String tRICHLOROETHANE, String tRICHLOROETHANEa,
			String dICHLOROETHANE, String dICHLOROETHENEa, String dICHLOROBENZENE, String dICHLOROETHANEa,
			String dICHLOROPROPANE, String dIMETHYLBENZENEa, String dICHLOROBENZENEb, String dICHLOROBENZENEc,
			String cHLOROETHYLVINYLETHER, String aCROLEIN, String aCRYLONITRILE, String bENZENE,
			String bROMODICHLOROMETHANE, String bROMOFORM, String bROMOMETHANE, String cARBONTETRACHLORIDE,
			String cHLOROBENZENE, String cHLOROETHANEa, String cHLOROFORM, String cHLOROMETHANE,
			String cISDICHLOROPROPENE, String dIBROMOCHLOROMETHANE, String eTHYLBENZENE, String mETHYLENECHLORIDE,
			String tETRACHLOROETHENEPCE, String tOLUENE, String tRANSDICHLOROETHENEa, String tRANSDICHLOROPROPENEb,
			String tRICHLOROETHENETCE, String tRICHLOROFLUOROMETHANEFREON, String vINYLCHLORIDE, String xYLENESMP,
			String sitename, String sitepoint) {

		this.SampleDate = sampleDate;
		this.SampledBy = sampledBy;
		this.SiteCondition = siteCondition;
		this.PH = pH;
		this.Conductivity = conductivity;
		this.DissolvedOxygen = dissolvedOxygen;
		this.Temperature = temperature;
		this.Turbidity = turbidity;
		this.Stage = stage;
		this.FecalColiform = fecalColiform;
		this.Ecoli = ecoli;
		this.Hardness = hardness;
		this.TotalP = totalP;
		this.Totaln = totaln;
		this.Tss = tss;
		this.Arsenic = arsenic;
		this.Copper = copper;
		this.Lead = lead;
		this.Zinc = zinc;
		this.TETRACHLOROETHENE = tETRACHLOROETHENE;
		this.TRICHLOROETHANE = tRICHLOROETHANE;
		this.TRICHLOROETHANEa = tRICHLOROETHANEa;
		this.DICHLOROETHANE = dICHLOROETHANE;
		this.DICHLOROETHENEa = dICHLOROETHENEa;
		this.DICHLOROBENZENE = dICHLOROBENZENE;
		this.DICHLOROETHANEa = dICHLOROETHANEa;
		this.DICHLOROPROPANE = dICHLOROPROPANE;
		this.DIMETHYLBENZENEa = dIMETHYLBENZENEa;
		this.DICHLOROBENZENEb = dICHLOROBENZENEb;
		this.DICHLOROBENZENEc = dICHLOROBENZENEc;
		this.CHLOROETHYLVINYLETHER = cHLOROETHYLVINYLETHER;
		this.ACROLEIN = aCROLEIN;
		this.ACRYLONITRILE = aCRYLONITRILE;
		this.BENZENE = bENZENE;
		this.BROMODICHLOROMETHANE = bROMODICHLOROMETHANE;
		this.BROMOFORM = bROMOFORM;
		this.BROMOMETHANE = bROMOMETHANE;
		this.CARBONTETRACHLORIDE = cARBONTETRACHLORIDE;
		this.CHLOROBENZENE = cHLOROBENZENE;
		this.CHLOROETHANEa = cHLOROETHANEa;
		this.CHLOROFORM = cHLOROFORM;
		this.CHLOROMETHANE = cHLOROMETHANE;
		this.CISDICHLOROPROPENE = cISDICHLOROPROPENE;
		this.DIBROMOCHLOROMETHANE = dIBROMOCHLOROMETHANE;
		this.ETHYLBENZENE = eTHYLBENZENE;
		this.METHYLENECHLORIDE = mETHYLENECHLORIDE;
		this.TETRACHLOROETHENEPCE = tETRACHLOROETHENEPCE;
		this.TOLUENE = tOLUENE;
		this.TRANSDICHLOROETHENEa = tRANSDICHLOROETHENEa;
		this.TRANSDICHLOROPROPENEb = tRANSDICHLOROPROPENEb;
		this.TRICHLOROETHENETCE = tRICHLOROETHENETCE;
		this.TRICHLOROFLUOROMETHANEFREON = tRICHLOROFLUOROMETHANEFREON;
		this.VINYLCHLORIDE = vINYLCHLORIDE;
		this.XYLENESMP = xYLENESMP;
		this.Sitename = sitename;
		this.Sitepoint = sitepoint;
	}

	public WaterQuality() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the sampleDate
	 */
	public String getSampleDate() {
		return SampleDate;
	}

	/**
	 * @param sampleDate
	 *            the sampleDate to set
	 */
	public void setSampleDate(String sampleDate) {
		SampleDate = sampleDate;
	}

	/**
	 * @return the sampledBy
	 */
	public String getSampledBy() {
		return SampledBy;
	}

	/**
	 * @param sampledBy
	 *            the sampledBy to set
	 */
	public void setSampledBy(String sampledBy) {
		SampledBy = sampledBy;
	}

	/**
	 * @return the siteCondition
	 */
	public String getSiteCondition() {
		return SiteCondition;
	}

	/**
	 * @param siteCondition
	 *            the siteCondition to set
	 */
	public void setSiteCondition(String siteCondition) {
		SiteCondition = siteCondition;
	}

	/**
	 * @return the pH
	 */
	public String getPH() {
		return PH;
	}

	/**
	 * @param pH
	 *            the pH to set
	 */
	public void setPH(String pH) {
		PH = pH;
	}

	/**
	 * @return the conductivity
	 */
	public String getConductivity() {
		return Conductivity;
	}

	/**
	 * @param conductivity
	 *            the conductivity to set
	 */
	public void setConductivity(String conductivity) {
		Conductivity = conductivity;
	}

	/**
	 * @return the dissolvedOxygen
	 */
	public String getDissolvedOxygen() {
		return DissolvedOxygen;
	}

	/**
	 * @param dissolvedOxygen
	 *            the dissolvedOxygen to set
	 */
	public void setDissolvedOxygen(String dissolvedOxygen) {
		DissolvedOxygen = dissolvedOxygen;
	}

	/**
	 * @return the temperature
	 */
	public String getTemperature() {
		return Temperature;
	}

	/**
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperature(String temperature) {
		Temperature = temperature;
	}

	/**
	 * @return the turbidity
	 */
	public String getTurbidity() {
		return Turbidity;
	}

	/**
	 * @param turbidity
	 *            the turbidity to set
	 */
	public void setTurbidity(String turbidity) {
		Turbidity = turbidity;
	}

	/**
	 * @return the stage
	 */
	public String getStage() {
		return Stage;
	}

	/**
	 * @param stage
	 *            the stage to set
	 */
	public void setStage(String stage) {
		Stage = stage;
	}

	/**
	 * @return the fecalColiform
	 */
	public String getFecalColiform() {
		return FecalColiform;
	}

	/**
	 * @param fecalColiform
	 *            the fecalColiform to set
	 */
	public void setFecalColiform(String fecalColiform) {
		FecalColiform = fecalColiform;
	}

	/**
	 * @return the ecoli
	 */
	public String getEcoli() {
		return Ecoli;
	}

	/**
	 * @param ecoli
	 *            the ecoli to set
	 */
	public void setEcoli(String ecoli) {
		Ecoli = ecoli;
	}

	/**
	 * @return the hardness
	 */
	public String getHardness() {
		return Hardness;
	}

	/**
	 * @param hardness
	 *            the hardness to set
	 */
	public void setHardness(String hardness) {
		Hardness = hardness;
	}

	/**
	 * @return the totalP
	 */
	public String getTotalP() {
		return TotalP;
	}

	/**
	 * @param totalP
	 *            the totalP to set
	 */
	public void setTotalP(String totalP) {
		TotalP = totalP;
	}

	/**
	 * @return the totaln
	 */
	public String getTotaln() {
		return Totaln;
	}

	/**
	 * @param totaln
	 *            the totaln to set
	 */
	public void setTotaln(String totaln) {
		Totaln = totaln;
	}

	/**
	 * @return the tss
	 */
	public String getTss() {
		return Tss;
	}

	/**
	 * @param tss
	 *            the tss to set
	 */
	public void setTss(String tss) {
		Tss = tss;
	}

	/**
	 * @return the arsenic
	 */
	public String getArsenic() {
		return Arsenic;
	}

	/**
	 * @param arsenic
	 *            the arsenic to set
	 */
	public void setArsenic(String arsenic) {
		Arsenic = arsenic;
	}

	/**
	 * @return the copper
	 */
	public String getCopper() {
		return Copper;
	}

	/**
	 * @param copper
	 *            the copper to set
	 */
	public void setCopper(String copper) {
		Copper = copper;
	}

	/**
	 * @return the lead
	 */
	public String getLead() {
		return Lead;
	}

	/**
	 * @param lead
	 *            the lead to set
	 */
	public void setLead(String lead) {
		Lead = lead;
	}

	/**
	 * @return the zinc
	 */
	public String getZinc() {
		return Zinc;
	}

	/**
	 * @param zinc
	 *            the zinc to set
	 */
	public void setZinc(String zinc) {
		Zinc = zinc;
	}

	/**
	 * @return the tETRACHLOROETHENE
	 */
	public String getTETRACHLOROETHENE() {
		return TETRACHLOROETHENE;
	}

	/**
	 * @param tETRACHLOROETHENE
	 *            the tETRACHLOROETHENE to set
	 */
	public void setTETRACHLOROETHENE(String tETRACHLOROETHENE) {
		TETRACHLOROETHENE = tETRACHLOROETHENE;
	}

	/**
	 * @return the tRICHLOROETHANE
	 */
	public String getTRICHLOROETHANE() {
		return TRICHLOROETHANE;
	}

	/**
	 * @param tRICHLOROETHANE
	 *            the tRICHLOROETHANE to set
	 */
	public void setTRICHLOROETHANE(String tRICHLOROETHANE) {
		TRICHLOROETHANE = tRICHLOROETHANE;
	}

	/**
	 * @return the tRICHLOROETHANEa
	 */
	public String getTRICHLOROETHANEa() {
		return TRICHLOROETHANEa;
	}

	/**
	 * @param tRICHLOROETHANEa
	 *            the tRICHLOROETHANEa to set
	 */
	public void setTRICHLOROETHANEa(String tRICHLOROETHANEa) {
		TRICHLOROETHANEa = tRICHLOROETHANEa;
	}

	/**
	 * @return the dICHLOROETHANE
	 */
	public String getDICHLOROETHANE() {
		return DICHLOROETHANE;
	}

	/**
	 * @param dICHLOROETHANE
	 *            the dICHLOROETHANE to set
	 */
	public void setDICHLOROETHANE(String dICHLOROETHANE) {
		DICHLOROETHANE = dICHLOROETHANE;
	}

	/**
	 * @return the dICHLOROETHENEa
	 */
	public String getDICHLOROETHENEa() {
		return DICHLOROETHENEa;
	}

	/**
	 * @param dICHLOROETHENEa
	 *            the dICHLOROETHENEa to set
	 */
	public void setDICHLOROETHENEa(String dICHLOROETHENEa) {
		DICHLOROETHENEa = dICHLOROETHENEa;
	}

	/**
	 * @return the dICHLOROBENZENE
	 */
	public String getDICHLOROBENZENE() {
		return DICHLOROBENZENE;
	}

	/**
	 * @param dICHLOROBENZENE
	 *            the dICHLOROBENZENE to set
	 */
	public void setDICHLOROBENZENE(String dICHLOROBENZENE) {
		DICHLOROBENZENE = dICHLOROBENZENE;
	}

	/**
	 * @return the dICHLOROETHANEa
	 */
	public String getDICHLOROETHANEa() {
		return DICHLOROETHANEa;
	}

	/**
	 * @param dICHLOROETHANEa
	 *            the dICHLOROETHANEa to set
	 */
	public void setDICHLOROETHANEa(String dICHLOROETHANEa) {
		DICHLOROETHANEa = dICHLOROETHANEa;
	}

	/**
	 * @return the dICHLOROPROPANE
	 */
	public String getDICHLOROPROPANE() {
		return DICHLOROPROPANE;
	}

	/**
	 * @param dICHLOROPROPANE
	 *            the dICHLOROPROPANE to set
	 */
	public void setDICHLOROPROPANE(String dICHLOROPROPANE) {
		DICHLOROPROPANE = dICHLOROPROPANE;
	}

	/**
	 * @return the dIMETHYLBENZENEa
	 */
	public String getDIMETHYLBENZENEa() {
		return DIMETHYLBENZENEa;
	}

	/**
	 * @param dIMETHYLBENZENEa
	 *            the dIMETHYLBENZENEa to set
	 */
	public void setDIMETHYLBENZENEa(String dIMETHYLBENZENEa) {
		DIMETHYLBENZENEa = dIMETHYLBENZENEa;
	}

	/**
	 * @return the dICHLOROBENZENEb
	 */
	public String getDICHLOROBENZENEb() {
		return DICHLOROBENZENEb;
	}

	/**
	 * @param dICHLOROBENZENEb
	 *            the dICHLOROBENZENEb to set
	 */
	public void setDICHLOROBENZENEb(String dICHLOROBENZENEb) {
		DICHLOROBENZENEb = dICHLOROBENZENEb;
	}

	/**
	 * @return the dICHLOROBENZENEc
	 */
	public String getDICHLOROBENZENEc() {
		return DICHLOROBENZENEc;
	}

	/**
	 * @param dICHLOROBENZENEc
	 *            the dICHLOROBENZENEc to set
	 */
	public void setDICHLOROBENZENEc(String dICHLOROBENZENEc) {
		DICHLOROBENZENEc = dICHLOROBENZENEc;
	}

	/**
	 * @return the cHLOROETHYLVINYLETHER
	 */
	public String getCHLOROETHYLVINYLETHER() {
		return CHLOROETHYLVINYLETHER;
	}

	/**
	 * @param cHLOROETHYLVINYLETHER
	 *            the cHLOROETHYLVINYLETHER to set
	 */
	public void setCHLOROETHYLVINYLETHER(String cHLOROETHYLVINYLETHER) {
		CHLOROETHYLVINYLETHER = cHLOROETHYLVINYLETHER;
	}

	/**
	 * @return the aCROLEIN
	 */
	public String getACROLEIN() {
		return ACROLEIN;
	}

	/**
	 * @param aCROLEIN
	 *            the aCROLEIN to set
	 */
	public void setACROLEIN(String aCROLEIN) {
		ACROLEIN = aCROLEIN;
	}

	/**
	 * @return the aCRYLONITRILE
	 */
	public String getACRYLONITRILE() {
		return ACRYLONITRILE;
	}

	/**
	 * @param aCRYLONITRILE
	 *            the aCRYLONITRILE to set
	 */
	public void setACRYLONITRILE(String aCRYLONITRILE) {
		ACRYLONITRILE = aCRYLONITRILE;
	}

	/**
	 * @return the bENZENE
	 */
	public String getBENZENE() {
		return BENZENE;
	}

	/**
	 * @param bENZENE
	 *            the bENZENE to set
	 */
	public void setBENZENE(String bENZENE) {
		BENZENE = bENZENE;
	}

	/**
	 * @return the bROMODICHLOROMETHANE
	 */
	public String getBROMODICHLOROMETHANE() {
		return BROMODICHLOROMETHANE;
	}

	/**
	 * @param bROMODICHLOROMETHANE
	 *            the bROMODICHLOROMETHANE to set
	 */
	public void setBROMODICHLOROMETHANE(String bROMODICHLOROMETHANE) {
		BROMODICHLOROMETHANE = bROMODICHLOROMETHANE;
	}

	/**
	 * @return the bROMOFORM
	 */
	public String getBROMOFORM() {
		return BROMOFORM;
	}

	/**
	 * @param bROMOFORM
	 *            the bROMOFORM to set
	 */
	public void setBROMOFORM(String bROMOFORM) {
		BROMOFORM = bROMOFORM;
	}

	/**
	 * @return the bROMOMETHANE
	 */
	public String getBROMOMETHANE() {
		return BROMOMETHANE;
	}

	/**
	 * @param bROMOMETHANE
	 *            the bROMOMETHANE to set
	 */
	public void setBROMOMETHANE(String bROMOMETHANE) {
		BROMOMETHANE = bROMOMETHANE;
	}

	/**
	 * @return the cARBONTETRACHLORIDE
	 */
	public String getCARBONTETRACHLORIDE() {
		return CARBONTETRACHLORIDE;
	}

	/**
	 * @param cARBONTETRACHLORIDE
	 *            the cARBONTETRACHLORIDE to set
	 */
	public void setCARBONTETRACHLORIDE(String cARBONTETRACHLORIDE) {
		CARBONTETRACHLORIDE = cARBONTETRACHLORIDE;
	}

	/**
	 * @return the cHLOROBENZENE
	 */
	public String getCHLOROBENZENE() {
		return CHLOROBENZENE;
	}

	/**
	 * @param cHLOROBENZENE
	 *            the cHLOROBENZENE to set
	 */
	public void setCHLOROBENZENE(String cHLOROBENZENE) {
		CHLOROBENZENE = cHLOROBENZENE;
	}

	/**
	 * @return the cHLOROETHANEa
	 */
	public String getCHLOROETHANEa() {
		return CHLOROETHANEa;
	}

	/**
	 * @param cHLOROETHANEa
	 *            the cHLOROETHANEa to set
	 */
	public void setCHLOROETHANEa(String cHLOROETHANEa) {
		CHLOROETHANEa = cHLOROETHANEa;
	}

	/**
	 * @return the cHLOROFORM
	 */
	public String getCHLOROFORM() {
		return CHLOROFORM;
	}

	/**
	 * @param cHLOROFORM
	 *            the cHLOROFORM to set
	 */
	public void setCHLOROFORM(String cHLOROFORM) {
		CHLOROFORM = cHLOROFORM;
	}

	/**
	 * @return the cHLOROMETHANE
	 */
	public String getCHLOROMETHANE() {
		return CHLOROMETHANE;
	}

	/**
	 * @param cHLOROMETHANE
	 *            the cHLOROMETHANE to set
	 */
	public void setCHLOROMETHANE(String cHLOROMETHANE) {
		CHLOROMETHANE = cHLOROMETHANE;
	}

	/**
	 * @return the cISDICHLOROPROPENE
	 */
	public String getCISDICHLOROPROPENE() {
		return CISDICHLOROPROPENE;
	}

	/**
	 * @param cISDICHLOROPROPENE
	 *            the cISDICHLOROPROPENE to set
	 */
	public void setCISDICHLOROPROPENE(String cISDICHLOROPROPENE) {
		CISDICHLOROPROPENE = cISDICHLOROPROPENE;
	}

	/**
	 * @return the dIBROMOCHLOROMETHANE
	 */
	public String getDIBROMOCHLOROMETHANE() {
		return DIBROMOCHLOROMETHANE;
	}

	/**
	 * @param dIBROMOCHLOROMETHANE
	 *            the dIBROMOCHLOROMETHANE to set
	 */
	public void setDIBROMOCHLOROMETHANE(String dIBROMOCHLOROMETHANE) {
		DIBROMOCHLOROMETHANE = dIBROMOCHLOROMETHANE;
	}

	/**
	 * @return the eTHYLBENZENE
	 */
	public String getETHYLBENZENE() {
		return ETHYLBENZENE;
	}

	/**
	 * @param eTHYLBENZENE
	 *            the eTHYLBENZENE to set
	 */
	public void setETHYLBENZENE(String eTHYLBENZENE) {
		ETHYLBENZENE = eTHYLBENZENE;
	}

	/**
	 * @return the mETHYLENECHLORIDE
	 */
	public String getMETHYLENECHLORIDE() {
		return METHYLENECHLORIDE;
	}

	/**
	 * @param mETHYLENECHLORIDE
	 *            the mETHYLENECHLORIDE to set
	 */
	public void setMETHYLENECHLORIDE(String mETHYLENECHLORIDE) {
		METHYLENECHLORIDE = mETHYLENECHLORIDE;
	}

	/**
	 * @return the tETRACHLOROETHENEPCE
	 */
	public String getTETRACHLOROETHENEPCE() {
		return TETRACHLOROETHENEPCE;
	}

	/**
	 * @param tETRACHLOROETHENEPCE
	 *            the tETRACHLOROETHENEPCE to set
	 */
	public void setTETRACHLOROETHENEPCE(String tETRACHLOROETHENEPCE) {
		TETRACHLOROETHENEPCE = tETRACHLOROETHENEPCE;
	}

	/**
	 * @return the tOLUENE
	 */
	public String getTOLUENE() {
		return TOLUENE;
	}

	/**
	 * @param tOLUENE
	 *            the tOLUENE to set
	 */
	public void setTOLUENE(String tOLUENE) {
		TOLUENE = tOLUENE;
	}

	/**
	 * @return the tRANSDICHLOROETHENEa
	 */
	public String getTRANSDICHLOROETHENEa() {
		return TRANSDICHLOROETHENEa;
	}

	/**
	 * @param tRANSDICHLOROETHENEa
	 *            the tRANSDICHLOROETHENEa to set
	 */
	public void setTRANSDICHLOROETHENEa(String tRANSDICHLOROETHENEa) {
		TRANSDICHLOROETHENEa = tRANSDICHLOROETHENEa;
	}

	/**
	 * @return the tRANSDICHLOROPROPENEb
	 */
	public String getTRANSDICHLOROPROPENEb() {
		return TRANSDICHLOROPROPENEb;
	}

	/**
	 * @param tRANSDICHLOROPROPENEb
	 *            the tRANSDICHLOROPROPENEb to set
	 */
	public void setTRANSDICHLOROPROPENEb(String tRANSDICHLOROPROPENEb) {
		TRANSDICHLOROPROPENEb = tRANSDICHLOROPROPENEb;
	}

	/**
	 * @return the tRICHLOROETHENETCE
	 */
	public String getTRICHLOROETHENETCE() {
		return TRICHLOROETHENETCE;
	}

	/**
	 * @param tRICHLOROETHENETCE
	 *            the tRICHLOROETHENETCE to set
	 */
	public void setTRICHLOROETHENETCE(String tRICHLOROETHENETCE) {
		TRICHLOROETHENETCE = tRICHLOROETHENETCE;
	}

	/**
	 * @return the tRICHLOROFLUOROMETHANEFREON
	 */
	public String getTRICHLOROFLUOROMETHANEFREON() {
		return TRICHLOROFLUOROMETHANEFREON;
	}

	/**
	 * @param tRICHLOROFLUOROMETHANEFREON
	 *            the tRICHLOROFLUOROMETHANEFREON to set
	 */
	public void setTRICHLOROFLUOROMETHANEFREON(String tRICHLOROFLUOROMETHANEFREON) {
		TRICHLOROFLUOROMETHANEFREON = tRICHLOROFLUOROMETHANEFREON;
	}

	/**
	 * @return the vINYLCHLORIDE
	 */
	public String getVINYLCHLORIDE() {
		return VINYLCHLORIDE;
	}

	/**
	 * @param vINYLCHLORIDE
	 *            the vINYLCHLORIDE to set
	 */
	public void setVINYLCHLORIDE(String vINYLCHLORIDE) {
		VINYLCHLORIDE = vINYLCHLORIDE;
	}

	/**
	 * @return the xYLENES_MP
	 */
	public String getXYLENES_MP() {
		return XYLENESMP;
	}

	/**
	 * @param xYLENES_MP
	 *            the xYLENES_MP to set
	 */
	public void setXYLENES_MP(String xYLENES_MP) {
		XYLENESMP = xYLENES_MP;
	}

	/**
	 * @return the sitename
	 */
	public String getSitename() {
		return Sitename;
	}

	/**
	 * @param sitename
	 *            the sitename to set
	 */
	public void setSitename(String sitename) {
		Sitename = sitename;
	}

	/**
	 * @return the sitepoint
	 */
	public String getSitepoint() {
		return Sitepoint;
	}

	/**
	 * @param sitepoint
	 *            the sitepoint to set
	 */
	public void setSitepoint(String sitepoint) {
		Sitepoint = sitepoint;
	}

}
