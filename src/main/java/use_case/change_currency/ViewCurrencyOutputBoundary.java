package use_case.change_currency;

public interface ViewCurrencyOutputBoundary {
  void prepareSuccessView(ViewCurrencyOutputData outputData);
  void prepareFailView(String error);
}
