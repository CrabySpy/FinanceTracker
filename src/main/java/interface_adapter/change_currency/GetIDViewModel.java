package interface_adapter.change_currency;

public class GetIDViewModel {
  private int profileID = 0;
  private int accountID = 0;

  public GetIDViewModel(int profileID, int accountID) {
    this.profileID = profileID;
    this.accountID = accountID;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setAccountID(int accountID) {
    this.accountID = accountID;
  }

  public int getProfileID() {
    return profileID;
  }

  public void setProfileID(int profileID) {
    this.profileID = profileID;
  }

  public boolean isSuccessful() {return !(this.profileID == 0) && !(this.accountID == 0);}
}
