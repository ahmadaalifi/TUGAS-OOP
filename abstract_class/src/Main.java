public class Main {
    public static void main(String[] args) {
        Customer customer01 = new Customer();
        customer01.NamaCust = "Nopal";
        customer01.Harga = "65.000";
        customer01.Member = "001";
        customer01.caraBayar = "Cash";
        customer01.jenisMobil = "Sedan";

        System.out.println("Nama Customer: " + customer01.NamaCust);
        System.out.println("Harga Paket: " + customer01.Harga);
        System.out.println("Member No: " + customer01.Member);
        System.out.println("Pembayaran: " + customer01.caraBayar);
        System.out.println("Jenis mobil: " + customer01.jenisMobil);
        customer01.Paket1();
        System.out.println();

        Customer customer02 = new Customer();
        customer02.NamaCust = "Asep";
        customer02.Harga = "45.000";
        customer02.Member = "012";
        customer02.caraBayar = "QRIS";
        customer02.jenisMobil = "SUV";

        System.out.println("Nama Customer: " + customer02.NamaCust);
        System.out.println("Harga Paket: " + customer02.Harga);
        System.out.println("Member No: " + customer02.Member);
        System.out.println("Pembayaran: " + customer02.caraBayar);
        System.out.println("Jenis mobil: " + customer02.jenisMobil);
        customer02.Paket2();
        System.out.println();

        Customer customer03 = new Customer();
        customer03.NamaCust = "Joko";
        customer03.Harga = "45.000";
        customer03.Member = "046";
        customer03.caraBayar = "Debit";
        customer03.jenisMobil = "MPV";
        
        System.out.println("Nama Customer: " + customer03.NamaCust);
        System.out.println("Harga Paket: " + customer03.Harga);
        System.out.println("Member No: " + customer03.Member);
        System.out.println("Pembayaran: " + customer03.caraBayar);
        System.out.println("Jenis mobil: " + customer03.jenisMobil);
        customer03.Paket3();
        
    }
}
