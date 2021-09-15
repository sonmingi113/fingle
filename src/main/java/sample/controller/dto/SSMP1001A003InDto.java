package sample.controller.dto;

import java.math.BigDecimal;

public class SSMP1001A003InDto {

	/** FW교육임직원번호 */
	private Integer feduEmpNo;
	
	/** FW교육임직원명 */
	private String feduEmpNm;
	
	/** FW교육직업명 */
	private String feduOccpNm;
	
	/** FW교육관리자임직원번호 */
	private Integer feduMngrEmpNo;
	
	/** FW교육입사일자 */
	private String feduIpsaDt;
	
	/** FW교육급여금액 */
	private BigDecimal feduPayAmt;
	
	/** FW교육부서번호 */
	private Integer feduDeptNo;

	public Integer getFeduEmpNo() {
		return feduEmpNo;
	}

	public void setFeduEmpNo(Integer feduEmpNo) {
		this.feduEmpNo = feduEmpNo;
	}

	public String getFeduEmpNm() {
		return feduEmpNm;
	}

	public void setFeduEmpNm(String feduEmpNm) {
		this.feduEmpNm = feduEmpNm;
	}

	public String getFeduOccpNm() {
		return feduOccpNm;
	}

	public void setFeduOccpNm(String feduOccpNm) {
		this.feduOccpNm = feduOccpNm;
	}

	public Integer getFeduMngrEmpNo() {
		return feduMngrEmpNo;
	}

	public void setFeduMngrEmpNo(Integer feduMngrEmpNo) {
		this.feduMngrEmpNo = feduMngrEmpNo;
	}

	public String getFeduIpsaDt() {
		return feduIpsaDt;
	}

	public void setFeduIpsaDt(String feduIpsaDt) {
		this.feduIpsaDt = feduIpsaDt;
	}

	public BigDecimal getFeduPayAmt() {
		return feduPayAmt;
	}

	public void setFeduPayAmt(BigDecimal feduPayAmt) {
		this.feduPayAmt = feduPayAmt;
	}

	public Integer getFeduDeptNo() {
		return feduDeptNo;
	}

	public void setFeduDeptNo(Integer feduDeptNo) {
		this.feduDeptNo = feduDeptNo;
	}

	@Override
	public String toString() {
		return "SSMP1001A003InDto [feduEmpNo=" + feduEmpNo + ", feduEmpNm=" + feduEmpNm + ", feduOccpNm=" + feduOccpNm
				+ ", feduMngrEmpNo=" + feduMngrEmpNo + ", feduIpsaDt=" + feduIpsaDt + ", feduPayAmt=" + feduPayAmt
				+ ", feduDeptNo=" + feduDeptNo + "]";
	}
	
	

}
