package interface_adapter.change_currency;

import use_case.change_currency.ViewCurrencyInputBoundary;
import use_case.change_currency.ViewCurrencyInputData;

import java.io.IOException;

public class ViewCurrencyController {
  private final ViewCurrencyInputBoundary inputBoundary;

  public ViewCurrencyController(ViewCurrencyInputBoundary inputBoundary) {
    this.inputBoundary = inputBoundary;
  }

  public void execute(int profileID, int accountID) throws IOException {
    ViewCurrencyInputData inputData = new ViewCurrencyInputData(profileID, accountID);
    inputBoundary.execute(inputData);
  }
}
