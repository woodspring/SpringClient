package woodspring.springclient.errorexception;

public class SpringError {
	private String errMsg;
	public SpringError(String msg) {
		errMsg = msg;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	@Override
	public String toString() {
		return "CustomErrorType [errMsg=" + errMsg + "]";
	}


}
