public class Nilai {
    
    public double NilaiAkhir (double NilaiTubes, double NilaiQuiz, double NilaiTugas, double NilaiUTS, double NilaiUAS) {
        return (0.30 * NilaiTubes) + 
        (0.10 * NilaiQuiz) + 
        (0.10 * NilaiTugas) + 
        (0.25 * NilaiUTS) + 
        (0.25 * NilaiUAS);
    }
}
