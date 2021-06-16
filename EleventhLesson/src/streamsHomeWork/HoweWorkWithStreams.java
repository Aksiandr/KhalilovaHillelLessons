package streamsHomeWork;

import java.util.List;
import java.util.Optional;

public class HoweWorkWithStreams {


    public static void main(String[] args) {

        List<Computer> computerList = ComputerCollection.computersList();
        computerList.stream().count();

    }
}
