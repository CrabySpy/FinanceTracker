package use_case.change_currency;
import java.io.IOException;

public class ViewCurrencyInteractor implements ViewCurrencyInputBoundary {

  private final ViewCurrencyDataAccessInterface dataAccess;
  private final ViewCurrencyOutputBoundary presenter;

  public ViewCurrencyInteractor(ViewCurrencyDataAccessInterface dataAccess, ViewCurrencyOutputBoundary presenter) {
    this.dataAccess = dataAccess;
    this.presenter = presenter;
  }

  @Override
  public void execute(ViewCurrencyInputData inputData) throws IOException {

    String defaultCurrency = dataAccess.getDefaultCurrency(inputData.getProfileID(), inputData.getAccountID());
    if (!defaultCurrency.equals("NaN")) {
      ViewCurrencyOutputData outputData = new ViewCurrencyOutputData(defaultCurrency);
      presenter.prepareSuccessView(outputData);
    } else {
      presenter.prepareFailView("Unable to retrieve currency.");
    }
  }
}
