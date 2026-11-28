package use_case.change_currency;

import java.io.IOException;

public interface ViewCurrencyDataAccessInterface {

  public String getDefaultCurrency(int profileID, int accountID) throws IOException;

  public int getProfileID(int profileID, int accountID) throws IOException;

  public int getAccountID(int profileID, int accountID) throws IOException;
}
