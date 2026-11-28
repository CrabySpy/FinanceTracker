package use_case.change_currency;

import java.io.IOException;

public interface ViewCurrencyInputBoundary {
  void execute (ViewCurrencyInputData inputData) throws IOException;
}
