package igrushki;

import java.io.IOException;
import java.lang.reflect.Array;

public interface LotteryI {
    void raffle() throws IOException;
    void random();
    void FileRW() throws IOException;
}
