package interface_adapter.change_currency;

import use_case.change_currency.GetIDInputData;
import use_case.change_currency.GetIDInputDataBoundary;

import java.io.IOException;

public class GetIDController {
  private final GetIDInputDataBoundary inputBoundary;

  public GetIDController(GetIDInputDataBoundary inputBoundary) {
    this.inputBoundary = inputBoundary;
  }

  public void execute (String profileAccount) throws IOException {
    GetIDInputData inputData = new GetIDInputData(profileAccount);
    inputBoundary.execute(inputData);
  }
}
