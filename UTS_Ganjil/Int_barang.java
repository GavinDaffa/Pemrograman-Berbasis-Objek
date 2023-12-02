package UTS_Ganjil;

import java.io.IOException;

public interface Int_barang {
    int stokUpdate();
    void entriData(Barang m) throws IOException;
    void entriData() throws IOException;
    void struk();
}
