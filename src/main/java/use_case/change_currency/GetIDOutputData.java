package use_case.change_currency;

public class GetIDOutputData {
  private int profileID;
  private int accountID;

  public GetIDOutputData(int profileID, int accountID) {
    this.profileID = profileID;
    this.accountID = accountID;
  }

  public int getProfileID() {return this.profileID;}

  public int getAccountID() {return this.accountID;}
}
