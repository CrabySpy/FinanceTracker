package use_case.change_currency;
import java.io.IOException;

public interface GetIDInputDataBoundary {
  void execute(GetIDInputData inputData) throws IOException;
}
