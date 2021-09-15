package sample.controller.dto;

public class SAMPLE0001InDto {

	/** FW교육임직원번호 */
	private Integer feduEmpNo;
	
	public Integer getFeduEmpNo() {
		return feduEmpNo;
	}

	public void setFeduEmpNo(Integer feduEmpNo) {
		this.feduEmpNo = feduEmpNo;
	}

	@Override
	public String toString() {
		return "SAMPLE0001InDto [feduEmpNo=" + feduEmpNo + "]";
	}
}
