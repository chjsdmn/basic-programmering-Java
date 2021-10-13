package com.prog.objekter2;

class BensinKjøp{
    private String sted;
    private String type;
    private double liter;
    private double pris;
    private String tidspunkt;

    public BensinKjøp(String sted, String type, double liter, double pris, String tidspunkt) {
        this.sted = sted;
        this.type = type;
        this.liter = liter;
        this.pris = pris;
        this.tidspunkt = tidspunkt;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public double finnTotalPrisen(){
        //double total = pris * liter;
        double total = getPris() * getLiter();
        return total;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        BensinKjøp kjøp1 = new BensinKjøp("Storo", "dissel", 10.5, 89.5, "28/09");
        double prisen = kjøp1.finnTotalPrisen();
        System.out.println(String.format("%.2f", prisen));
    }
}
