package homework;

class IDFormatException extends Exception {
	private static final long serialVersionUID = 7032329917614050189L;

	public IDFormatException(String message) {
		super(message);
	}
}

public class P506 {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {

		if (userID == null) {
			throw new IDFormatException("���̵�� null �� �� �����ϴ�");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������");
		}

		this.userID = userID;
	}

	public static void main(String[] args) {

		P506 test = new P506();
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
