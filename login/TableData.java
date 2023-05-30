package login;

public class TableData {
	private String id;
	private String name;
	private String phone;
	private String carNum;
	private String status;
	
	public TableData(String[] strArr) {
		this.id = strArr[0];
		this.name = strArr[1];
		this.phone = strArr[2];
		this.carNum = strArr[3];
		this.status = strArr[4];
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}