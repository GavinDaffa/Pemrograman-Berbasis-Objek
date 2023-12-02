package UTS_Ganjil_1;

import java.io.IOException;

interface Int_barang {
    int stokUpdate();
    void entriData(Barang m) throws IOException;
    void entriData() throws IOException;
    void struk();
}
