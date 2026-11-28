package use_case.change_currency;

import java.io.IOException;

public interface GetIDDataAccessInterface {

  public int getProfileID(String profileAccount) throws IOException;

  public int getAccountID(String profileAccount) throws IOException;
}
